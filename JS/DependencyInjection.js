/**
 * Constructor DependencyInjector
 * @param {Object} - object with dependencies
 */
var DI = function (dependency) {
    this.dependency = dependency;
};

// Should return new function with resolved dependencies
DI.prototype.inject = function (func) {
    var paramNames = getParams(func);
    var params = paramNames.map(function (name) {
        return this.dependency[name];
    }.bind(this));

    var defParams = params.filter(function (p) {
        return typeof(p) !== 'undefined'
    });
    return function () {
        return func.apply(this, defParams);
    }
}

function getParams(f) {
    var fStringify = f.toString();

    var firstIndex = fStringify.indexOf('(') + 1;
    var lastIndex = fStringify.indexOf(')');

    var argums = fStringify.slice(firstIndex, lastIndex);
    return argums.replace(/\s/g, '').split(',');

}
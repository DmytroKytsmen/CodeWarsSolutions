var util = require('util');
String.prototype.toBase64 = function () {
    var converter = new Buffer(this.toString(), 'utf8');
    return converter.toString('base64');
}

String.prototype.fromBase64 = function () {
    var converter = new Buffer(this.toString(), 'base64');
    return converter.toString('utf8');
}
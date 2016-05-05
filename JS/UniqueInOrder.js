var uniqueInOrder = function (iterable) {
    var array = (typeof(iterable) === 'string') ? iterable.split('') : iterable;
    return array.filter(function (el, i, arr) {
        if (el !== arr[i + 1]) return el
    })
}
var FilterString = function (value) {
    var arr = value.split('');
    return parseInt(arr.map(function (a) {
        if (!isNaN(parseInt(a, 10)))
            return parseInt(a)
    }).join(''), 10);
}
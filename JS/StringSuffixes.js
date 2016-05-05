function stringSuffix(s) {
    var suffixes = [];
    for (var i = 0; i < s.length; i++) {
        suffixes.push(s.substr(i));
    }

    return suffixes.map(function (suff) {
        var i = 0;
        while (i < suff.length && suff.charAt(i) == s.charAt(i)) {
            i++;
        }
        return i;
    }).reduce(function (acc, v) {
        return acc + v
    });
}
function pattern(n) {
    var result = [];
    var str = "";
    for (var i = n; i > 0; i--) {
        var output = "";
        for (var j = n; j != i - 1; j--) {
            output = output + j;
        }
        result.push(output);
    }
    return result.join("\n")
}
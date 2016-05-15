function pattern(n) {
    var output = "";
    for (var i = 1; i < n + 1; i = i + 1) {
        var result = [];
        for (var j = 1; j <= i; j++) {
            result = result + "" + i;
        }
        output += result
        if (i < n) {
            output += "\n";
        }
    }
    return output;
}
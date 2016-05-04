function hammingDistance(a, b) {
    var counter = 0;
    for (var i = a.length - 1; i >= 0; i--) {
        if (a.charAt(i) !== b.charAt(i)) {
            counter++;
        }
    }
    return counter;
}
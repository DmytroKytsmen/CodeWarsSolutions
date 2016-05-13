function defaultExample(x, y = 7) {
    return x + y;
}

function restExample(x, ...y) {
    return x * y.length;
}

function spreadExample(...x) {
    return x[0] + x[1] + x[2];
}
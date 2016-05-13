function* generator(a) {
    var a = a;
    var b = 1;
    while (true) {
        var result = a + " x " + b + " = " + a * b;
        b++;
        yield result;
    }
}
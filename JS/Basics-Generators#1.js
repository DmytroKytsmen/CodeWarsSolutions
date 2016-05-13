function* generator() {
    var counter = 0;
    while (true) {
        var reset = yield ++counter;
        if (reset)
            counter = --reset;
    }
}
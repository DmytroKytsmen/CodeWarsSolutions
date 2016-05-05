Math.round = function (number) {
    return Math.floor(number) + (Math.fraction(number) >= 0.5);
};

Math.fraction = function (number) {
    return number - Math.floor(number);
}

Math.ceil = function (number) {
    return Math.floor(number) + !!(Math.fraction(number));
};

Math.floor = function (number) {
    return ~~number;
};
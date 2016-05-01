function accum(s) {
    return s.split('').map(function (el, i) {
        return `${el.toUpperCase()}${printer(el.toLowerCase(), i)}`
    }).join('-');
}

function printer(char, times) {
    var result = '';
    while (times) {
        result += char;
        times--;
    }
    return result;
}
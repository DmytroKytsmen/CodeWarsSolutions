function addLength(str) {
    return str.split(' ').map(function (word) {
        return word + ' ' + word.length;
    });
}
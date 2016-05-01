function stringy(size) {
    if (size == 1) {
        return '1';
    }
    if (size < 1) {
        return ""
    }
    return '10' + stringy(size - 2);
}
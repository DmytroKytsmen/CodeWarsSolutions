function isValidIP(str) {
    var arr = str.split('.');
    if(arr.length == 4) {
        return validLen = arr.filter(function(x) {
                return x !== (+x).toString() ? false : x>=0 && x<=255 ? true : false;
            }).length == arr.length;
    }
    return false;
}
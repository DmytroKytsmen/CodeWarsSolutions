function noBoringZeros(n) {
    if(n == 0){
        return n;
    }
    return parseInt(n.toString().replace(/0+$/, ""));
}
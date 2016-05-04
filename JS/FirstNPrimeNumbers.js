function Primes(n) {

}


Primes.first = function (n) {


    var status = true;
    var num = 3;

    var array = []
    if (n >= 1) {
        array.push(2);
    }
    for (var i = 2; i <= n;) {
        for (var j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) {
                status = false;
                break;
            }
        }
        if (status) {
            array.push(num);
            i++;
        }
        status = true;
        num++;
    }
    return array;
}
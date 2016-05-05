function divisors(integer) {
    var res = []
    for (var i = 2; i <= Math.round(integer / 2); ++i)
        if (integer % i == 0)
            res.push(i);
    return res.length ? res : integer + ' is prime'
};
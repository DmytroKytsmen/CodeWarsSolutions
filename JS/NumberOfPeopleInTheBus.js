var number = function (busStops) {
    var counter = 0;
    for (var i = 0; i < busStops.length; i++) {
        counter += busStops[i][0] - busStops[i][1];
    }
    return counter
}
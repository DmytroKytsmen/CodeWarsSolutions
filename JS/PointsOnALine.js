function onLine(points) {
    if (points.length < 3){
        return true;
    }

    var x = points.shift();
    var a = undefined;
    return points.
        filter((y) => !(x[0] == y[0] && x[1] == y[1])).
    map((y) => a = (x[0] - y[0])/(x[1] - y[1])).
    every((y) => y == a );

}
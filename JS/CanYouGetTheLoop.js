function loop_size(node) {
    var firstNode = node;
    var secondNode = node;
    var goOn = true
    do {
        firstNode = firstNode.next;
        secondNode = secondNode.next.next;
    }
    while (firstNode !== secondNode)
    var counter = 0;
    do {
        secondNode = secondNode.next;
        counter++;
    }
    while (firstNode !== secondNode)
    return counter;
}

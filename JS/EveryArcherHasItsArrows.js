function archersReady(archers) {
    return archers.length == 0 ? false : archers.every(archer => archer > 4);
}
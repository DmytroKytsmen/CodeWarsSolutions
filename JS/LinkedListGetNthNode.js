function Node(data) {
    this.data = data;
    this.next = null;
}

function getNth(node, index) {
    if (index == 0) {
        if (node == null) throw Error();
        return node;
    }
    return getNth(node.next, index - 1);
}
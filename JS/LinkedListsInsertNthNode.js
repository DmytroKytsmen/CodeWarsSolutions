function Node(data) {
    this.data = data;
    this.next = null;
}

function insertNth(head, index, data) {
    var dummy = new Node();
    dummy.next = head;

    var runner = dummy;
    for (var i = 0; i < index; i++) {
        runner = runner.next;
    }

    var node = new Node();
    node.data = data;
    node.next = runner.next;
    runner.next = node;

    return dummy.next;
}
function Node(data) {
    this.data = data;
    this.next = null;
}

function removeDuplicates(head) {
    if (head == null || head.next == null)
        return head;

    var p = head;

    while (p != null && p.next != null) {
        if (p.data == p.next.data) {
            p.next = p.next.next;
        } else {
            p = p.next;
        }
    }

    return head;
}
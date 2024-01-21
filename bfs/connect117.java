import org.w3c.dom.Node;

class connect117 {
    public Node connect(Node root) {
        Node head = root;
        while (head != null) {
            Node tempChild = new Node();
            Node currentChild = tempChild;

            while (head != null) {
                if (head.left != null) {
                    currentChild.next = head.left;
                    currentChild = currentChild.next;
                }
                if (head.right != null) {
                    currentChild.next = head.right;
                    currentChild = currentChild.next;
                }
                head = head.next;
            }
            head = tempChild.next;
        }
        return root;
    }
}
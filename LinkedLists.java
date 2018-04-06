public class LinkedLists {
    public static void main(String[] args) {
        // Create a LinkedList that's in ascending order
        LinkedList list = new LinkedList();
        list.addStart(28);
        list.addStart(25);
        list.addStart(25);
        list.addStart(22);
        list.addStart(19);
        list.addStart(17);
        list.addStart(17);
        list.addStart(17);
        list.addStart(15);
        list.addStart(15);
        list.addStart(15);
        list.addStart(13);
        list.addStart(13);
        
        System.out.println("Original list: " + list.toString());
        list.simplify();
        System.out.println("After calling simplify(): " + list.toString());
    }
}

class LinkedList {
    private Node top;

    public LinkedList() {
        top = null;
    }

    public void addStart(int newItem) {
        Node newNode = new Node(newItem, top);
        top = newNode;
    }

    public String toString() {
        String answer = "<< ";

        Node next = top;
        while (next != null) {
            answer += next.getData() + " ";
            next = next.getLink();
        }

        return answer + ">>";
    }

    /**
     * Removes duplicates from the list.
     */
    public void simplify() {
        Node curr = top;
        while (curr.getLink() != null) {
            if (curr.getData() == curr.getLink().getData()) {
                // Duplicate found, remove it
                curr.setLink(curr.getLink().getLink());
            }
            else {
                // If the current item has no more duplicates, move to the next item
                curr = curr.getLink();
            }
        }
    }
}

class Node {
    private int data;
    private Node link;

    public Node(int initData, Node initLink) {
        data = initData;
        link = initLink;
    }

    public int getData() {
        return data;
    }

    public Node getLink() {
        return link;
    }

    public void setData(int d) {
        data = d;
    }

    public void setLink(Node n) {
        link = n;
    }
}
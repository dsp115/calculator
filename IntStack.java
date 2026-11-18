public class intStack {
    Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int item) {
        top = new Node(item, top);
    }
    public int pop {
        if(isEmpty()) {
            throw new RuntimeException("stack is empty");
        }

        int saved = top.item;
        top = top.next;
        return saved;
    }
}
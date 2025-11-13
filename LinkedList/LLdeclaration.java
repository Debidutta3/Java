package LinkedList;

public class LLdeclaration {
    static public class CustomLL {

        private Node head;
        private Node tail;
        private int size;

        public CustomLL() {
            this.size = 0;
        }

        private class Node {

            private int value;
            private Node next;

            public Node(int value) {
                this.value = value;
            }

            public Node(int value, Node next) {
                this.value = value;
                this.next = next;
            }
        }

        // Add an item in LL
        public void insertFirst(int val) {
            Node node = new Node(val); //Node creation
            node.next = head;
            head = node;

            if (tail == null) {
                tail = head;
            }
            size++;
        }

        //Add an item in the last
        public void insertLast(int val){

            if(tail == null){
                insertFirst(val);
                return;
            }
            Node node = new Node(val);  
            tail.next=node;
            tail=node;      
            size++;
        }

        //Add element at any index
        public void insert(int val, int index){
            if(index == 0){
                insertFirst(val);
                return;
            }
            if(index == size){
                insertLast(val);
                return;
            }

            Node temp = head;

            for(int i=1; i<index; i++){
                temp = temp.next;
            }
            Node node = new Node(val,temp.next);
            temp.next = node;

            size++;
        }

        //Display the Linked List
        public void display(){
            Node temp=head;

            while(temp != null){
                System.out.print(temp.value + "->");
                temp=temp.next;
            }
            System.err.println("End");
        }
    }

    public static void main(String[] args) {
        CustomLL obj = new CustomLL();

        obj.insertFirst(0);
        obj.insertFirst(1);
        obj.insertFirst(2);
        obj.insertFirst(3);
        obj.insertFirst(4);
        obj.insertLast(5);
        obj.insert(20, 2);
        obj.display();

    }

}
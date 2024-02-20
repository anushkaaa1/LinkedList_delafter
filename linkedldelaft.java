public class linkedldelaft {
    Node tail,head;

    public linkedldelaft(){
        head = tail = null;
    }
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void create(int value){
        Node n = new Node(value);
        if(head == null)
           tail = head = n;
        else{
            tail.next = n;
            tail = n;
        }
    }
    public void print(Node head){
        if(head==null)
           System.out.println("list is empty");
        else{
            while(head!=null){
                System.out.println(head.data);
                head = head.next;
            }
        }
    }
    public void delafter(int posele){
        if(head==null)
           System.out.println("deletion not possible");
        else{
            Node temp = head;
            while (temp!=null) {
                if(temp.data==posele)
                    break;
                temp = temp.next;
            }
            if(temp==null)
                System.out.println("element not found");
            else if(temp.next==null)
                System.out.println("element found at last position deletion not possible");
            else
               temp.next = temp.next.next;
        }
    }
    public static void main(String args[]){
        linkedldelaft l = new linkedldelaft();
        l.create(1);
        l.create(2);
        l.create(3);
        l.print(l.head);
        System.out.println();
        l.delafter(2);
        l.print(l.head);
    }
}

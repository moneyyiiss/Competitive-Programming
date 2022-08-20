// 1. You are given a partially written LinkedList class.
// 2. Here is a list of existing functions:
//    2.1 addLast - adds a new element with given value to the end of Linked List
// 3. You are required to complete the body of display function and size function
//    3.1. display - Should print the elements of linked list from front to end in a single line. Elements should be separated by space.
//    3.2. size - Should return the number of elements in the linked list.
// 4. Input and Output is managed for you.
// Sample Input
// addLast 10
// addLast 20
// addLast 30
// display
// size
// addLast 40
// addLast 50
// display
// size
// quit
// Sample Output
// 10 20 30 
// 3
// 10 20 30 40 50 
// 5


import java.io.BufferedReader;
import java.io.InputStreamReader;

class DisplayLinkedList{
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        void addLast(int val){
            if(size == 0){
                Node temp = new Node();
                temp.data = val;
                temp.next = null;
                head = tail = temp;
                size++;
            }else{
                Node temp = new Node();
                temp.data = val;
                temp.next = null;
                tail.next = temp;
                tail = temp;
                size++;
            }
        }
        //size print
        public int size(){
            return size;
        }
        //display print
        public void display(){
            
            Node temp = head;
            while(temp!= null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }




    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList list = new LinkedList();

        String str = br.readLine();
        while(str.equals("quit") == false){
            if(str.startsWith("addLast")){
                int val = Integer.parseInt(str.split(" ")[1]);
                list.addLast(val);
            }else if(str.startsWith("size")){
                System.out.println(list.size());
            }else if(str.startsWith("display")){
                list.display();
            }
            str = br.readLine();
        }
    }

}
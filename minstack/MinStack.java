package minstack;


public class MinStack {
    private Node head;
    private Node min; 
    private class Node{
        int data; 
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public MinStack() {}
    
    public void push(int val) {
        Node node = new Node(val);
        if(head == null){
            head = node;
            min = node;
        }else{
            node.next = head;
            head = node; 
            if(val <= min.data){
                Node minNode = new Node(val);
                minNode.next = min;
                min = minNode; 
            }
        }
    }

    public void pop() {
        if(head!=null){
            if(head.data == min.data){
                min = min.next; 
            }
            head = head.next; 
        }
    }
    
    public int top() {
        if(head != null){
            return head.data;
        }
        throw new IllegalStateException();
    }
    
    public int getMin() {
        if(min != null){
            return min.data;
        }
        throw new IllegalStateException();
    }  
    public static void main(String [] args){
        MinStack stack = new MinStack();
        stack.push(2147483646);
        stack.push(2147483646);
        stack.push(2147483647);
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
        stack.pop();
        stack.push(2147483647);
        System.out.println(stack.top());
        System.out.println(stack.getMin());
        stack.push(-2147483648);
        System.out.println(stack.top());
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
        

    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

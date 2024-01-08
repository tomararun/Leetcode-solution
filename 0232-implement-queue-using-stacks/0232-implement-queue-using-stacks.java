class MyQueue {
    private Stack<Integer> data ;
    public MyQueue() {
        data = new Stack<Integer>();
    }
    
    public void push(int x) {
        data.push(x);
    }
    
    public int pop() {
        Stack<Integer> temp = new Stack<Integer>();
        while(this.data.size() !=1){
            temp.push(this.data.pop());
        }
        int y = this.data.pop();
        while(temp.size()!=0){
            data.push(temp.pop());
        }
        return y;
    }
    
    public int peek() {
        Stack<Integer> temp = new Stack<Integer>();
        while(this.data.size() !=1){
            temp.push(this.data.pop());
        }
        int y = this.data.peek();
        while(temp.size()!=0){
            data.push(temp.pop());
        }
        return y;
    }
    
    public boolean empty() {
        return data.isEmpty();
    }
}
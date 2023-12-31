class MyCircularQueue {
      int[] a;
    int f,r,n;
    public MyCircularQueue(int k) {
        a=new int[k];
        f=-1;
        r=-1;
        n=k;
    }
    
    public boolean enQueue(int value) {
        if(isFull())return false;
        r=(r+1)%n;
        a[r]=value;
        if(f==-1)f=0;
        return true;
    }
    
    public boolean deQueue() {
       if(isEmpty())return false;
        if(f==r)f=r=-1;
        else f=(f+1)%n;
        return true; 
    }
    
    public int Front() {
         return isEmpty()?-1:a[f];
    }
    
    public int Rear() {
       return isEmpty()?-1:a[r]; 
    }
    
    public boolean isEmpty() {
        return f==-1?true:false;
    }
    
    public boolean isFull() {
        return ((r+1)%n==f)?true:false;
    }
}


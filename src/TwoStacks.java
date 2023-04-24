import java.util.Arrays;

public class TwoStacks {
    private int capacity;
    private int [] array;
    private int top1;
    private int top2;

    public TwoStacks(int capacity){
        this.capacity = capacity;
        this.array = new int[capacity];
        this.top1 = -1;
        this.top2 = capacity;
    }

    public void push1(int item){
        if(isFull1())
            throw new StackOverflowError();
        array[++top1] = item;
    }
    public void push2(int item){
        if (isFull2())
            throw new StackOverflowError();
        array[--top2] = item;
    }
    public int pop1(){
        if (isEmpty1())
            throw new IllegalStateException();
        int value = array[top1];
        top1--;
        return value;
    }
    public int pop2(){
        if (isEmpty2())
            throw new IllegalStateException();
        int value = array[top2];
        top2++;
        return 0;
    }
    public boolean isEmpty1(){
        return top1 == -1;
    }
    public boolean isEmpty2(){
        return top2 == capacity;
    }
    public boolean isFull1(){
        return top1+1 == top2;
    }
    public boolean isFull2(){
        return top2-1 == top1;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}

import java.util.Arrays;

public class Stack {
    private int [] items = new int[5];
    private int count;

    public void push(int item){
        if (count == items.length)
                throw new StackOverflowError();

        items[count++] = item;
    }
    public int pop(){
        return items[--count];
    }
    public int peak(){
        return items[count-1];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    @Override
    public String toString() {
        int[] content = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(content) ;
    }
}

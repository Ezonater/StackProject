import java.util.EmptyStackException;

public class Stack {
    private Integer[] stack = new Integer[100];

    public Stack(){
    }

    public Stack(Integer add){
        this.stack[0] = add;
    }

    public int size(){
        int runningSize = 0;
        for (Integer next :
                stack) {
            if(next!=null){
                runningSize++;
            }
        }
        return runningSize;
    }

    public Integer pop(){
        if(this.size() <= 0){
            throw new EmptyStackException();
        }
        if(this.size() == 1){
            Integer pop = stack[0];
            stack[0] = null;
            return pop;
        }
        Integer pop = stack[0];
        for (int i = 1; i < this.size(); i++) {
            stack[i-1] = stack[i];
        }
        stack[this.size()-1] = null;
        return pop;
    }

    public void push(Integer value){
        if(isFull()){
            throw new RuntimeException();
        }
        if(isEmpty()){
            stack[0] = value;
            return;
        }
        for (int i = this.size(); i > 0; i--) {
            stack[i] = stack[i-1];
        }
        stack[0] = value;
    }

    public Integer peek(int position){
        return stack[position];
    }

    public boolean isEmpty(){
        return stack[0] == null;
    }

    public boolean isFull(){
        return stack[this.size()] != null;
    }

    public String toString(){
        String stackString = "[";
        int thissize = this.size();
        for (int i = 0; i < this.size(); i++) {
            if(i == this.size()-1){
                stackString += stack[i] + "]";
            }
            else{
                stackString += stack[i] + "], [";
            }
        }
        return stackString;
    }
}

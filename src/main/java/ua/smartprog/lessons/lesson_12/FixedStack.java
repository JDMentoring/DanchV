package ua.smartprog.lessons.lesson_12;

public class FixedStack implements IntStack {
    private int stck[];
    private int top;

    FixedStack(int size){
        stck = new int[size];
        top = -1;
    }

    public void push(int item) {
        if(top==stck.length-1){
            System.out.println("Стек переповнений");
        }else{
            stck[++top] = item;
        }
    }

    public int pop() {
        if (top < 0){
            System.out.println("Стек порожній");
            return 0;
        }else{
            return stck[top--];
        }
    }

    public int getSize(){
        return stck.length;
    }

}

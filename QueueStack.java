public class QueueStack {

    int[] stack1;
    int[] stack2;

    int top1=-1;
    int top2=-1;


    QueueStack(int size1){
        stack1=new int[size1];
        stack2 =new int[size1];
    }

    public void push(int element){
       stack1[++top1]=element;
    }

    public int pop1(){
        return stack1[top1--];
    }
    public int pop2(){
        return stack2[top2--];
    }


    public int pop(){
        while(!isEmpty(top1)){
            stack2[++top2]=pop1();
        }

        int temp =pop2();

        while(!isEmpty(top2)){
            push(pop2());
        }
        return temp;

    }
    public boolean isEmpty(int n){
        if(n<0){
            return true;
        }
        return false;
    }
   
    





}

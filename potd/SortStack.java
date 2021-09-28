package potd;

import java.util.*;

public class SortStack {
    public static Stack<Integer> sortstack(Stack<Integer> input){
        Stack<Integer> resSt = new Stack<>();
        Integer t;
        while(!input.isEmpty()){
            t = input.pop();
            while(!resSt.isEmpty() && resSt.peek()>t){
                input.push(resSt.pop());
            }
            resSt.push(t);
        }
        return resSt;
    }
    public static void main(String[] args) {
        
    }
}

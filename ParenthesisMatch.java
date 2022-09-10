/*
Test: [A+25*{Y*(B+C-X)-K}/D*(E+13)+M]

1 [
[

2 [ {
[A + 25 * {

3 [ { (
[A + 25 * { Y * (

4 [ {
[A + 25 * { Y * ( B + C - X )

5 [
[A + 25 * { Y * ( B + C - X ) - K }

6 [ (
[A + 25 * { Y * ( B + C - X ) - K }/ D *

7 [
[A + 25 * { Y * ( B + C - X ) - K }/ D * ( E + 13 )

8
[A + 25 * { Y * ( B + C - X ) - K }/ D * ( E + 13 )+ M ]
*/

//Solution;

import java.util.Stack;

public class ParenthesisMatch{
    
    public static boolean isParenthesisMatch(String str){
        if(str.isEmpty()){
            return true;
        }
        
        Stack<String> stack = new Stack<String>();
        String[] strArray = str.split("");
        for(int i=0;i<strArray.length;i++){
            
            String first = strArray[i];
            
            if(first.equals("{") || first.equals("(") || first.equals("[")){
                stack.push(first);
            }
            if(first.equals("}") || first.equals(")") || first.equals("]")){
                if(stack.isEmpty()){
                    return false;
                }
                
                String last = stack.peek();
                
                if(first.equals("}") && last.equals("{") ||
                   first.equals(")") && last.equals("(") ||
                   first.equals("]") && last.equals("[")){
                       stack.pop();
                   }else{
                       return false;
                   }
            }
        }
        return stack.isEmpty();
    }
    
    public static void main(String[] args){
        System.out.println(isParenthesisMatch("({})"));
        System.out.println(isParenthesisMatch("({(}))"));
    }
}

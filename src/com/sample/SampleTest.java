package com.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class SampleTest {

	public static void main(String[] args) {
		String[] ss = {"{}[]()","[](){()}"};
		
System.out.println(Arrays.toString(isBalanced(ss)));
		
		
	}
	static String[] isBalanced(String[] s1) {
		List<String> balLst = new ArrayList<>();
    for (String braces : s1) {
        
    Stack<Character> chStack = new Stack<>();
    String balanced = "YES";
    String notBalanced = "NO";
    boolean balancedwer = true;
    for(int i=0; i<braces.length(); i++){
        char chArray = braces.charAt(i);
        if(chArray == '{' || chArray == '[' || chArray == '('){
        	chStack.push(chArray);
            continue;
        }
         
        if(chArray == ')'){
            if(!chStack.isEmpty() && chStack.peek() == '('){
            	chStack.pop();
            }else{
                balancedwer = false;
                break;
            }
        }
        if(chArray == ']'){
            if(!chStack.isEmpty() && chStack.peek() == '['){
            	chStack.pop();
            }else{
                balancedwer = false;
                break;
            }
        }
        if(chArray == '}'){
            if(!chStack.isEmpty() && chStack.peek() == '{'){
            	chStack.pop();
            }else{
                balancedwer = false;
                break;
            }
        }
        

    }
    if(!chStack.isEmpty()){
            balancedwer = false;
        }
        if(balancedwer)
            balLst.add(balanced);
       // return balanced;
        else
            balLst.add(notBalanced);
    //    return no;
    }
    return balLst.toArray(new String[0]);
}
}

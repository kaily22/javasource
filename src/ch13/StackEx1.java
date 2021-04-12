package ch13;

import java.util.Stack;

/*
 * Stack
 * 마지막에 저장한 데이어트를 가장 먼저 꺼내는 LIFO(후입선출) 구조
 * pop : 객체를 꺼낼 때
 * push : 객체를 넣을 때 
 * 
 * 수식 계산, 수식 괄혹 검사, 워드 프로세서 undo/redo
 * 웹 브라우저 뒤로/앞으로 기능
 */

public class StackEx1 {
 public static void main(String[] args) {
    Stack<String> stack = new Stack<String>();
    
    stack.push("사과"); 
    stack.push("딸기"); 
    stack.push("바나나"); 
    stack.push("수박"); 
    
    while(!stack.empty()) {
       System.out.println(stack.pop());
       
    } 
 
 }

}

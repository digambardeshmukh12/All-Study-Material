package datastructures;

import java.util.LinkedList;
import java.util.Scanner;

interface Queue {
    void enqueue(int element);
    int dequeue();
    int peek();
    boolean isEmpty();
    int size();
     void show();
}

 interface Stack {
    void push(int element);
    int pop();
    int peek();
    boolean isEmpty();
    int size();
    void show();
}

public class StackQueueImplementation implements Stack, Queue {
     LinkedList<Integer> list;

     StackQueueImplementation() {
        list = new LinkedList<>();
    }

    @Override
    public void push(int element) {
        list.push(element);
        
    }

    @Override
    public int pop() {
        return list.pop();
    }

    @Override
    public int peek() {
        return list.peek();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void enqueue(int element) {
        list.addLast(element);
    }

    @Override
    public int dequeue() {
        return list.poll();
    }
    @Override
    public void show() {
    	System.out.println(list);
    }
    
    public static void main(String [] args){
    	StackQueueImplementation obj1 = new StackQueueImplementation();
    	StackQueueImplementation obj2 = new StackQueueImplementation();
        Scanner sc = new Scanner(System.in);
        int a ,b , x , y ;
        System.out.println("Chooes Choice \n 1.Create Queue \n 2.Create Stack  3.Exit");
         System.out.println("Enter a choice ");
         a = sc.nextInt();
//         int x , y;
         boolean mystat = true ;
         while(mystat) {
 		switch(a) {
         case 1 :
        	 System.out.println("Chooes Choice \n 1.Enqueue \n 2.Dequeue \n 3.peek \n 4.Check empty or not \n 5.size \n 6.show \n 7.Exit");
        	 System.out.println("Enter choice");
        	 b = sc.nextInt();
        	 
        	switch(b) {
        	case 1 :
        		System.out.println("How many numbers you want to add in Queue");
        		y = sc.nextInt();
        		for(int i = 0;i<y;i++) {
        			System.out.println("Enter number ");
            		x = sc.nextInt();
            		obj1.enqueue(x);
        		}
        		obj1.show();
        		break;
        	case 2 :
        		System.out.println("Removed number "+obj1.dequeue());
        		break;
        	case 3 :
        		System.out.println("Peek is "+obj1.peek());
        		break;
        	case 4 :
        		System.out.println(obj1.isEmpty());
        		break;
        		
        	case 5 :
        		System.out.println("Size is"+obj1.size());
        		break;
        	case 6 :
        		obj1.show();
        		break;
        	case 7 :
        		 System.out.println("Thank you ");
        		mystat = false;
        		break;
        	}
        	
        	break;
         case 2 :
        	 System.out.println("Chooes Choice \n 1.push \n 2.pop \n 3.peek \n 4.Check empty or not \n 5.size \n 6.show \n 7.Exit");
        	 System.out.println("Enter choice");
        	 b = sc.nextInt();
        	switch(b) {
        	case 1 :
        		System.out.println("How many numbers you want to add in Stack");
        		y = sc.nextInt();
        		for(int i = 0;i<=y;i++) {
        		System.out.println("Enter number ");
        		x = sc.nextInt();
        		obj2.push(x);
        		}
        		obj2.show();
        		break;
        	case 2 :
        		System.out.println("Removed number "+obj2.pop());
        		break;
        	case 3 :
        		System.out.println("Peek is "+obj2.peek());
        		break;
        	case 4 :
        		System.out.println(obj2.isEmpty());
        		break;
        		
        	case 5 :
        		System.out.println("Size is "+obj2.size());
        		break;
        	case 6 :
        		obj2.show();
        		break;
        	case 7 :
        		 System.out.println("Thank you ");
        		mystat = false;
        		break;
        	}
        	break;
        	
         case 3 :
        	 System.out.println("Thank you ");
        	 mystat = false;
        	 break;
         }
         }
         
    }
    
}
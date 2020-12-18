package com.info.graph;

import java.util.Stack;

public class QueenPractice {
	
public static Stack<Integer> s = new Stack<Integer>();
public static int n ; 
public static int total; 
public static int i; 
public static int Q; 

//finds and prints out all solutions to the n-queens problem
public static int solve(int n) {

 // i goes through each row to place a queen
  // x goes through the columns within each row 

  for(int i = 0; i <n; i++) {

      for(int x = 0; x<n; x++){

        if(conflict(x) == false){ // loop through each column and checks whether it conflicts with current position of queen

            s.push(x); // no conflict, push x 

            Q = s.get(x); // set current position of queen
            break; //break out of loop to move on to next row, i++ 

            }

        else if (conflict(x)==true){
            if(s.isEmpty() == true){
                break; 
            }

            if(x==n-1){ // if its looped through all columns, and there's no valid position
                s.pop(); //pop last entry 
                i= -1; // and backtrack to previous row, to find another valid position for q in previous row 
            } 

        }

        if (s.size()==n){ // if stack size is n, then stack is full and a solution has been found
            total++; 
            System.out.print(s);// print solution 
            s.pop();
            i= - 1; //backtrack to find next solution
  }
        }

} 
  return total; 
}

public static boolean conflict(int k) {


if (Q==k|| (k-Q)== (i-(i-1))|| (Q-k)== (i-(i-1)) || k == s.pop()) { 

        return false; //there is a conflict!! k 

}
return true; //is conflict
}


//this method prints out a solution from the current stack
//(you should not need to modify this method)
private static void printSolution(Stack<Integer> s) {
for (int i = 0; i < s.size(); i ++) {
  for (int j = 0; j < s.size(); j ++) {
    if (j == s.get(i))
      System.out.print("Q ");
    else
      System.out.print("* ");
  }//for
  System.out.println();
}//for
System.out.println();  
}//printSolution()

// ----- the main method -----
// (you shouldn't need to change this method)
public static void main(String[] args) {

int n = 8;

// pass in parameter n from command line
if (args.length == 1) {
n = Integer.parseInt(args[0].trim());
if (n < 1) {
  System.out.println("Incorrect parameter");
  System.exit(-1);
}//if   
}//if

int number = solve(n);
System.out.println("There are " + number + " solutions to the " + n + "-queens problem.");
}//main()

}

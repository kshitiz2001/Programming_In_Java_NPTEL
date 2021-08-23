'''Complete the code segment to call the method  print() of class given class Printer to print the following.'''
--------------------------------
Hi! I am class STUDENT
Hi! I class SCHOOL.
--------------------------------
  
  
class Printer { 
    public void print() { 
		System.out.println("Hi! I class SCHOOL."); 
    } 
    public void print(String s) { 
		System.out.println(s); 
    } 
} 

public class Question22{ 
    public static void main(String[] args) {    

Printer p1 = new Printer();
p1.print("Hi! I am class STUDENT");
p1.print();
    }
}


// by kshitiz

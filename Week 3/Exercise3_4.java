'''This program to exercise the call of static and non-static methods. A partial code is given defining two methods, namely sum( ) and multiply ( ).
'''You have to call these methods to find the sum and product of two numbers.'''  
  
  
  import java.util.Scanner;
class QuestionScope {
int sum(int a, int b){ 
        return a + b;
    }
static int multiply(int a, int b){
        return a * b;
    }
}
public class Exercise3_4{
public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();

QuestionScope q = new QuestionScope();
	int sum;
	sum= q.sum(n1,n2);
	int multy= q.multiply(n1,n2);
	System.out.println(sum);
	System.out.print(multy);
	}
}


// by kshitiz

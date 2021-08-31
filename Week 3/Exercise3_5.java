'''Complete the code segment to swap two numbers using call by object reference.'''
  
  
  import java.util.Scanner;
class Question {
  Scanner sc = new Scanner(System.in);
int e1 = sc.nextInt();
int e2 = sc.nextInt();
}
public class Exercise3_5{


static void swap(Question q)
{
	int temp;
	temp = q.e1;
	q.e1 = q.e2;
	q.e2 = temp;
}
public static void main(String[] args) {
	Question t = new Question ();
swap(t);

System.out.println(t.e1+" "+t.e2);    
  }

}


// by kshitiz

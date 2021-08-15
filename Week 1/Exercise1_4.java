'''Complete the code segment to check whether the number is an Armstrong number or not.'''

'''Armstrong Number:'''

'''A positive number is called an Armstrong number if it is equal to the sum of cubes of its digits for example 153 = 13+53+33, 370, 371, 407, etc.'''
  
  
  import java.util.Scanner;
public class Exercise1_4 {
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
           int result=0;
		int remainder,temp,count=0,i;
		temp=n;
		while(temp!=0)
		{
			temp/=10;
			count++;
		}
		i=count;
		temp=n;
		while(count>0)
		{
			remainder=temp%10;
			result += Math.pow(remainder, i);
			temp/=10;
			count--;
		}
		if(n==result)
			result=1;
		else
			result=0;

		System.out.print(result);

	}
}


// by kshitiz

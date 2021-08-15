'''Complete the code segment to help Ragav , find the highest mark and average mark secured by him in "s" number of subjects.'''
  
  
  import java.util.Scanner;
public class Exercise1_5{
    public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
         double mark_avg;
         int result;
         int i;
         int s;
       s = input.nextInt();
      int[] arr = new int[s];   
      for(i=0;i<arr.length;i++)
	  {
	arr[i]=input.nextInt();
        }
       result=arr[0];
int avg=arr[0];
for (i=1;i<arr.length;i++){
avg=avg+arr[i];
  if(arr[i]>result)
    result=arr[i];
}
mark_avg=avg/arr.length;
System.out.print(result+"\n"+mark_avg);
      
    }
}


// by kshitiz

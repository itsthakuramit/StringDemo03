
public class Q1 {

	public static void main(String[] args) {
				
				String s="select empname,empcity from emp.txt where empcity=hyderabad";
				String arr[]=s.split(" ");
				
				System.out.print(arr[arr.length-1]);


		}
}
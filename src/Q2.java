
public class Q2 {

	public static void main(String[] args) {
		
		String s1=" select empname,empcity from emp.txt where empcity=hyderabad and empsalary>50000";
		String arr1[]= s1.split("where");
		
		String s2= arr1[1];		
		String arr2[]= s2.split("and");
		System.out.print(arr2[0]+"\n"+arr2[1]);
	}

}

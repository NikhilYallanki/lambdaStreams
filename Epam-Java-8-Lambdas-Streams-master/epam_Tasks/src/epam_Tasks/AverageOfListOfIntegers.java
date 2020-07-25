
package epam_Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfListOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		List<Integer> list=new ArrayList<Integer>();
		int n=10;
		
		for(int i=0;i<n;i++) {
			list.add(i);
		}
		
		Operations operation=new Operations();
		
		System.out.println(operation.CalculateAverage(list));
		
		sc.close();
	}

}

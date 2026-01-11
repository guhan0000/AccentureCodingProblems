import java.util.*;
public class Solution {
	public static List<Integer> gradingStudents(List<Integer> grades) {
	    // Write your code here
	   
	    return grades;
	
		
	}
	public static void main(String[] args) {
		List<Integer> grades=new ArrayList<>();
		grades.add(73);
		grades.add(67);		
		grades.add(38);
		grades.add(33);	
		grades.set(0, 75);
		System.out.println(gradingStudents(grades));
		
	}

}

package Application;

import java.util.Arrays;

public class Application2 {

	public static void main(String[] args) {
		Student[] subArray= {new Student(1,"name1",21,99.03),
				new Student(2,"name02",19,88.01),
				new Student(3,"name03",21,87.01),
				new Student(4,"name04",25,92.01)};
	
		Arrays.sort(subArray);
		
		for (Student student : subArray) {
			System.out.println(student);
		}

	}

}

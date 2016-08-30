package ssa;

import java.util.ArrayList;
import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Student implements Comparable {
	
static ArrayList<Student> classRoster = new ArrayList<Student>();

public String id;
public String firstName;
public String lastName;
public String eyeColor;
public int monthsEmployed;

public Student() {
	loadStudents();
}

public Student(String id, String firstName, String lastName, String eyeColor, int monthsEmployed){
	this.id= id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.eyeColor = eyeColor;
	this.monthsEmployed = monthsEmployed;
	
	
}

public void printStudents() {
	printRosterHeader();
		Collections.sort(classRoster, studentNameComparator);
	for(Student student : classRoster) {
		
		studentInfo(student);
		
		
	}
}

public void loadStudents() {
	classRoster.add(new Student("001122", "Michael", "Clair", "other", 12));
	classRoster.add(new Student("001212", "Stephen", "Rook", "Brown", 11));
	classRoster.add(new Student("474143", "Jonathan", "Stafford", "Brown", 13));
	classRoster.add(new Student("005295", "Kyle", "Deen", "Blue", 2));
	classRoster.add(new Student("004400", "Kevin", "Tran", "other", 12));
	classRoster.add(new Student("132617", "Reuben", "Turner", "Blue", 12));
	classRoster.add(new Student("306700", "Li", "Lui", "Brown", 12));
	classRoster.add(new Student("215296", "Joshua", "Franey", "other", 27));
	classRoster.add(new Student("523420", "Gabriel", "Hamilton", "Black", 10));
	classRoster.add(new Student("004014", "Aisha", "Covington", "Brown", 10));
	classRoster.add(new Student("006789", "Arun", "Soma", "Brown", 2));
	classRoster.add(new Student("009999", "Steve", "Ellwood", "other", 2));
	classRoster.add(new Student("343769", "Shaquil", "Timmons", "Brown", 11));
	classRoster.add(new Student("001449", "Karen", "Reiter", "Blue", 10));
	classRoster.add(new Student("267252", "Dax", "Richards", "Brown", 12));
	classRoster.add(new Student("229949", "Mike", "Sykes", "Brown", 13));
	classRoster.add(new Student("772223", "Daniel", "Kiros", "Brown", 3));
	classRoster.add(new Student("004444", "Peter", "Choi", "Brown", 2));
	classRoster.add(new Student("005255", "Joe", "Hill", "Brown", 13));
	classRoster.add(new Student("008888", "Evan", "Tizard", "Brown", 12));
	
	 HashMap<String, Student> classDataBase = new HashMap<>();
		
	 for (Student student: classRoster) {
			classDataBase.put(student.id, student);
	 }	
			this.printRosterHeader();
			
			 Iterator it = classDataBase.entrySet().iterator();
			    while (it.hasNext()) {
			        Map.Entry pair = (Map.Entry)it.next();
			   //     System.out.println(pair.getKey() + " = " + pair.getValue());
			        if(pair.getKey().equals("132617"))
			        {  	
			              Student std= (Student) pair.getValue();
			           this.studentInfo(std);
			
			          }
			        if(pair.getKey().equals("343769"))
			        {  	
			              Student std= (Student) pair.getValue();
			            this.studentInfo(std);;
			
			   

			    }
			        if(pair.getKey().equals("001212"))
			        {  	
			              Student std= (Student) pair.getValue();
			             this.studentInfo(std);
			
			        }
			        
			    }
			
//		System.out.println("Miii" + rubensId);
			
//			Student Reuben  = ClassDataBase.get("132617");
//			Student Shaquil = ClassDataBase.get("343769");
//			Student Stephen = ClassDataBase.get("001212");
				
//		            this.studentInfo(Reuben);
//		            this.studentInfo(Shaquil);
//		            this.studentInfo(Stephen);
		            
		}
	


    		
   

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEyeColor() {
	return eyeColor;
}

public void setEyeColor(String eyeColor) {
	this.eyeColor = eyeColor;
}

public int getMonthsEmployed() {
	return monthsEmployed;
}

public void setMonthsEmployed(int monthsEmployed) {
	this.monthsEmployed = monthsEmployed;
}

@Override
public int compareTo(Object studentAsObj) {
	Student student = (Student) studentAsObj;
	return this.firstName.compareTo(student.firstName);
}
public void studentInfo(Student student) {
	System.out.printf(" %-19s%-20s%-20s%-20s%-20s\n",
 student.id, student.firstName , student.lastName , student.eyeColor , student.monthsEmployed);
}

public void printRosterHeader() {
	System.out.println("Student class roster");
	System.out.println("Empl Id             First name          Last name           Eye color           Months at SSA");
	System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", "=======",  "================",   "================",   "=========",   "=============");
	}
	



public static Comparator<Student> studentNameComparator = new Comparator<Student>() {
	@Override
	public int compare(Student std1, Student std2) {
		String firstName1 = std1.firstName;
		String firstName2 = std2.firstName;
		return firstName1.compareTo(firstName2);
	}
};

}

package array;

public class IterationOverArray {

	
	
	String[] studentsInClass =  {"Asha","Jimna","Angel","Sojan","Rojy","Jimna","Angel","Sojan","Rojy"};
	
	
void findStudent() {
		
		String name ="Jimna";
		int count = 0;
		
		for(int i=0;i<studentsInClass.length;i++) {
			
			//How to find a name in an array
			if(studentsInClass[i].equals(name)) {
				System.out.println("The "+ name+" found at "+i +" position");
				count++;
				
			}
		}
		System.out.println("Number of times "+name +" present in array = "+count);
	}
	
	
	//void updateStudentList() {
		
		//Replace Angel name with Jude
		
		//for(int i=0;i<studentsInClass.length;i++) {
			//if(studentsInClass[i].equals("Angel")) {
			//	studentsInClass[i]="Jude";
			
		
	
}


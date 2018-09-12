
public class Course {
	private String courseName;
	private String[] students=new String[100];
	
	private int numberOfStudents=0;
	
	// 构造方法
	public Course(String courseName) {
		this.courseName=courseName;
	}
	// 增加删除
	public void addStudents(String studentName) {
		this.students[numberOfStudents]=studentName;
		numberOfStudents++;
	}
	public void dropStudents(String studentName) {
		int i,j,flag=0;
		for(i=0;i<numberOfStudents;i++) {
			if(students[i]==studentName) {
				flag=1;
				break;
			}		
		}
		if(flag==1) {
			for(;i<numberOfStudents-1;i++) {
				students[i]=students[i+1];
			}
			students[numberOfStudents-1]="";
			numberOfStudents--;
		}
		else {
			System.out.println("The name of "+studentName+" haven't select course of "+courseName);
		}
		
	}
	// 获取器
	public String[] getStudents() {
		return students;
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public String getCourseName() {
		return courseName;
	}
}

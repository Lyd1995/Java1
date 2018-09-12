
public class Faculty extends Employee {
	public static void main(String[] args) {
		new Faculty();
	}
	
	public Faculty() {
		System.out.println("(4) Peforms Faculty tasks");
		// TODO 自动生成的构造函数存根
	}
}
// Faculty的父类
class Employee extends Person {
	public Employee() {
		this("(2)Invoke Employee's overloaded constructor");
		System.out.println("(3)Performs Employee's tasks");
		// TODO 自动生成的构造函数存根
	}
	public Employee(String s) {
		System.out.println(s);
		// TODO 自动生成的构造函数存根
	}
}
class Person{// Employee的父类
	public Person() {
		System.out.println("(1)Performs Person's tasks");
		// TODO 自动生成的构造函数存根
	}
}

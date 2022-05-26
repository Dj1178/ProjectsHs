package inheritance;

public class Tester {

	public static void main(String[] args) {
		Human human=new Human();
		human.talk();
		System.out.println(human.getAge());
		Student student=new Student("Dan", "Male", true, 73, 17, 12, 4.0);
		student.talk();
		System.out.println(student.getAge());
		Teacher teacher=new Teacher("Al-Shaf", "Male", true, 70, 27, "Computer Science", 12);
		teacher.talk();
		System.out.println(teacher.getAge());
	}
}

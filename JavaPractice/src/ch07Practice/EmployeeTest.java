package ch07Practice;

public class EmployeeTest {
	public static void main(String[] args) {
		Date birth=new Date(1990, 1, 1);
		Employee employee= new Employee("ȫ�浿", "�뱸", 500000, 10000, birth);
		System.out.println(employee);
	}
}

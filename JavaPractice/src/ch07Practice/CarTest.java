package ch07Practice;

public class CarTest {
	public static void main(String[] args) {
		Car obj=new Car("HEW403");
		System.out.println(obj.getClass().getName());
		
		Car firstCar=new Car("HMW520");
		Car secondCar=new Car("HMW520");
		if(firstCar.equals(secondCar)) {
			System.out.println("������ ������ �ڵ����Դϴ�.");
		}else {
			System.out.println("������ ������ �ڵ����� �ƴմϴ�.");
		}
	}
}

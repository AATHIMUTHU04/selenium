package week.day1;

public class Car {
	public void applyBreak() {
		System.out.println("The break is applied");
	}
		public void applygear() {
			System.out.println("The gear is switched");
    }
		public void applyAccelerator() {
			System.out.println("The speed is accelerated");  
			
	}
		public void switchOnAc() {
			System.out.println("The AC is turned on");
			 		}
		public static void main(String[] args) {
			Car swift =new Car();
			swift.applyBreak();
			swift.applygear();
			swift.applyAccelerator();
			swift.switchOnAc();
		}

}

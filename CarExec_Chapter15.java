package kadai_015;

public class CarExec_Chapter15 {

	public static void main(String[] args) {
		
		// 車を１台作る
		Car_Chapter15 car = new Car_Chapter15();
		
		// ギアを3に変更
		car.changeGear(3);
		
		// 走らせる
		car.run();

	}

}

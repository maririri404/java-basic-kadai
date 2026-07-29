package kadai_015;


public class Car_Chapter15 {
	private int  gear  = 1;   // 1速から5速のギアを表す	
	private int  speed = 10;  // ギアチェンジ後の速度を表す
	
	// ギアを変更するメソッド
	public void changeGear(int afterGear) {
		
		// 受け取ったギアに変更
		int beforeGear = gear; 
		
		//ギアチェンジ
		gear = afterGear;
		
		//★ギア変更を表示
		System.out.println("ギア" + beforeGear + "から" + gear + "に切り替えました");
		
		// ギアに応じて速度を変更
		switch (gear) {
		case 1 -> speed = 10;
		case 2 -> speed = 20;
		case 3 -> speed = 30;
		case 4 -> speed = 40;
		case 5 -> speed = 50;
		default -> speed = 10;
		}
		
	}
	// 現在の速度を表示するメソッド
	public void run() {
		System.out.println("速度は時速" + speed + "kmです。");
		
	}

}

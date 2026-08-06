	package kadai_018;

	// Kato_Chapter18を継承する子クラス
	public class KatoIchiro_Chapter18 extends Kato_Chapter18 {

	    // 名をセットするメソッド
	    public void setGivenName() {
	        givenName = "一郎";
	    }

	    // 親クラスの抽象メソッドを実装
	   
	    public void eachIntroduce() {
	        System.out.println("好きな食べ物はリンゴです");
	    }
	}

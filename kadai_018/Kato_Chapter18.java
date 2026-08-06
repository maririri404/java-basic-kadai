package kadai_018;

public abstract class Kato_Chapter18 {
	
	//フィールド
	public String familyName;  //性を表す
	public String givenName;    //名を表す
	public String address;     //住所を表す
	
	//共通の紹介を出力するメソッド
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
		
	}
	
	//子クラスで必ず実装する抽象メソッド
	public abstract void eachIntroduce();
	
	//紹介を実行するメソッド
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}	
}

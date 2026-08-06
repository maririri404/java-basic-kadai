package kadai_018;

// Kato_Chapter18を継承する子クラス
public class KatoHanako_Chapter18 extends Kato_Chapter18 {

    // コンストラクタ
    public KatoHanako_Chapter18() {
        familyName = "加藤";
        address = "東京都中野区〇×";
        setGivenName();
    }

    // 名をセットするメソッド
    public void setGivenName() {
        givenName = "花子";
    }

    // 親クラスの抽象メソッドを実装
    
    public void eachIntroduce() {
        System.out.println("趣味は読書です");
    }
}
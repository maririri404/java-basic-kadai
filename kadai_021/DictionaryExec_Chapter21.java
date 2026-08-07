package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		 // Dictionary_Chapter21クラスのオブジェクトを作成
        Dictionary_Chapter21 fruitsMap = new Dictionary_Chapter21();

        // 調べる英単語を配列に格納
        String[] words = {
                "apple",
                "banana",
                "grape",
                "orange"
        };

        // 辞書を調べるメソッドを呼び出す
        fruitsMap.searchWord(words);

    }

}
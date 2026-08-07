package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	 // 辞書として使うHashMapを宣言
    HashMap<String, String>  fruitsMap = new HashMap<String, String>();

    // コンストラクタ
    public Dictionary_Chapter21() {
	 
	  fruitsMap.put("apple", "りんご");
	  fruitsMap.put("peach", "桃");
	  fruitsMap.put("banana", "バナナ");
	  fruitsMap.put("lemon", "レモン");
	  fruitsMap.put("pear", "梨");
	  fruitsMap.put("kiwi", "キウイ");
	  fruitsMap.put("strawberry", "いちご");
	  fruitsMap.put("grape", "ぶどう");
	  fruitsMap.put("muscat", "マスカット");
	  fruitsMap.put("cherry", "さくらんぼ");
	}  
    
    // 英単語を調べるメソッド	  
    public void searchWord(String[] words) {

		// 配列の単語を1つずつ調べる	  
	  for (int i = 0; i < words.length; i++) {
		  
		// 今調べる単語を取り出す
          String word = words[i];
		  
       // 辞書に存在するか判定
		  if (fruitsMap.get(word) != null) {
			// 存在した場合
			  System.out.println(word + "の意味は" + fruitsMap.get(word));
		  } else {
			// 存在しない場合
				    System.out.println(word + "は辞書に存在しません");
				}
		  }
	  }
	  

	}


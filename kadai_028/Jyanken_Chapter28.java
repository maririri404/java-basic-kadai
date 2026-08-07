package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

    // 自分のじゃんけんの手を入力するメソッド
    public String getMyChoice() {

        // Scannerを使ってキーボードから入力する
        Scanner scanner = new Scanner(System.in);

        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        // 入力された文字を受け取る
        String myChoice = scanner.nextLine();

        return myChoice;
    }

    // 対戦相手のじゃんけんの手をランダムに選ぶメソッド
    public String getRandom() {

        // じゃんけんの手を配列に入れる
        String[] choices = {"r", "s", "p"};

        // 0～2の数字をランダムに作る
        int randomNumber = (int) Math.floor(Math.random() * 3);

        // ランダムに選ばれた番号の手を返す
        return choices[randomNumber];
    }
    // じゃんけんを行うメソッド
    public void playGame(String myChoice, String randomChoice) {

        // じゃんけんの手と日本語を紐づける
        HashMap<String, String> handMap = new HashMap<String, String>();
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");

        // 自分と相手の手を表示する
        System.out.println(
            "自分の手は" + handMap.get(myChoice)
            + ",対戦相手の手は" + handMap.get(randomChoice)
        );

        // あいこか判定
        if (myChoice.equals(randomChoice)) {
            System.out.println("あいこです");

        // 自分の勝ちか判定
        } else if (
            myChoice.equals("r") && randomChoice.equals("s")
            || myChoice.equals("s") && randomChoice.equals("p")
            || myChoice.equals("p") && randomChoice.equals("r")
        ) {
            System.out.println("自分の勝ちです");

        // それ以外は負け
        } else {
            System.out.println("自分の負けです");
        }
    }
}
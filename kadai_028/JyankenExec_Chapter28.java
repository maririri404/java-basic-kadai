package kadai_028;

public class JyankenExec_Chapter28 {

    public static void main(String[] args) {

        // ① じゃんけんクラスのインスタンスを作成
        Jyanken_Chapter28 jyanken = new Jyanken_Chapter28();

        // ② 自分のじゃんけんの手を入力する
        String myChoice = jyanken.getMyChoice();

        // ③ 対戦相手のじゃんけんの手を乱数で選ぶ
        String randomChoice = jyanken.getRandom();

        // ④ じゃんけんの結果を出力する
        jyanken.playGame(myChoice, randomChoice);
    }
}
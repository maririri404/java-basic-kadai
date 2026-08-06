package kadai_018;

public class KatoExec_Chapter18 {

    public static void main(String[] args) {

        // 加藤太郎の自己紹介
        KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
        taro.execIntroduce();

        System.out.println();

        // 加藤一郎の自己紹介
        KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
        ichiro.execIntroduce();

        System.out.println();

        // 加藤花子の自己紹介
        KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
        hanako.execIntroduce();
    }
}
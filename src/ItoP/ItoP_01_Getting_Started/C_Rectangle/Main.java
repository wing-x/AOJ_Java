package ItoP.ItoP_01_Getting_Started.C_Rectangle;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created 2017/06/01.
 */
public class Main {
  public static void main(String[] args) {
    //入力部を作成
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> ary = new ArrayList<>();
    
    for(int i = 0; i < 2; i++) {
      int input = sc.nextInt();
      ary.add(input);
    }

    int a = ary.get(0);
    int b = ary.get(1);

    int s = a * b;
    int m = (a * 2) + (b * 2);

    System.out.println(s + " " + m);

  }
}
/*
何か挙動がおかしいぞー
一応テストケースは全部通ったけど、IntelliJ上で実行すると上手く動かん
まさかだと思って 3 5 \nっていう感じで無理矢理改行コード足したらちゃんと終わった
え、IntelliJだと改行は空白扱いなの？ そんなわけ無いやろー多分
ちょっと調べよう
 */
/*
2chで確認した所、入力部の書き方そのものが不味いらしい
ちゃんと書き換えないとダメだな
*/

//一回この入力方法は封印、原因が分かったら復活で
//それまでは愚直なやり方かforで回そう
/*
    while (sc.hasNext()) {
        int input =sc.nextInt();
        ary.add(input);
    }
*/

/*
仕方が無いので、愚直なfor文に変更
これなら一応改行しても問題ない
（正確には入力した後にforで回した分だけ入ってるっていう感じ）
IntelliJ上の仕様なのか、それともhasnextがおかしいのか分からん
コード調べたらjavaDriveみたいな大手でも使ってるコードだったし（標準入力ではないが）
 */
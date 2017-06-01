package ItoP.ItoP_03_Repetitive_Processing.B_Print_Test_Cases;

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

      while (true) {
        int input = Integer.parseInt(sc.next());
        ary.add(input);
        if (input == 0)break;
      }

      for(int i = 0; i < ary.size()-1; i++){
        System.out.println("Case " + (i+1) + ": " +ary.get(i));
      }

    }
  }

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

/*
色々調べた結果、どうやらスキャナーが終了しないらしい
paizaみたいなオンラインジャッジだと、結局txtで読み込ませるから、それで勝手に終了できる形式になるだけの模様
なので書く時に終了条件も記載しないとだめっぽい
まあとりあえず色々試そう
一応ctrl+dで、入力終了の指示になるらしい
* */

/*
とりあえず色々考え中
for文：何時も通り
break文の追記：ary.size()で指定すれば良い、if文で条件も変えられるから汎用性が少し高い
 */
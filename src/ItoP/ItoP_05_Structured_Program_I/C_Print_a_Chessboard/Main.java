package ItoP.ItoP_05_Structured_Program_I.C_Print_a_Chessboard;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created 2017/06/08.
 */

public class Main {
  public static void main(String[] args) {

    //入力部を作成
    Scanner sc = new Scanner(System.in);
    ArrayList<ArrayList<Integer>> ary_input = new ArrayList<>();
    while (true) {
      ArrayList<Integer> ary = new ArrayList<>();
      int input1 = Integer.parseInt(sc.next());
      int input2 = Integer.parseInt(sc.next());
      if (input1 == 0 && input2 == 0) break;
      ary.add(input1);
      ary.add(input2);
      ary_input.add(ary);
    }
    //System.out.println(ary_input);

    //答えを配列に格納するループを作成
    ArrayList<ArrayList<StringBuilder>> ary_sb = new ArrayList<>();

    for (ArrayList<Integer> index : ary_input) {
      ary_sb.add(sisakuc(index.get(0), index.get(1)));
    }
    //System.out.println(ary_sb);

    //表示関係のループ
    for (int i = 0; i < ary_sb.size(); i++) {
      for (int j = 0; j < ary_sb.get(i).size(); j++) {
        System.out.println(ary_sb.get(i).get(j));
      }
      System.out.println("");
    }
  }

  //ここを改良していく(それ以外は同じでおｋ）

  public static ArrayList<StringBuilder> sisakuc(int a, int b) {
    ArrayList<StringBuilder> ary = new ArrayList<>();
    for (int i = 0; i < a; i++) {
      StringBuilder str1 = new StringBuilder("");
      for (int j = 0; j < b; j++) {
        int ci = i % 2;     //行の判定用
        int cj = j % 2;     //列の判定用
        if (ci == 0) {
          switch (cj) {
            case 0:
              str1 = str1.append("#");
              break;
            default:
              str1 = str1.append(".");
              break;
          }
        } else {
          switch (cj) {
            case 0:
              str1 = str1.append(".");
              break;
            default:
              str1 = str1.append("#");
              break;
          }
        }
      }
      ary.add(str1);
    }
    return ary;
  }
}

//複雑になりすぎてグチャグチャになってるから、一回書き直そう
//基本的には値を取得してその数だけ#か.を書く
//その時に、文字列の長さを取得して、
// 偶数行(0を含む）:偶数なら#、奇数なら.を書く
//あー座標で取るのもありか、i,jが座標みたいなもんだし
//座標的に考えたら(0,0)は#、(0,1)は.･･････的な
//スッキリ良い感じに書けた、やったぜ
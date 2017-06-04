package ItoP.ItoP_05_Structured_Program_I.B_Print_a_Frame;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created 2017/06/04.
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
      ary_sb.add(sisaku(index.get(0), index.get(1)));
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

  public static ArrayList<StringBuilder> sisaku(int a, int b) {
    ArrayList<StringBuilder> ary = new ArrayList<>();
    for (int i = 0; i < a; i++) {
      StringBuilder str1 = new StringBuilder("");
      for (int j = 0; j < b; j++) {
        if (i == 0 || i == (a - 1)) {
          str1 = str1.append("#");
        } else {
          if (j == 0 || j == (b - 1)) {
            str1 = str1.append("#");
          } else {
            str1 = str1.append(".");
          }
        }
      }
      ary.add(str1);
    }
    return ary;
  }
}

package ItoP.ItoP_05_Structured_Program_I.B_Print_a_Frame;

import java.util.ArrayList;

/**
 * Created 2017/06/04.
 */
public class Main_test2 {
  public static void main(String[] args) {

    ArrayList<StringBuilder> aaa = sisaku(5, 6);
    System.out.println(aaa);
    for (StringBuilder v : aaa) {
      System.out.println(v);
    }

    ArrayList<ArrayList<StringBuilder>> ary_sb = new ArrayList<>();
    
    ary_sb.add(sisaku(3, 4));
    ary_sb.add(sisaku(5, 6));
    ary_sb.add(sisaku(3, 3));
    System.out.println(ary_sb);

    //表示関係のループ
    for (int i = 0; i < ary_sb.size(); i++) {
      for (int j = 0; j < ary_sb.get(i).size(); j++) {
        System.out.println(ary_sb.get(i).get(j));
      }
      if (i != ary_sb.size() - 1) {// 一致する前以外っていう書き方にすればよかったんだね、なるほろなるほど
        System.out.println("");
      }
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
//メソッド化した、これで考え方が楽になるはず、多分
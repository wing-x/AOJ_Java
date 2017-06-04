package ItoP.ItoP_05_Structured_Program_I.B_Print_a_Frame;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created 2017/06/04.
 */
public class Main_test1 {
  public static void main(String[] args) {

    ArrayList<ArrayList<StringBuilder>> ary_sb = new ArrayList<>();
    ArrayList<StringBuilder> ary = new ArrayList<>();

    for(int i = 0; i < 3; i++) {
      StringBuilder str1 = new StringBuilder("");
      for (int j = 0; j < 4; j++) {
        if (i == 0 || i == 2) {
          str1 = str1.append("#");
        } else {
          if (j == 0 || j == 3) {
            str1 = str1.append("#");
          } else {
            str1 = str1.append(".");
          }
        }
      }
      ary.add(str1);
    }
    ary_sb.add(ary);

    System.out.println(ary);
    for (StringBuilder s : ary) {
      System.out.println(s);
    }

    System.out.println(ary_sb);
  }
}
/*これで雛形は出来た、保存しておこう
後はこれをループさせるだけ

*/


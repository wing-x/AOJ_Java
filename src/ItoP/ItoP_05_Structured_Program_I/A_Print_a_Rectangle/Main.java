package ItoP.ItoP_05_Structured_Program_I.A_Print_a_Rectangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created 2017/06/01.
 */
public class Main {
  public static void main(String[] args) {
    //入力部を作成
    Scanner sc = new Scanner(System.in);
    ArrayList<ArrayList<Integer>> ary_ans = new ArrayList<>();
    while (true) {
      ArrayList<Integer> ary = new ArrayList<>();
      int input1 = Integer.parseInt(sc.next());
      int input2 = Integer.parseInt(sc.next());
      if (input1 == 0 && input2 == 0) break;
      ary.add(input1);
      ary.add(input2);
      ary_ans.add(ary);
    }
    for (ArrayList<Integer> index : ary_ans) {
      for (int i = 0; i < index.get(0);i++){
        System.out.print("#");
        for (int j = 1; j < index.get(1);j++){
          System.out.print("#");
        }
        System.out.println("");
      }
      System.out.println("");
    }
  }
}


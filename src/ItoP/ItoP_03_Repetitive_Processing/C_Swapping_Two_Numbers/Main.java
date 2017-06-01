package ItoP.ItoP_03_Repetitive_Processing.C_Swapping_Two_Numbers;


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
      ary.add(input1);
      ary.add(input2);
      Collections.sort(ary);    //この時点で処理がかけられる素晴らしさ！
      ary_ans.add(ary);
      if (input1 == 0 && input2 == 0) break;
    }
    //System.out.println(ary_ans);//うひょー、素晴らしい！ この書き方良いな、素晴らしいネスト配列だ

    //後は表示するだけ、簡単簡単！
    for (int i = 0; i < ary_ans.size() - 1; i++) {
      for (int j = 0; j < ary_ans.get(i).size(); j++) {
        System.out.println(ary_ans.get(i).get(j) + " " + ary_ans.get(i).get(j + 1));
        if (j == ary_ans.get(i).size()) ;
        break;
      }
    }
  }
}


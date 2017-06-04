package ItoP.ItoP_05_Structured_Program_I.B_Print_a_Frame;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created 2017/06/03.
 */
public class Main_botu1 {
  public static void main(String[] args) {
    //入力部を作成
/*
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
    }*/
    //先に格納用のネストのString配列を作成
    ArrayList<ArrayList<StringBuilder>> ary_str = new ArrayList<>();

    ArrayList<StringBuilder> ary_test = new ArrayList<>();

    for (int i = 0; i < 3; i++) {
      StringBuilder str1 = new StringBuilder("");
      for (int j = 0; j < 4; j++) {
        str1 = str1.append(".");
      }
      ary_test.add(str1);
    }
    ArrayList<StringBuilder> ary_test2 = new ArrayList<>();
    for(int i = 1; i < 2; i++){
      int en = ary_test.get(i).length();
      StringBuilder s = ary_test.get(i).replace(1,en,"#");
      ary_test2.add(s);
    }

    System.out.println(ary_test);
    System.out.println(ary_test2);
    //System.out.println(ary_test.get(0));
    //System.out.println(str1);
    //StringBuilderを使って連結したバージョン、上手く行かないので単純化していこう
    /*
    StringBuilder str1 = new StringBuilder("");//空文字作ればいええやんっていう発想を忘れていた
    for (ArrayList<Integer> index : ary_input) {
      for (int i = 0; i < index.get(0);i++){
        for (int j = 1; j < index.get(1);j++){
          ArrayList<StringBuilder> ary = new ArrayList<>();
          str1 = str1.append("#");
         // String str2 =str1.toString(); //こうすると、str1をString型にする事も出来る
          ary.add(str1);
          ary_str.add(ary);
        }
      }
    }
    */
  }
}


/*
方針としてはforループ連打よりも
switch文で場合訳して、その中でループさせた方が良いな
条件としては
ary.get(0)の値が

case1：
    #を一行書く
case2:
    #..#っていう形を出力する
    多分、
    #
    ..をループ
    #っていうのをprintでくっ付ければ良いかな
case3:
    #を一行書く
って言うのを上手いことループさせて書くのが良いかな
Aの時点で既にfor3回使った3重ループだからめっちゃ見難いんだよね
だから今回はもう少しすっきりさせていこう
6/4
放置してたけど、いくつかの方法を思いつく
1.#で形を形成→その後に必要な所だけ.で置き換える
多分こっちの方が遥かにスッキリするはず
replaseの動きしたいではあるが
あ、だったら逆の方が良いか
中間部分は.で書いた後に最初と最後を置換するっていうループにすれば遥かに楽になる
上下もその置換する範囲を文字列全体に適当する書き方に変えれば良い
ちょっとこっちの方式で書いてみるか

//置換する方法でいくなら、前回のプログラム丸々引用できるな
先に書いてから、指定した所を入れ替える形にできるし

色々悩み中だったけど、これ配列に叩き込めばいけるんでね？
そうすれば StringBuilderの文字列指定も出来るし
最終的な表示も文字列に出来るし
ちょっと改良してやってみよう

書いてて思った、これ置換方はめっちゃ面倒だな
配列に入れたらって思ったけど恐ろしく面倒になるだけだった
でもケース文で分ける方も面倒そうだしなー

と思ってたら
sb1.replace(2, 4, "***");
これで指定位置の文字列を変えれるらしい
じゃあれやん
書いてからの入れ替え方でええやん？
ｱﾎｽ
と思ったらこのリプレイスだと、例えばabcd bc間を指定、.にするっていう風にすると
a.dって言う感じになるらしい、ダメじゃねーか

いやいや待て待て
別に中間じゃなくて良いって自分で言っただろ俺
最初に.で書いて両端を#に入れ替えるっていう方式でええやん

やっぱりスイッチ文にするかー

ダメだいろいろ考えてごっちゃごちゃになってきた
一端頭の中をクリアしよう
完全に泥沼になってる
新しく作って、そこでswich文の実験しよう
 */
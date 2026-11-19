import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.TreeSet;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> tree = new TreeSet<String>();

        for(int i = 0;i <10;i++)
        {
            String s = sc.next();
            tree.add(s);
        }
        tree.remove("しじま");

        for(String s : tree)
            System.out.println(s);
    }
}
/*TreeSetクラスの全角文字列を表示したときの並び順について、
* 数例の試行より、半角英数字,ひらがな,カタカナ,漢字、全角英数字の順に並んでいることが分かった。
* また、それぞれの並びについては、英数字はアルファベット順に、ひらがなカタカナは50音順に並んでいることが確認できた。
* 漢字については50音順ではないことが分かったが、これについて
* そもそもこれらの文字列の並びは文字コードの数字が若い順に並んでいると考えられる。
* 半角英数字,ひらがな,カタカナ,漢字,全角英数字の順番はUnicodeの文字の配置と一致していると考えられる。
* その上で、漢字においては他の文字とは違い音訓があり、その順番は音に依存していないと考えられるため、
* 今回の試行で特徴的な並びを確認することができたと考えられる。
* 以上より、TreeSetクラスの文字列の並び順については文字コードの番号順であると考えられる。*/
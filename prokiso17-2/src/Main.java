import java.sql.Array;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        int cycle = 1000000;
        ArrayList<Integer> number_list = new ArrayList<>();
        int[] list = new int[cycle];

        long a = System.currentTimeMillis();
        System.out.println(a);

        for(int i = 0;i < cycle;i++)
        {
            number_list.add(i);             //追加
        }

        a = System.currentTimeMillis();
        System.out.println(a);

        for(int i = 0;i < cycle;i++)
        {
            list[i] = i;                    //追加
        }

        a = System.currentTimeMillis();
        System.out.println(a);

        for(int i = 0;i < cycle;i++)
        {
            number_list.add(i, i);           //挿入
        }

        a = System.currentTimeMillis();
        System.out.println(a);

        for(int i = 0;i < cycle;i++)          //挿入
        {
            for(int j = list.length-1;j > 0;j--)
            {
                list[j] = list[j-1];
            }
            list[0] = i;
        }

        a = System.currentTimeMillis();
        System.out.println(a);

        for(int i = 0;i < cycle;i++)
        {
            number_list.remove(1);      //削除
        }

        a = System.currentTimeMillis();
        System.out.println(a);

        for(int i = 0;i < cycle;i++)
        {
            list[1] = 0;                //削除
            for(int j = 1;j < list.length-1;j++)
            {
                list[j] = list[j+1];
            }
        }

        a = System.currentTimeMillis();
        System.out.println(a);

        for(int i = 0;i < cycle;i++)
        {
            number_list.set(i, i);          //置換
        }

        a = System.currentTimeMillis();
        System.out.println(a);

        for(int i = 0;i < cycle;i++)
        {
            list[i] = i;                //置換
        }

        a = System.currentTimeMillis();
        System.out.println(a);
    }
}
/*本課題については1970年1月1日00:00:00から経過したミリ秒を求めることの出来る
System.currntTimeMillis()を用いて実験開始から各動作終了までの
ラップタイムを求めることでその処理速度に関する比較が可能になると考えられる.
第一に配列の長さを500として測定した時、有意差は確認できなかった.
そこで、配列の長さを1,000,000としたところ有意な差が確認できた．
実行時間について追加,挿入,削除,置換それぞれの時間を比較し,処理速度についての考察を述べる.
初めに,要素の追加について,ArrayListに要素を1,000,000追加した時の実行時間は
2,128,721,178-2,128,721,158の間であった.差を求めると、20msである
固定長配列に要素を追加していったときの実行時間は
2,128,721,180-2,128,721,178の2msであった.
次に要素の挿入について、ArrayListは
2,128,814,853-2,128,721,180の93,673ms,
固定長配列は
2,128,912,005-2,128,814,853の97,152msであった.
要素の削除について、ArrayListは
2,129,066,389-2,128,912,005の154,3884ms,
固定長配列は
2,129,159,677-2,129,066,389の93,288ms,
最期に、要素の置換について、ArrayListは
2,129,159,699-2,129,159,677の22ms,
固定長配列は
2,129,159,699-2,129,159,699の1ms未満という値が確認できた.
以上より
処理速度の比較については要素の挿入においてArrayListが上回った以外は、
固定長配列の実行時間はどれもArrayListの実行時間を上回っており、固定長配列の処理速度の方が優れていると考えられる
全体の実行時間を比べた時に、要素数を小さくすればするほど要素の削除にかかった時間が小さくなり、
反対に、要素の挿入にかかった時間の差が結果に大きく影響するようになった事が確認できた.
これらの仕組みについての考察は略する.
結論として、平時では固定長配列の方が処理速度が優れているが、要素の挿入と小さい要素数での配列の扱いにおいては限定的にArrayListが上回ると考えられる.*/

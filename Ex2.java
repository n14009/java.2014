import java.util.Scanner;
import java.util.Random;

abstract class Ex {
	abstract void execute();
}

class Ex2_0 extends Ex{
	void execute(){
		int x;
		int y;

		x = 63;
		y = 18;

		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
		System.out.println("合計は" + (x + y) + "です。");
		System.out.println("平均は" + (x + y) / 2 + "です。");
	}
}
class Ex2_1 extends Ex{
	void execute(){
		double x;
		int y;

		x = 63;
		y = 18;

		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
		System.out.println("合計は" + (x + y) + "です。");
		System.out.println("平均は" + (x + y) / 2 + "です。");
	}
}
class Ex2_2 extends Ex{
        void execute(){
              int x;
              int y;
              int z;

              x = 63;
              y = 18;
              z = 20;

     System.out.println("合計は" + (x + y + z) + "です。");
     System.out.println("平均は" + (x + y + z) / 3 + "です。"); 
        }
}
class Ex2_00 extends Ex{
	void execute(){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("xとyを加減乗除します。");

		System.out.print("xの値：");		// xの値の入力を促す
		int x = stdIn.nextInt();
		
		System.out.print("yの値：");		// yの値の入力を促す
		int y = stdIn.nextInt();

		System.out.println("x + y = " + (x + y)); // x + yの値を表示
		System.out.println("x - y = " + (x - y)); // x - yの値を表示
		System.out.println("x * y = " + (x * y)); // x * yの値を表示
		System.out.println("x / y = " + (x / y)); // x / yの値を表示 (商)
		System.out.println("x % y = " + (x % y)); // x % yの値を表示 (剰余)
	}
}

/*class Ex2_000 extends Ex{
	void execute(){
		Random rand = new Random();

		int luchy = rand.nextInt(10);		// 0～9の乱数

		System.out.println("今日のラッキーナンバーは" + luchy + "です。");
	}
}*/
class Ex2_3 extends Ex{
        void execute(){
                Scanner stdIn = new Scanner(System.in);

                System.out.print("整数値を入力してください");
                int x = stdIn.nextInt();

                System.out.println("この値を受け取りました。" + x);
        
        }

}
class Ex2_4 extends Ex{
        void execute(){
                Scanner stdIn = new Scanner(System.in);

                System.out.println("xに10を加減した数値と10を減じた数値を表示します");

                System.out.print("xの値を入力してください");
                int x = stdIn.nextInt();

                System.out.println("x + 10 =" + (x + 10));
                System.out.println("x - 10 =" + (x - 10));
        }

}
class Ex2_5 extends Ex{
	void execute(){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("2つの実数値の和と平均を表示します。");

		System.out.print("xの実数値：");		// xの値の入力を促す
		double x = stdIn.nextDouble();
		
		System.out.print("yの実数値：");		// yの値の入力を促す
		double y = stdIn.nextDouble();

                          System.out.println("2つの実数値の和は" + (x + y) + "です。");
                          System.out.println("2つの実数値の平均は" + (x + y) /2 + "です。");
        }
}
class Ex2_6 extends Ex{
	void execute(){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("三角形の面積を求めます");

		System.out.print("底辺を入力してください");		
		double x = stdIn.nextDouble();
		
		System.out.print("高さを入力してください：");		
		double y = stdIn.nextDouble();

                          System.out.println("三角形の面積は" + (x * y) /2 + "です。");
        }
}
public class Ex2 {
	public static void main(String[] args){
		Ex a;

/*		a = new Ex2_0();
		a = new Ex2_00();
                a.execute();
		a = new Ex2_000();
		a.execute();
               */ 
                a = new Ex2_00();
                a.execute();
                a = new Ex2_1();
                a.execute();
                a = new Ex2_2();
                a.execute();
                a = new Ex2_3();
                a.execute();
                a = new Ex2_4();
                a.execute();
                a = new Ex2_5();
                a.execute();
                a = new Ex2_6();
                a.execute();

	}
}

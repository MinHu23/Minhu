import java.util.Scanner;
import java.util.Random;

public class APP {

	       public class Test {
	           public void main(String[] args) {
	               Scanner scan = new Scanner(System.in);
	               while (true){
	                   int x = (int) (Math.random() * 1920);
	                   int y = (int) (Math.random() * 1080);
	                   System.out.println("请输入一个数字");
	                   int i = scan.nextInt();
	                   if (i==1){
	                       System.out.println("x"+x+" "+"y"+y);
	                   }
	               }
	           }
	       }
}

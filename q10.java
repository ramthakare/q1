package Test;
import java.util.Scanner;
public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				Scanner sc = new Scanner(System.in);
		                float bs, gs, da, hra;
				System.out.print("\nEnter basic salary:");
				bs = sc.nextFloat();
				if (bs<1500)
				{
					hra = bs * 10 / 100;
					da = bs * 90 / 100;
				}
				else
				{
					hra = 500;
					da = bs * 98 / 100;
				}
				gs = bs + hra + da;
				System.out.print("\nGross salary = Rs." + gs);
	}

}

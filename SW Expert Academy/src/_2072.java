import java.util.Scanner;

public class _2072 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		for(int i=1;i<=test_case;i++) {
			int sum=0;
			for(int j=0;j<10;j++) {
				int num=sc.nextInt();
				if(num%2 == 1) {
					sum+=num;
				}
			}
			System.out.format("#%d %d\n", i, sum);
		}
	}

}

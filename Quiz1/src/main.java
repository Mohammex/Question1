import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		int AB, H, v2B, v3B, HR, R, BB;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Type the name: ");
		name = input.nextLine();
		
		System.out.println("Type the AB: ");
		AB = Integer.valueOf(input.nextLine());
		
		System.out.println("Type the H: ");
		H = Integer.valueOf(input.nextLine());
		
		System.out.println("Type the 2B: ");
		v2B = Integer.valueOf(input.nextLine());
		
		System.out.println("Type the 3B: ");
		v3B = Integer.valueOf(input.nextLine());
		
		System.out.println("Type the HR: ");
		HR = Integer.valueOf(input.nextLine());
		
		System.out.println("Type the R: ");
		R = Integer.valueOf(input.nextLine());
		
		System.out.println("Type the AB: ");
		BB = Integer.valueOf(input.nextLine());
		
		Player player1 = new Player(name, AB, H, v2B, v3B, HR, R, BB);
		
	}
}

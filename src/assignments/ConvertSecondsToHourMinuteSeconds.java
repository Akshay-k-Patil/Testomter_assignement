package assignments;

import java.util.Scanner;

public class ConvertSecondsToHourMinuteSeconds {

	public static void main(String[] args) {
		
		Scanner sec = new Scanner(System.in);
		System.out.println("Enter the secounds");
		int secound = sec.nextInt();
		int Se, Hr, Min;
		Se = secound % 60;
		Hr = secound / 60;
		Min = Hr % 60;
		Hr = Hr / 60;
		System.out.println(Hr + ":" + Min + ":" + Se);
		

	}

}

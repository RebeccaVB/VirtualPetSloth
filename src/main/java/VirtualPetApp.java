
import java.util.Scanner;


public class VirtualPetApp {

	public static void main(String[] args) {

		VirtualPet snugles = new VirtualPet("Snugles");
		Scanner input = new Scanner(System.in);

		boolean exit;
		
System.out.println("   --..__-..__ _    _..-''_ ");
System.out.println("       .-,`\"-/ /\\ \"\"/_)--\"\"`` ");
System.out.println("      ( (    | | | \\/ |        ");
System.out.println("      \\ '.  |  \\;  \\ /              ");
System.out.println("	   |  \\ |   |   ||        ");
System.out.println("    ,-._.'  |_|   | ||       ");
System.out.println("  /.\\_/\\     -'   ;  Y          ");
System.out.println(" |  `  |        /    |-.     ");
System.out.println(" '. __/_    _.-'     /'      ");
System.out.println("        `'-.._____.-'           ");
	

		do {
		System.out.println("This is snugles the sloth");
		System.out.println("Snugles level of dehydration is " + "=" + snugles.getWater());
		System.out.println("Snugles level of hunger is" + "=" + snugles.getStarving());
		System.out.println("Snugles need to go poo " + "=" + snugles.bowelMov());
		System.out.println("Snugles need to go to sleep " + "=" + snugles.fallAslp());
		if (snugles.isThirsty()) {
			System.out.println("I am thirsty");
		}
		if (snugles.isHungry()) {
			System.out.println("I am feeling hungry");
		}
		if (snugles.relieveOneSelf()) {
			System.out.println("I need to relieve myself or I might have an accident");
		}
		if (snugles.isTired()) {
			System.out.println("I am SSSoooooo very sleepy");
		}
		
		
		System.out.println("What would you like to do?");
		System.out.println("1. Give Snuggles water?");
		System.out.println("2. Feed snuggles, he might be famished?");
		System.out.println("3. Take Snuggles to go Poo?");
		System.out.println("4. Lay snugles down to sleep?");
		int response = input.nextInt();
		snugles.tick();
		if (response == 1) {
			snugles.giveWater();
		}
		if (response == 2) {
			snugles.feedSloth();
		}
		if (response == 3) {
			snugles.takeOutToPoop();
		}
		if (response == 4) {
			snugles.laySlothDown();
		}
		System.out.println("Snugles level of dehydration is " + "= " + snugles.getWater());
		System.out.println("Snugles level of hunger is" + "= " + snugles.getStarving());
		System.out.println("Snugles need to go poo " + "= " + snugles.bowelMov());
		System.out.println("Snugles need to go to sleep " + "= " + snugles.fallAslp());
		
		if (snugles.isTired()) {
			snugles.laySlothDown();
			System.out.println("Goodnight, zzzzzzzz");
		}
		if (snugles.relieveOneSelf()) {
			snugles.sittingInPeeNPoo();
			System.out.println("You didn't take me out so I am shat all over myself :( ");
		}
		
		System.out.println(" Would you like to continue? True or false");
		
		 exit = input.nextBoolean();
		} while (exit); {
			if (exit = false);
		} 
			input.close();
		}

	}



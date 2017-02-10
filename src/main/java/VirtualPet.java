import java.util.Random;
import java.util.Scanner;

public class VirtualPet  {

	public String name;
	private int dehyd = 0;
	private int famished = 0;
	private int bM = 0;
	private int tired = 0;
	
	private Random generator = new Random();

	Scanner scanner = new Scanner(System.in);

	public VirtualPet(String snugles) {
		name = snugles;
	}

	
	
	// thirst
	public int getWater() {
		return dehyd;
	}

	public void giveWater() {
		dehyd -= 8;
	}

	public boolean isThirsty() {
		boolean thirsty = (dehyd >= 6);
		return thirsty;
	}

	
	// Hunger
	public int getStarving() {
		return famished;
	}

	public void feedSloth() {
		famished -= 5;
		dehyd++;
	}

	public boolean isHungry() {
		boolean hungery = (famished >= 7);
		return hungery;
	}

	
	// Poop
	public int bowelMov() {
		return bM;
	}

	public void takeOutToPoop() {
		bM -= 0;
	}

	public boolean relieveOneSelf() {
		boolean needsToPoo = (bM >= 7);
		return needsToPoo;
	}

	public void sittingInPeeNPoo() {
		bM = 15;
	}
	
	
	// Sleep
	public int fallAslp() {
		return tired;
	}

	public void laySlothDown() {
		tired -= 1;
	}

	public boolean isTired() {
		boolean needsSleep = (tired >= 9);
		return needsSleep;
	} 
	

	
	
	
	public int generatorRandom() {
		return generator.nextInt(6)+1;
	}

	public void tick() {
		famished += (7 + generatorRandom());
		dehyd += (9 + generatorRandom());
		bM += (5 + generatorRandom());
		tired += (2 +generatorRandom());
	}
	
}

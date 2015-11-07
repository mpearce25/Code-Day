import java.util.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Town {
	int x;
	int y;
	int gunStore;
	int gunPrice;
	int hatPrice;
	int hatStore;
	String name;
	int questAge;
	String questString;
	String loc;
	public Town(String nm, int xcoord, int ycoord, int gun, int gp, int hat, int hp, int qa, String qs) {
		x = xcoord;
		y = ycoord;
		gunStore = gun;
		gunPrice = gp;
		hatStore = hat;
		hatPrice = hp;
		name = nm;
		questAge = qa;
		questString = qs;
		String loc = "center";
	}
	public void enter() {
		Display.output("You enter the town of "+name+".");
		Display.output("You can enter Saloon(A), enter the store(S), or exit(E).");
		String loc = "center";
	}
	public void saloon() {
		String loc = "saloon";
		if(Hero.getAge() == questAge) {
			Display.output(questString);
		} else {
			Display.output("You see some people roaming about. You sit down at a table by yourself and have a drink.");
		}
		Display.output("You can buy Whiskey(B) or exit(E).");
	}
	public void store() {
		String loc = "store";
		if(Hero.getGunAttack() < gunStore) {
			Display.output("You can get a new gun with an attack of "+gunStore+" for $"+gunPrice);
		}
		if(Hero.getHatStyle() < hatStore) {
			Display.output("You can get a new hat with an attack of "+hatStore+" for $"+hatPrice);
		}
		if((Hero.getHatStyle()<hatStore)&&(Hero.getGunAttack()<gunStore)) {
			Display.output("You can buy the gun(G), buy the hat(H), or exit(E).");
		} else if (Hero.getHatStyle()<hatStore) {
			Display.output("You can buy the hat(H) or exit(E).");
		} else if (Hero.getGunAttack() < gunStore) {
			Display.output("You can but the gun(G) or exit(E).");
		} else {
			Display.output("There is nothing you can buy. You can exit(E).");
		}
	}
	public void buyStuff(Boolean gh) {
		if(gh) {
			if(gunPrice >= Hero.getMoney()) {
				Hero.setMoney(Hero.geyMoney()-gunPrice);
				Hero.setAttack(Hero.getAttack()-Hero.getGunAttack()+gunStore);
				Hero.setGunAttack(gunStore);
				Display.output("You bought a new gun.");
				Display.newGun();
				store();
			} else {
				Display.output("You do not have enough money for this item.");
			}
		} else {
			if(hatPrice >= Hero.getMoney()) {
				Hero.setMoney(Hero.geyMoney()-hatPrice);
				Hero.setStyle(Hero.getStyle()-Hero.getHatStyle()+hatStore);
				Hero.setHatStyle(hatStore);
				Display.output("You bought a new hat.");
				Display.newHat();
				store();
			} else {
				Display.output("You do not have enough money for this item.");
			}
		}
	}
}

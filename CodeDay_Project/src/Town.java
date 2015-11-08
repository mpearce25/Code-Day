import java.util.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Town{
	//Yay variables
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
	//Constructor
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
		loc = "center";
	}
	//When enters the town, location is center.
	public void enter() {
		if (questAge-1==Hero.getAge()) {
			Display.output("You have completed your quest. Go to the Saloon to find out what to do next.");
			Hero.setAge(Hero.getAge()+1);
		}
		Display.output("You enter the town of "+name+".");
		Display.output("You can enter Saloon(A), enter the store(S), or exit(E).");
		loc = "center";
	}
	//When you enter the saloon.
	public void saloon() {
		loc = "saloon";
		if(Hero.getAge() == questAge) {
			Display.output(questString);
		} else {
			Display.output("You see some people roaming about. You sit down at a table by yourself.");
		}
		Display.output("You can buy Whiskey(B) or exit(E).");
	}
	//When you enter the store.
	public void store() {
		loc = "store";
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
	//When you try to buy a hat or gun.
	public void buyStuff(Boolean gh) {
		if(gh) {
			if(gunPrice >= Hero.getMoney()) {
				Hero.setMoney(Hero.getMoney()-gunPrice);
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
				Hero.setMoney(Hero.getMoney()-hatPrice);
				Hero.setStyle(Hero.getStyle()-Hero.getHatStyle()+hatStore);
				Hero.setHatStyle(hatStore);
				Display.output("You bought a new hat.");
				Display.newHat();
				store();
			} else {
				Display.output("You do not have enough money for this item.");
			}
		}
		store();
	}
	//For buying whiskey.
	public void buyWhiskey() {
		if(Hero.getMoney()>5) {
			Display.output("You bought 1 whiskey.");
			Hero.setMoney(Hero.getMoney()-5);
			Hero.setWhiskey(Hero.getWhiskey()+1);
		} else {
			Display.output("You do not have enough money for whiskey.");
		}
		saloon();
	}
	//You pressed a key, so this is happening.
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
			case (KeyEvent.VK_H): {
				if(loc.equals("store")) {
					buyStuff(false);
				}
			}
			case (KeyEvent.VK_G): {
				if(loc.equals("store")) {
					buyStuff(true);
				}
			}
			case (KeyEvent.VK_S): {
				if(loc.equals("center")) {
					store();
				}
			}
			case (KeyEvent.VK_A): {
				if(loc.equals("center")) {
					saloon();
				}
			}
			case (KeyEvent.VK_B): {
				if(loc.equals("saloon")) {
					buyWhiskey();
				}
			}
			case (KeyEvent.VK_E): {
				if(loc.equals("saloon")) {
					enter();
				} else if (loc.equals("store")) {
					enter();
				} else {
					Hero.setX(x-1);
					Hero.setY(y);
				}
			}
		}	
	}
}

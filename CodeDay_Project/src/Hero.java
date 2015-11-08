import java.awt.event.KeyEvent;

public class Hero {
	private static int x;
	private static int y;
	private static int whiskey;
	private static int age;
	private static int maxHealth;
	private static int currentHealth;
	private static int money;
	private static int gunAttack;
	private static int attack;
	private static int hatStyle;
	private static int style;
	private static int intro = 1;
	 
	public static void intro1() {
		Display.output("\"Shane, get up!\"");
		Display.output("\"Shane!\"");
		Display.output("\"SHANE!\"");
		Display.output("I awoke to the sounds of screams outside my window.");
		Display.output("Outside, buildings were ablaze. Bandits were attacking.");
		Display.output("Click Space( )to continue.");
		setIntro(2);
	}
	public static void intro2() {
		Display.output("Quickly, I got up and ran to the kitchen.");
		Display.output("My father looked at me and handed me a gun.");
		Display.output("\"I'm sorry son. You become a man today.\"");
		Display.output("Stunned, I took the gun and looked up at him.");
		Display.output("He looked down on me, then turned to the door.");
		Display.output("Click Space( ) to continue.");
		setIntro(3);
	}
	public static void intro3() {
		Display.output("I followed my father outside and felt the heat of flames on my face.");
		Display.output("My father immediatly ran off into the crowd, ready to take on the bandits.");
		Display.output("I stood there, unable to move, not knowing what to do.");
		Display.output("Suddenly, a bandit ran up to me.");
		setIntro(0);
		Display.output("A bandit is attacking you. Hit to F to fight.");
		fightBandit();
	}
	public static void intro4() {
		Display.output("I stood stunned, while the bandit lay dead at my feet.");
		Display.output("Up ahead, I could see my father.");
		Display.output("I watched a bandit approach him from behind. He didn't know what was coming.");
		Display.output("I cried out, but it was too late.");
		Display.output("Click Space( ) to continue.");
		setIntro(5);
	}
	public static void intro5() {
		Display.output("An ear shattering 'BANG!' split the air.");
		Display.output("My father crumpled to the ground.");
		Display.output("\"NO!\" The Gun in my hand blazed and the bandit fell.");
		Display.output("I ran over to my father. His breathing was haggered.");
		Display.output("\"Shane....my son.....my man.....\"");
		Display.output("Click Space( ) to continue.");
		setIntro(6);
	}
	public static void intro6() {
		Display.output("The fires around me burned down and the screams faded away.");
		Display.output("The bandits had all gone and I still sat there, clutching my father's face.");
		Display.output("At last, my mother came out and pulled me away.");
		Display.output("I would not let them get away with this. I would not let them succeed.");
		Display.output("Click Space( ) to continue.");
		setIntro(7);
	}
	public static void intro7() {
		Display.output("Days passed and I laid there, not moving, not eating.");
		Display.output("At last, I got up. I put on my boots and hat.");
		Display.output("I put on my father's holster and picked up the gun he gave me.");
		Display.output("The next town over might have some clues as to the Bandits whereabouts.");
		Display.output("I had never been there, but I knew it was to the southeast.");
	}
	public static void fightBandit() {
		Display.output("You attack the bandit and deal 10 damange.");
		Display.output("You have defeated the bandit.");
		Display.output("When in a fight, you may fight(F), run(R), or taunt(T)");
		Display.output("Fight attacks the enemy, Run sometimes lets you escape,");
		Display.output("and taunt may intimidate your opponent and get them to run.");
		Display.output("Click Space( ) to continue.");
		setIntro(4);
	}
	public static void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
			case(KeyEvent.VK_SPACE): {
				switch(intro) {
					case (2): {
						intro2();
					}
					case (3): {
						intro3();
					}
					case(4): {
						intro4();
					}
					case(5): {
						intro5();
					}
					case(6): {
						intro6();
					}
					case(7): {
						intro7();
					}
				}
			}
			case(KeyEvent.VK_F): {
				if(intro==0) {
					fightBandit();
				}
			}
		}
	}
	
	//Annoying methods because we have to
	public static int getX() {
		return x;
	}
	public static void setX(int a) {
		x = a;
	}
	public static int getY() {
		return y;
	}
	public static void setY(int a) {
		y = a;
	}
	public static int getWhiskey() {
		return whiskey;
	}
	public static void setWhiskey(int a) {
		whiskey = a;
	}
	public static int getAge() {
		return age;
	}
	public static void setAge(int a) {
		age = a;
		Display.output("You are now "+age+". A year older and a year wiser.");
	}
	public static int getCurrentHealth() {
		return currentHealth;
	}
	public static void setCurrentHealth(int a) {
		currentHealth = a;
	}
	public static int getMaxHealth() {
		return maxHealth;
	}
	public static void setMaxHealth(int a) {
		maxHealth = a;
	}
	public static int getMoney() {
		return money;
	}
	public static void setMoney(int a) {
		money = a;
	}
	public static int getGunAttack() {
		return gunAttack;
	}
	public static void setGunAttack(int a) {
		gunAttack = a;
	}
	public static int getHatStyle() {
		return hatStyle;
	}
	public static void setHatStyle(int a) {
		hatStyle = a;
	}
	public static int getAttack() {
		return attack;
	}
	public static void setAttack(int a) {
		attack = a;
	}
	public static int getStyle() {
		return style;
	}
	public static void setStyle(int a) {
		style = a;
	}
	public static int getIntro() {
		return intro;
	}
	public static void setIntro(int a) {
		intro = a;
	}
	public static void atHome() {
		if(age!=29) {
			Display.output("What are you doing here? I thought you were getting revenge. Get back out there!");
		} else {
			Display.output("Your mom stands at the door, a tear in her eye.");
			Display.output("You nod at her, telling her you finished off the bandits.");
			Display.output("She reaches forward and embraces you, a warm welcome after a hard journey.");
			Display.output("\"Rest now\" she says and you close your eyes.");
		}
	}
	
	//Move around the map. Yay.
	public static void move(String s) {
		if(s.equals("up")&& getY()!=0) {
			setY(getY()-1);
			Display.move("up");
		}
		if(s.equals("down") && getY() != 74) {
			setY(getY()+1);
			Display.move("down");
		}
		if(s.equals("right") && getX() !=99) {
			setX(getX()+1);
			Display.move("right");
		}
		if(s.equals("left") && getX() != 0) {
			setX(getX()-1);
			Display.move("left");
		}
		if((getX()==3 || getX()==4 || getX()==5)&&(getY()==3||getY()==4||getY()==5)) {
			atHome();
		} else if ((getX()==19 || getX()==20 || getX()==21)&&(getY()==20||getY()==21||getY()==22)) {
			Display.satbury.enter();
		} else if ((getX()==18 || getX()==19 || getX()==20)&&(getY()==63||getY()==64||getY()==65)) {
			Display.clacton.enter();
		} else if ((getX()==50 || getX()==51 || getX()==52)&&(getY()==30||getY()==31||getY()==32)) {
			Display.kelna.enter();
		} else if ((getX()==87 || getX()==88 || getX()==89)&&(getY()==25||getY()==26||getY()==27)) {
			Display.lockinge.enter();
		} else if ((getX()==78 || getX()==78 || getX()==79)&&(getY()==56||getY()==57||getY()==58)) {
			Display.bredon.enter();
		} else if ((getX()==37 || getX()==38 || getX()==39)&&(getY()==20||getY()==21||getY()==22)) {
			Display.ho1.battle();
		} else if ((getX()==31 || getX()==32 || getX()==33)&&(getY()==42||getY()==43||getY()==44)) {
			Display.ho2.battle();
		} else if ((getX()==72 || getX()==73 || getX()==74)&&(getY()==26||getY()==27||getY()==28)) {
			Display.ho3.battle();
		} else if ((getX()==82 || getX()==83 || getX()==84)&&(getY()==45||getY()==45||getY()==47)) {
			Display.ho4.battle();
		} else if ((getX()==95 || getX()==96 || getX()==97)&&(getY()==70||getY()==71||getY()==72)) {
			Display.ho5.battle();
		}
	}
}

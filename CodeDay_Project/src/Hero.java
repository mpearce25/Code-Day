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
		setIntro(4);
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
	public void keyPressed(KeyEvent e) {
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
}

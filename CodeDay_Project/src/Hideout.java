import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Hideout{
	public static int x;
	public static int y;
	public static int number_bandits;
	public static boolean taunting;
	public static boolean fighting;
	public static boolean running;
	static String reason;
	public static int questAge;
	public static String questText;
	public static Enemy[] enemies = new Enemy[number_bandits];
	//enemies =  new Enemy[10];
	public Hideout(int xcoord, int ycoord, int nb, int qa,String qt){
		x = xcoord;
		y = ycoord;
		number_bandits = nb;
		questAge = qa;
		questText = qt;
	}
	
	//miss when you shoot sometimes
	//make the player know to move on to the next thing after the bandits are killed
	//make the final boss
	
	public static void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyCode()){
		//f - Fight
		case 70:
			fighting = true;
			break;
		//t - Taunt
		case 84:
			taunting = true;
			break;
		//r - Run away
		case 82:
			running = true;
			break;
		}
	}
	
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void battle(){
		if(questAge != Hero.getAge()) {
			Display.output("\"Get out of here!\", a voice cried out.");
			Hero.setX((int)x-1);
			Hero.setY((int)y-1);
		} else {
		if(enemies.length == 1){
			//Mega Boss mode
			enemies[0] = new Enemy(65,10,2000,"");
		}
	for(int i = 0; i<enemies.length;i++){
		enemies[i] = new Enemy(i*5 + 20,i*5,i*5 + 20,"Bandit");
		System.out.println("Hi");
		while(enemies[i].health > 0 && Hero.getCurrentHealth() > 0){
			if(fighting == true){
				if(enemies[i].attack * Math.random()>Hero.getAttack()*Math.random()){
					Hero.setCurrentHealth((int) (Hero.getCurrentHealth()-enemies[i].attack));
				}else if(enemies[i].attack * Math.random()<Hero.getAttack()*Math.random()){
					enemies[i].health -= Hero.getAttack();
				}else if(enemies[i].attack * Math.random() == Hero.getAttack()*Math.random()){
					enemies[i].style += 10;
					Hero.setStyle(10);
				}
			}else if(taunting == true){
				if(enemies[i].style * Math.random() < Hero.getStyle()*Math.random()){
					enemies[i].health = 0;
					reason = "The Bandit Couldn't Handle Your Style!";
				}else{
					enemies[i].health+=5;
				}
			}else if(running == true){
				if(Math.random() > .80){
					enemies[i].health = 0;
					reason = "You Succesfully Escaped the Bandit!";
				}else{
					enemies[i].health+=5;
				}
			}
		}
		if(enemies[i].health <= 0){
			reason = "You Killed The Bandit!";
		}else if(Hero.getCurrentHealth() <= 0){
			reason = "You were killed by the Bandit";
		}
		Display.output(reason);
	}
	if(Hero.getCurrentHealth()> 0){
		Hero.setAge(Hero.getAge()+1);
		Display.output(questText);
	}
}
	}
}


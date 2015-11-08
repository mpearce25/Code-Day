import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Hideout implements KeyListener {
	public double x;
	public double y;
	public int number_bandits;
	public boolean taunting;
	public boolean fighting;
	public boolean running;
	Hero h;
	Display d;
	String reason;
	Image image;
	public Enemy[] enemies = new Enemy[number_bandits];
	//enemies =  new Enemy[10];
	public Hideout(double x, double y, int number_bandits, Hero h, Display d, Image image){
		this.x = x;
		this.y = y;
		this.number_bandits = number_bandits;
		this.image = image;
	}
	
	//miss when you shoot sometimes
	//make the player know to move on to the next thing after the bandits are killed
	//make the final boss
	@Override
	public void keyPressed(KeyEvent e) {
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
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void battle(){
		if(enemies.length == 1){
			//Mega Boss mode
			enemies[0] = new Enemy(65,10,2000,"");
		}
	for(int i = 0; i<enemies.length;i++){
		enemies[i] = new Enemy(i*5 + 20,i*5,i*5 + 20,"Bandit");
		System.out.println("Hi");
		while(enemies[i].health > 0 && h.getCurrentHealth() > 0){
		if(fighting == true){
			if(enemies[i].attack * Math.random()>h.getAttack()*Math.random()){
				h.setCurrentHealth((int) (h.getCurrentHealth()-enemies[i].attack));
			}else if(enemies[i].attack * Math.random()<h.getAttack()*Math.random()){
				enemies[i].health -= h.getAttack();
			}else if(enemies[i].attack * Math.random() == h.getAttack()*Math.random()){
				enemies[i].style += 10;
				h.setStyle(10);
			}
		}else if(taunting == true){
			if(enemies[i].style * Math.random() < h.getStyle()*Math.random()){
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
		}else if(h.getCurrentHealth() <= 0){
			reason = "You were killed by the Bandit";
		}
		d.output(reason);
	}
	if(h.getCurrentHealth()> 0){
		h.setAge(h.getAge()+1);
		d.output("Congratulations, You beat the bandits!  Move on to the next Quest!");
	}
}
}


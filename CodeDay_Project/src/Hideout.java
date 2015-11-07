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
	String reason;
	public Enemy[] enemies = new Enemy[number_bandits];
	//enemies =  new Enemy[10];
	public Hideout(double x, double y, int number_bandits){
		this.x = x;
		this.y = y;
		this.number_bandits = number_bandits;
	}
	
	//miss when you shoot sometimes

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
	for(int i = 0; i<enemies.length;i++){
		enemies[i] = new Enemy(20,5,20,"Bandit");
		System.out.println("Hi");
		while(enemies[i].health > 0 && h.health > 0){
		if(fighting == true){
			if(enemies[i].attack * Math.random()>h.attack*Math.random()){
				h.health -= enemies[i].attack;
			}else if(enemies[i].attack * Math.random()<h.attack*Math.random()){
				enemies[i].health -= h.attack;
			}else if(enemies[i].attack * Math.random() == h.attack*Math.random()){
				enemies[i].style += 10;
				h.style += 10;
			}
		}else if(taunting == true){
			if(enemies[i].style * Math.random() < h.style*Math.random()){
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
		}else if(h.health <= 0){
			reason = "You were killed by the Bandit";
		}
		display.output(reason);
	}
}
}


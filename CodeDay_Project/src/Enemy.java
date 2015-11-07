import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Enemy implements KeyListener{
	//stats of the enemy
	public double health;
	public double attack;
	public double style;
	public String label;
	public Image image;
	public boolean lost;
	public Enemy(double health, double attack, double style,String label, Image image){
		this.health = health;
		this.attack = attack;
		this.style = style;
		this.label = label;
		this.image = image;
	}
	
	Hero h = new Hero();
	public void fight(Hero h, Enemy e){
		while(e.health > 0){
		double hattack = h.attack*Math.random();
		double eattack = e.attack*Math.random();
		if(hattack > eattack){
			e.health-= hattack;
		}else if(hattack<eattack){
			h.health-= eattack;
		}else if(hattack == eattack){
			h.style+= 10;
			e.style+= 10;
		}
		if(e.health == 0){
			Display.output("You have killed the bandit!");
		}
		}
	}
	//method to run away
	public void run(Hero h, Enemy e){
		if(Math.random() >= .75){
			lost = true;
		}
	}
	//taunt method if one outstyles the other then the other runs away.
	public void taunt(Hero h, Enemy e){
		double hstyle = h.style * Math.random();
		double estyle = e.style * Math.random();
		if(hstyle > e.style){
			e.lost = true;
			display.output("They ran away! You are too cool for them!");
			}
		else{
			e.attack += 5;
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyCode()){
		//f - Fight
		case 70:
			fight(h, this);
			break;
		//t - Taunt
		case 84:
			taunt(h, this);
			break;
		//r - Run away
		case 82:
			run(h, this);
			break;
		}
		
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}

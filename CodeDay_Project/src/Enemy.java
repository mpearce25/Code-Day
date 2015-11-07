import java.awt.Image;


public class Enemy {
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
	public void fight(Hero h, Enemy e){
		double hattack = h.attack*Math.random();
		double eattack = e.attack*Math.random();
		if(hattack > eattack){
			e.health/=2;
		}else if(hattack<eattack){
			h.health/=2;
		}else if(hattack == eattack){
			h.style+= 10;
			e.style+= 10;
		}
	}
	//taunt method if one outstyles the other then the other runs away.
	public void taunt(Hero h, Enemy e){
		double hstyle = h.style * Math.random();
		double estyle = e.style * Math.random();
		if(hstyle > e.style){
			e.lost = true;
		}
		else{
			e.attack += 5;
		}
	}
}

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Enemy{
	//stats of the enemy
	public double health;
	public double attack;
	public double style;
	public String label;
	public Image image;
	public boolean lost;
	public Enemy(double health, double attack, double style,String label){
		this.health = health;
		this.attack = attack;
		this.style = style;
		this.label = label;
	}
}

import java.awt.Image;


public class Enemy {
	//stats of the enemy
	public double health;
	public double attack;
	public double style;
	public String label;
	public Image image;
	public Enemy(double health, double attack, double style,String label, Image image){
		this.health = health;
		this.attack = attack;
		this.style = style;
		this.label = label;
		this.image = image;
	}
}

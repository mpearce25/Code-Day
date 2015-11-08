import java.awt.Image;

public class Enemy{
	//stats of the enemy

	public double health;
	public double attack;
	public double style;
	public String label;
	public Image image;
	public boolean lost;
	public Enemy(double h, double at, double sty,String lbl){
		health = h;
		attack = at;
		style = sty;
		label = lbl;
	}
	public double getHealth() {
		return health;
	}
	public double getAttack() {
		return attack;
	}
	public double getStyle() {
		return style;
	}
	public String getLabel() {
		return label;
	}
	public Image getImage() {
		return image;
	}
	public boolean getLost() {
		return lost;
	}
	public void setHealth(double h) {
		health = h; 
	}
	public void setAttack(double a) {
		attack = a;
	}
	public void setStyle(double s) {
		style = s;
	}
	public void setLabel(String l) {
		label = l;
	}
	public void setLost(Boolean l) {
		lost = l;
	}
}
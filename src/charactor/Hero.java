package charactor;
import property.*;

public abstract class  Hero{
	public String name;
	public int hp;
	int armor;
	int moveSpeed;
	public static int itemCapacity = 8;
	static {
		itemCapacity = 6;
	}
//constructor--------------------------------
	public Hero() {
		
	}
	public Hero(String name,int hp) {

		this.name = name;
		this.hp = hp;
	}
	public Hero(String name,int hp, int armor, int moveSpeed) {
		this(name,hp);
		this.armor = armor;
		this.moveSpeed = moveSpeed;
	}
//methods:----------------------------------
	public void kill (Mortal m) {
		System.out.print(this.name+" ");
		m.die();
	}
	public void addHp(int h) {
		hp += h;
	}
	public void printHeroState() {
		System.out.println("name= "+name+"\nHP= "+hp+"\narmor= "+armor
				+"\nSpeed= "+moveSpeed);
	}
	public boolean equals(Object o) {
		if(o instanceof Hero) {
			Hero h = (Hero)o;
			if(h.hp == this.hp) return true; 
		}
		return false;
	}
	public abstract void attack();
	
//	public void equip(Weapon w) {
//		System.out.println("I get a weapon!");
//	}
//Testblock------------------------------------------
	public static void main (String[] args){
		
//anonymous class
		Hero h1	  = new Hero() {
			public void attack() {
				System.out.println("new attack way");
			}
		};
		ADHero h2 = new ADHero("Timoo",1000,45,380);
		APhero h3 = new APhero("SF",1000,45,380);
//anonymous class
		Item item1 = new Item() {
			public boolean disposable() {
				return true;
			}
		};
//local class
		class NewItem extends Item{
			public boolean disposable() {
				return false;
			}
		}
		h2.attack();
		h1.attack();
//System.out.println(h1.equals(h2));
	}
}










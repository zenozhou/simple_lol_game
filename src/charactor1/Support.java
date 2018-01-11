package charactor1;
import charactor.*;

public class Support extends Hero implements Healer {
//constructor-------------------------------------------
	public Support(String name,int hp,int armor,int moveSpeed) {
		super(name, hp,armor, moveSpeed);
	}
	public Support(String name,int hp) {
		super(name,hp);
	}
//methods---------------------------------------------
	public void heal() {
		System.out.println("this is a Healer interface");
	}
	public void heal(Hero h) {
		System.out.println(this.name +"is healing"+h.name);
	}
	public void heal(Hero h,int hp) {
		System.out.println("before healing "+h.name+"'s hp is "+h.hp);
		System.out.println(this.name +"is healing"+h.name);
		h.addHp(hp);
		System.out.println("after healing "+h.name +"'s hp is "+h.hp);
	}
	public void attack() {
		System.out.println("Support is Attacking!!");
	}
//------------------------------------------------test Main
//	public static void main(String[] args) {
//		Support h0 = new Support("WUYI",1000,14,380);
//		Hero h1 = new Hero("Gareen",2800,38,400);
//		Hero h2 = new Hero("Timmo",1600,16,428);
//		h0.printHeroState();
//		for(int i=0;i<14;i++)
//			System.out.print("--");
//		System.out.print("\n");
//		h1.printHeroState();
//		h2.printHeroState();
//	}
//------------------------------------------------test Main

}

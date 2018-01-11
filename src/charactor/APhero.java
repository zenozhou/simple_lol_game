package charactor;

public class APhero extends Hero implements AP,Mortal {
	
	public APhero() {
		super();
	}
	public APhero(String name,int hp, int armor, int moveSpeed) {
		super(name,hp,armor,moveSpeed);
	}
//methods	--------------------------------------------
	public void attack() {
		System.out.println("APhero is Attacking!!");
	}
	public void die() {
		System.out.println("kill "+this.name+" !");
		
	}
	public void magicAttack() {
		System.out.println("MagicAttacking!");
	}
	
}

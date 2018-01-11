package charactor;

public class ADAPHero extends Hero implements AD,AP,Mortal {
	
	public ADAPHero() {
		super();
	}
	public ADAPHero (String name,int hp, int armor, int moveSpeed) {
		super(name,hp,armor,moveSpeed);
	}
//methods-------------------------------------------
	public void attack() {
		System.out.println("ADAPhero is Attacking!!");
	}
	public void die() {
		System.out.println("ADAPhero is die!!");
		
	}
	public void magicAttack() {
			System.out.println("MagicAttacking!");
	}
	public void physicAttack() {
		System.out.println("physicAttacking!");
	}
}

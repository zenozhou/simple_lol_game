package charactor;

public interface AP {
	public void magicAttack();
	default public void attack() {
		System.out.println("Attacking!from ap interface");
	}
}

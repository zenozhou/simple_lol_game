package property;

public class LifePotion {
	public void effect() {
		System.out.println("Lifepotion help you to revive");
	}
	public boolean disposable() {
		return true; //true means that it will
		//disappear after you use it
	}
}

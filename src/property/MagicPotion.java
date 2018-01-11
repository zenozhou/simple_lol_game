package property;

public class MagicPotion extends Item{
	public void effect() {
		System.out.println("revive your Mana");
	}
	public boolean disposable() {
		return false;
	}
}

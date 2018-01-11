package property;

public abstract class Item {
	String name;
	int price;
//methods----------------------------------------
	public void effect() {
		System.out.println("shiyonghou, you xiaoguoa");
	}
	
	public String toString() {
		return "this item name is"+name+" price is "+ price;
	}
	public void finalize() {
		System.out.println("Oh, "+name+"has been cleaned!");
	}
	public boolean equals(Object o) {
		if(o instanceof Item) {
			Item a = (Item)o;
			if(a.price == this.price) 
				return true;
		}
		return false;
	}
	public abstract boolean disposable();
	
//----------------------------------------	
//single Instance example----------------
//	private Item() {
//		
//	}
//	private static Item instance ;
//	public static Item getInstance() {
//		if(instance == null) 
//			instance = new Item();
//		return instance;
//	}
}

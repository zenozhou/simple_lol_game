package charactor;

public class ADHero extends Hero implements AD,Mortal{
//constructor------------------------------------------
	public ADHero() {
		super();
	}
	public ADHero (String name,int hp, int armor, int moveSpeed) {
		super(name,hp,armor,moveSpeed);
	}
//methods------------------------------------------------
	public void die() {
		System.out.println("kill  "+this.name+" !");
		
	}
	public void physicAttack() {
		System.out.println("PhysicAttacking!");
	}
    public void attack() {
        System.out.println("AD hero "+ name + 
        		" ������һ�ι��� �����ǲ�ȷ������˭��");
    }
 
    // �ɱ������Ĳ���
    public void attack(Hero... heros) {
        for (int i = 0; i < heros.length; i++) {
            System.out.println(name + " ������ " + heros[i].name);
        }
    }
//-------------------------------------------------------------
//test mian()
//    public static void main(String[] args) {
//        ADHero bh = new ADHero();
//        bh.name = "�ͽ�����";
// 
//        Hero h1 = new Hero();
//        h1.name = "����";
//        Hero h2 = new Hero();
//        h2.name = "��Ī";
// 
//        bh.attack(h1);
//        bh.attack(h1, h2);
 
//    }
 
}





















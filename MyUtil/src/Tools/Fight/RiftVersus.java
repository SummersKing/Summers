package Tools.Fight;



public class RiftVersus {

	public static void main(String[] args) {
		Character c1 =new Character("辛德拉",30,1000);
		Character c2 =new Character("亚索",23,1100);
	       Fight1 f1=new Fight1(c1,c2);
	       Fight3 f2 =new Fight3(c2,c1);
	       new Thread(f1,"辛德拉攻击").start();
	       new Thread(f2,"亚索攻击").start();

	}

}

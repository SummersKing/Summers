package Tools.Fight;

import javax.print.attribute.standard.MediaSize.Other;

import sun.security.krb5.internal.crypto.crc32;

public class Fight3 implements Runnable{
	Character c1;
	Character c2;
	boolean jieshu=true;
public Fight3(Character c1,Character c2) {
	this.c1=c1;
	this.c2=c2;
	
	
}
	@Override
	public void run() {
		synchronized (c1) {
			if(!c1.flag&&jieshu) {
				try {
					c1.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(c2.getHp()>0&&jieshu) {
			System.out.println(c1);
			System.out.println(c1.getName()+"发起了攻击");	
			c2.setHp(c1.getHp()-c2.getAttack());
			System.out.println(c2.getName()+"受到了"+c1.getAttack()+"点伤害");
			System.out.println("剩余生命值为"+c2.getHp());

			}else {
				System.out.println(c2.getName()+"已经阵亡");
		             jieshu=true;
			}
			c1.flag=false;
			c1.notifyAll();
		}

		
		
		
		// TODO Auto-generated method stub
		
	}

}

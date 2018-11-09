package Tools.Fight;

import javax.print.attribute.standard.MediaSize.Other;

import sun.security.krb5.internal.crypto.crc32;

public class Fight2 implements Runnable{
	Character c1;
	Character c2;
	boolean jieshu=false;
	boolean flag=true;
	
public Fight2(Character c1,Character c2) {
	this.c1=c1;
	this.c2=c2;
	
	
}
	@Override
	public void run() {
synchronized (this) {
	if(!c2.flag&&jieshu) {//角色2 标签为假时,执行休眠
		try {
			c2.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	try {//延迟显示
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if(c1.getHp()>0&&jieshu) {//角色还有血量时发起攻击
	System.out.println(c2);
	System.out.println(c2.getName()+"发起了攻击");	
	c1.setHp(c1.getHp()-c2.getAttack());
	System.out.println(c1.getName()+"受到了"+c2.getAttack()+"点伤害");
	System.out.println("剩余生命值为"+c1.getHp());

	}else {//触发游戏技术条件
		System.out.println(c1.getName()+"已经阵亡");
             jieshu=false;
	}
	c1.flag=true;
	c2.flag=false;
	c1.notify();
	
	
}
	
		
		
	}

}

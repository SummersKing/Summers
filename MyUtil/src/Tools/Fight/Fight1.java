package Tools.Fight;

import javax.print.attribute.standard.MediaSize.Other;

import sun.security.krb5.internal.crypto.crc32;

public class Fight1 implements Runnable{
	Character c1;
	Character c2;
	boolean jieshu=true;
public Fight1(Character c1,Character c2) {
	this.c1=c1;
	this.c2=c2;
	
	
}
	@Override
	public void run() {
		synchronized (this) {
			if(!c1.flag&&jieshu) {//角色1标签为假且没有处罚结束条件时的时候暂停运行该线程
				try {
					c1.wait();
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
			if(c2.getHp()>0&&jieshu) {//角色2还有血量时开始攻击
			System.out.println(c1);
			System.out.println(c1.getName()+"发起了攻击");	
			c2.setHp(c1.getHp()-c2.getAttack());
			System.out.println(c2.getName()+"受到了"+c1.getAttack()+"点伤害");
			System.out.println("剩余生命值为"+c2.getHp());

			}else {//设置游戏结束条件
				System.out.println(c2.getName()+"已经阵亡");
		             jieshu=false;
			}
			c1.flag=false;//暂停执行角色1线程标签
			c1.notifyAll();//唤醒所有沉睡线程
		}

		
		
		
		// TODO Auto-generated method stub
		
	}

}

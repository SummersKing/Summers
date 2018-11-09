package Tools;
import java.util.*;

/**  

* <p>Title: IdentifyCode</p>  

* <p>Description: 生成一些验证码的方法</p>  

* @author Summer·King  

* <p> @date 2018年11月1日</p>   

*/ 
@Deprecated 
public class IdentifyCode {


	public boolean Indentify() {
		int a= (int) (Math.random()*10);
		int b= (int) (Math.random()*10);
		int c= (int) (Math.random()*10);
		int d= (int) (Math.random()*10);
		String ic=a+""+b+""+c+""+d;
		System.out.println("您的验证码为：");
		System.out.println(ic);
		System.out.println("请输入验证码");
		Scanner sc=new Scanner(System.in);
		String ic2= sc.next();
		if(ic2.length()!=4) {return false;}
		char a1=ic2.charAt(0);  int aa=(int)a1-(int)('0');
	    char b1=ic2.charAt(1);  int bb=(int)b1-(int)('0');
	    char c1=ic2.charAt(2);  int cc=(int)c1-(int)('0');
	    char d1=ic2.charAt(3);  int dd=(int)d1-(int)('0');
		int []icode= {a,b,c,d};
		int []icode1= {aa,bb,cc,dd};
		for(int i=0;i<4;i++) {
			if(icode[i]!=icode1[i]) {
				return false;
			}
		   
		}
		return true;
	}
	/**  
	
	 * <p>Title: identifyCode</p>  
	
	 * <p>Description: 最简单的输出验证码的方法</p>  
	
	 * @return  
	 * <p> @date 2018年10月19日  </p> 
	 */
	public static int identifyCode() {
int ic=(int) (Math.random()*10000);		
		return ic;
	}
	public static int idetifyCode1() {
	Random random=new 	Random();
	int ic=0;
	while(1000>ic) {
		ic = random.nextInt(10000);
	}
	
		return ic;
		
	}
	public static void main(String[] args) {
	Indentifyonlycode();
	}
	
	public boolean Indetify4num () {
	
		
		while(true) {
	    int a=(int)(Math.random()*10000+1);
		
		if(a>=1000&&a<10000) {
			
			int b=(int)(Math.random()*2);
			if(b==1) {
				int c=a/1000;
				  int d=a%1000/100;
				  int e=a%100/10;
				  int f=a%10;
				  String b1=f+""+e+""+d+""+c;
				  System.out.println("您的验证码为");
					System.out.println(b1);
					break;
			}else {
				System.out.println("您的验证码为");
				System.out.println(" "+a);
				break;
			}
		}
		}
		System.out.println("请输入验证码");
		Scanner sc=new Scanner(System.in);
		String ic2= sc.next();
		return true;
	}
    public static void IndentifyWindow() {
        while(true){
       	IdentifyCode a= new IdentifyCode();	
		//boolean flag =a.Indentify();
       	boolean flag =a.Indetify4num();
         if(!flag) {
        	 System.out.println("请输入正确验证码");
        	 continue;
         }else {
         System.out.println("验证通过");
         break ;
	}
        }
          System.out.println("您已登录");
    }
    public static void Indentifyonlycode() {
    	int []ic=new int[4];
    	for(int i=0;i<4;i++) {
             ic[i]=(int)(Math.random()*10);
    	}
    	System.out.println("您的验证码为");
  
		System.out.println(Arrays.toString(ic));
    	
    	
    	
    }

}

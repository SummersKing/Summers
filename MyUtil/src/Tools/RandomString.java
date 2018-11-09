package Tools;

import java.util.HashMap;
import java.util.Random;

/**  

* <p>Title: RandomString</p>  

* <p>Description:生成一些随机的字符串 </p>  

* @author Summer·King  

* <p> @date 2018年9月5日</p>   

*/ 
public class RandomString {
    public static final String SOURCES ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
    public static final String CHINESEFIRSTNAME =" "
    		+ "许 韩 冯 邓 曹 彭 曾 萧 田 董 潘 袁 于 蒋 蔡 余 杜 叶 程 苏 魏 吕 丁 任 沈"
    		+ "姚 卢 姜 崔 钟 谭 陆 汪 范 金 石 廖 贾 夏 韦 傅 方 白 邹 孟 熊 秦 邱 江 尹"
    		+ "薛 阎 段 雷 侯 龙 史 陶 黎 贺 顾 毛 郝 龚 邵 万 钱 严 覃 武 戴 莫 孔 向 汤";
    /**  
    
     * <p>Title: getString</p>  
    
     * <p>Description:获取一定长度的字符 </p>  
    
     * @param length
     * @return   string
     * <p> @date 2018年9月5日  </p> 
     */
    public static String getString(int length) {
        char[] text = new char[length];
    	Random random=new Random();
        for (int i = 0; i < length; i++) {
        	int c=random.nextInt(SOURCES.length());//随机生成source.length()以内的整数
            text[i] = SOURCES.charAt(c);//取字符串source的第c个值
        }
        return new String(text);
    }
    
    
    /**  
    
     * <p>Title: getString</p>  
    
     * <p>Description:从字符串data中随机获取length的长度</p>  
    
     * @param data
     * @param length
     * @return  
     * <p> @date 2018年9月5日  </p> 
     */
    public static String getString(String data,int length) {
        char[] text = new char[length];
    	Random random=new Random();
        for (int i = 0; i < length; i++) {
        	int c=random.nextInt(data.length());//随机生成source.length()以内的整数
            text[i] = data.charAt(c);//取字符串source的第c个值
        }
        return new String(text);
    }
    
    
    
    
    
    
    
    
    /**  
    
     * <p>Title: getChinesSurname</p>  
    
     * <p>Description: 获取汉字姓，失败</p>  
    
     * @return  
     * <p> @date 2018年9月5日  </p> 
     */
    public static char getChinesSurname() {
    	Random random=new Random();
		HashMap<String , String> data=new HashMap<>();
	   data.put("xxl", "王李张刘郑梁谢宋王李张刘郑梁谢唐胡郭何何何何何高林陈王李张刘杨黄赵吴周徐罗");//55%
	   String values=data.get("xxl");
	   char surname=values.charAt(random.nextInt(values.length()));
		return surname;   	
    }
    public static void main(String[] args) {
getRandomChineseName();
getRandomChineseNameAndGender();
	}
    
    /**  
    
     * <p>Title: getChineseName</p>  
    
     * <p>Description: 获取一个固定长度固定性别的中国名字</p>  
    
     * @param gender
     * @param length
     * @return  
     * <p> @date 2018年10月27日  </p> 
     */
    public static String getChineseName(int gender,int length) {
    	String lastname= String.valueOf(getChinesSurname());
    	Random random=new Random();
		String namelist=gender==0?"芳香畅林颖宛静婷洁春如":"坤伟明涛健海康标杨国军良杰"; 
		String name=null;
		String firstname=null;
		for(int i=0;i<length;i++) {
	if(firstname==null) {
	    firstname= String.valueOf(getString(namelist,random.nextInt(1)+1));//字符串拼接，以及char数组转string;
	}else {
		firstname+=String.valueOf(getString(namelist,random.nextInt(1)+1));
	}
			}name=lastname+firstname;
         return name;
    }
    
    
    /**  
    
     * <p>Title: getRandomChineseName</p>  
    
     * <p>Description: 获取一个只有名字的随机中文名</p>  
    
     * @return  
     * <p> @date 2018年10月27日  </p> 
     */
    public static String getRandomChineseName() {
    	String name=null;
    	Random random=new Random();
    	   	int gender = random.nextInt(2);
    	   	int length=random.nextInt(2)+1;
        	name = getChineseName(gender,length);
		return name;
    	
    }
    
    /**  
    
     * <p>Title: getRandomChineseNameAndGender</p>  
    
     * <p>Description: 获取一个性别和长度随机的名字返回值格式为（性别）姓名</p>  
    
     * @return  
     * <p> @date 2018年10月27日  </p> 
     */
    public static String getRandomChineseNameAndGender() {
    	String name=null;
    	Random random=new Random();
    	   	int gender = random.nextInt(2);
    	   	int length=random.nextInt(2)+1;
        	name = gender+getChineseName(gender,length);
		return name;
    }
    
    
}
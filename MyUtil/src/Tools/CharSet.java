package Tools;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Set;


public class CharSet {
	private static Charset charset=null;
/**  

 * <p>Title: showAliases</p>  

 * <p>Description: 展示一个字符集的所有别名</p>  

 * @param charName  字符集名称
 * <p> @date 2018年10月11日  </p> 
 */
public static void showAliases(String charName) {
      charset= Charset.forName(charName);
	Set<String>charSet=charset.aliases();
	for(String name:charSet) System.out.print(name+" ");	
		}
/**  

 * <p>Title: availableChar</p>  

 * <p>Description:查看某个特定实现中那些字符集可用 </p>  

 * @param charName  
 * <p> @date 2018年10月11日  </p> 
 */
public static void availableChar(String charName) {
	Map<String, Charset>charsets=Charset.availableCharsets();
	for(String name:charsets.keySet()) System.out.println(name+" ");	
}

/**  

 * <p>Title: transCode</p>  

 * <p>Description:将一个字符进行转码 </p>  

 * @param charName
 * @param str
 * @return  
 * <p> @date 2018年11月1日  </p> 
 */
public static String  transCode(String charName, String str) {
	   charset= Charset.forName(charName);
	  ByteBuffer byteBuffer=charset.encode(str);//将字符串以字符形式编码
	   CharBuffer charBuffer=charset.decode(byteBuffer);//将字节缓冲区转化为字符缓冲区
         	   str=charBuffer.toString();
	
	return str;
	
}


}


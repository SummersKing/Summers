package Tools;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class SystemTool {

	public static void main(String[] args) {
		
		HashMap<String, String> systemProperty = getSystemProperty();
		
	}
/**  

 * <p>Title: getSystemProperty</p>  

 * <p>Description: system类中一些属性值</p>  
  
 * <p> @date 2018年10月26日  </p> 
 */
public static HashMap<String, String> getSystemProperty() {
	HashMap<String, String> systemProperty=new HashMap<>();
	String version = System.getProperty("java.version");
	systemProperty.put("java.version", version);
	String vendor = System.getProperty("java.vendor");
	systemProperty.put("java.vendor", vendor);
	String home = System.getProperty("java.home");
	systemProperty.put("java.home", home);
	String jvmversion = System.getProperty("java.vm.version");
	systemProperty.put("jvm.version",jvmversion);
	String username = System.getProperty("user.name");
	systemProperty.put("user.name",username);
	String osVersion = System.getProperty("os.version");
	systemProperty.put("os.version",osVersion);
	String userDir = System.getProperty("user.dir");
	systemProperty.put("user.dir",userDir);
	
	Set<String> keySet = systemProperty.keySet();
	Iterator<String> itkey = keySet.iterator();
	while (itkey.hasNext()) {
		String next = itkey.next();
		System.out.print(next+":   ");
		System.out.print(systemProperty.get(next));
		System.out.println();
	}
	
	return systemProperty;
	
}
}

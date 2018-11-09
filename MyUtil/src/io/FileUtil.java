package io;

import java.io.File;
import java.util.Arrays;


public class FileUtil {


	/**  
	
	 * <p>Title: getFileList</p>  
	
	 * <p>Description:遍历打印一个路径中的文件列表</p>  
	
	 * @param path
	 * @return  
	 * <p> @date 2018年11月1日  </p> 
	 */
	public static File[] getFileList(String path) {
		File root = new File(path);
		String path2 = root.getPath();
		System.out.println(path2);
		File[] listFiles = root.listFiles();
		String[] list = root.list();
		System.out.println(Arrays.toString(list));
		for (File file : listFiles) {
			String name = file.getName();
			String absolutePath = file.getAbsolutePath();
			System.out.println(name);
		}

		
		return listFiles;
		
	}

}

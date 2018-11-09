package io;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import com.monitorjbl.xlsx.StreamingReader;
import com.monitorjbl.xlsx.StreamingReader.Builder;

public class CSV {

	public static void main(String[] args) {
		excelToCsv("d://data.xlsx");
	}

	@SuppressWarnings("resource")
	public static void excelToCsv(String path) {
		Workbook workbook = null;
		BufferedWriter bw = null;
		try {
			
			//文件输入流
//			FileInputStream fis = new FileInputStream(path);
//			Builder builder = StreamingReader.builder();
//			Builder bufferSize = builder.bufferSize(4096);
//			Builder rowCacheSize = bufferSize.rowCacheSize(200);
//			
//					workbook = rowCacheSize.open(fis);
			workbook = StreamingReader.builder().bufferSize(4096).rowCacheSize(200).open(new FileInputStream(path));
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("d://data.csv"), "utf-8"));
			Sheet sheet = workbook.getSheetAt(0);
			for (Row row : sheet) {
				for (Cell cell : row) {
					if (cell.getCellTypeEnum() == CellType.STRING)
						bw.write(cell.getStringCellValue());
					if (cell.getCellTypeEnum() == CellType.NUMERIC)
						bw.write("" + cell.getNumericCellValue());
					if (cell.getCellTypeEnum() == CellType.BOOLEAN)
						bw.write("" + cell.getBooleanCellValue());
					bw.write(",");
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(bw!=null)
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(workbook!=null)
				workbook.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}

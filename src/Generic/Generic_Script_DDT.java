package Generic;

import java.io.FileInputStream;


import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_Script_DDT
{
public void fetchdata(String path,String sheet, int row,int cell) throws Exception
{
	FileInputStream fis=new FileInputStream(path);
	Workbook wb=WorkbookFactory.create(fis);
    Sheet sh=wb.getSheet(sheet);
    int r=sh.getLastRowNum();
    for(int i=0;i<=r;i++)
    {
    	Row rr=sh.getRow(i);
    	int c=rr.getLastCellNum();
    	for(int j=0;j<c;c++)
    	{
    		Cell cc=rr.getCell(j);
    		String data=cc.toString();
    		System.out.println(data);
    	}
    }
	
	
}
public void writedata(String path,String sheet, int row,String data) throws Exception
{
	FileInputStream fis=new FileInputStream(path);
	Workbook wb=WorkbookFactory.create(fis);
    Sheet sh=wb.getSheet(sheet);
        	Row rr=sh.createRow(row);
    	    Cell cc=rr.createCell(0);
    		cc.setCellValue(data);
    		FileOutputStream fos= new FileOutputStream(path);
    		wb.write(fos);
}

}


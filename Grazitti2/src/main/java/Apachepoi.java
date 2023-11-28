import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Apachepoi {
    public static void main (String[] args) throws IOException {
        File file = new File("C:\\Users\\vinay.kumar3\\Downloads\\file_example_XLS_10.xls");
        FileInputStream inputStream = new FileInputStream(file);
        HSSFWorkbook wb=new HSSFWorkbook(inputStream);
        HSSFSheet sheet = wb.getSheet("STUDENT_DATA");
        //Create a row object to retrieve row at index 1
        HSSFRow row2=sheet.getRow(1);

        //Create a cell object to retreive cell at index 5
        HSSFCell cell=row2.getCell(5);

        //Get the address in a variable
        String address= cell.getStringCellValue();

        //Printing the address
        System.out.println("Address is :"+ address);

/*//input[contains(@placeholder, "example")
//input[starts-with(@placeholder, "example")
 */
    }
}

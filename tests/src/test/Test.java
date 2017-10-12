package test;

//import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//import org.apache.poi.openxml4j.opc.OPCPackage;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Name;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test {
	
    public static void main(String[] args) throws ParseException {
        //test1();
        test2();
    }
    
    static void test2() throws ParseException{
    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    	Date date = sdf.parse("13/03/2017");
    	sdf.applyPattern("dd/MM/yyyy");
    	date.setDate(date.getDate() + 120 - 1);
    	String datestr = sdf.format(date);
    	System.out.println(datestr);
    }
    
//    static void test1(){
//    	try
//        {           
//            String jobName = "I am a job"; 
//            String jobParent = "I am your father, Job.";        
//            int rowNum = 40;
//            int deface = 4;
//
//            //Open Excel as OOXML
//            XSSFWorkbook currentWorkbook = new XSSFWorkbook(new FileInputStream(new File ("D:\\CREDO\\nomFichier.xlsx")));
//
//            //Get sheet in position 0
//            Sheet currentSheet = currentWorkbook.getSheetAt(0);
//
//            //Get sheet name for processing
//            String sheetName = currentSheet.getSheetName();
//
//            //Set values for headers
//            currentSheet.getRow(1).getCell(0).setCellValue(jobName);            
//            currentSheet.getRow(1).getCell(1).setCellValue(jobParent);              
//
//            for (int i=0; i<rowNum; i++)
//            {
//                //Create row in a given position
//                Row newRow = currentSheet.createRow(i+deface);
//
//                //Create cell within row
//                Cell newCell0 = newRow.createCell(0);
//                Cell newCell1 = newRow.createCell(1);
//                Cell newCell2 = newRow.createCell(2);
//                String cellDate = "";
//
//                /* Set CellType
//                 *  0 - Numeric | 1 - String | 2 - Formula | 3 - Blank | 4 - Boolean | 5 - Error */
//                newCell0.setCellType(0);
//                cellDate = "3/"+(i+1)+"/2001 00:00:00";
//
//                //Convert text into date
//                Date currentCellDate = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").parse(cellDate);
//                //System.out.println(currentCellDate.toString()+"--"+cellDate);
//
//                //Set CellValue
//                newCell0.setCellValue(currentCellDate);
//
//
//                cellDate = "4/"+(i+1)+"/2001 00:00:00"; 
//                currentCellDate = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").parse(cellDate);
//                //System.out.println(currentCellDate.toString()+"--"+cellDate);             
//                newCell1.setCellType(0);
//                newCell1.setCellValue(currentCellDate);
//
//                //setCellFormula sets the formula to be evaluated by excel, it doesn't need to start with '=' 
//                newCell2.setCellFormula("A" + (i+deface+1) + "-B" + (i+deface+1));              
//            }           
//
//            //Search for named range
//            Name rangeCell = currentWorkbook.getName("startRange");         
//            //Set new range for named range 
//            String reference = sheetName + "!$A$" + ( deface+1 ) + ":$A$" + ( rowNum+deface );          
//            //Assigns range value to named range
//            rangeCell.setRefersToFormula(reference);
//
//            rangeCell = currentWorkbook.getName("endRange");            
//            reference = sheetName + "!$B$"+(deface+1) + ":$B$" + (rowNum+deface);
//            rangeCell.setRefersToFormula(reference);            
//
//            rangeCell = currentWorkbook.getName("elapsedTime");
//            reference = sheetName + "!$C$"+(deface+1) + ":$C$" + (rowNum+deface);
//            rangeCell.setRefersToFormula(reference);
//
//            //Create a fileStream to write into a file
//            FileOutputStream newExcelFile = new FileOutputStream(jobName+".xlsx");
//
//            //Write Stream
//            currentWorkbook.write(newExcelFile);
//
//            //Close New Excel File
//            newExcelFile.close();           
//        }
//        catch (Exception e)
//        {
//            System.out.println("AAAAARGH, I was wounded by the following exception!:");
//            e.printStackTrace();
//            System.out.println("Sorry, your program is dead :(");
//        }
//    }
}
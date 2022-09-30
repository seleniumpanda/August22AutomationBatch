package filehandling;

public class Manage_ExcelFile {

	public static void main(String[] args) {
		
	String path = System.getProperty("user.dir") + "\\src\\test\\resources\\SampleData.xlsx";
	
	Xls_Reader xls = new Xls_Reader(path);
	
	
	//counting rows
	int rows = xls.getRowCount("ShoppingTest");
	System.out.println(rows);
	
	//counting cols
	int cols = xls.getColumnCount("ShoppingTest");
	System.out.println(cols);	
	
	//reading Data from Excel file
	String data = xls.getCellData("ShoppingTest", 2, 3);
	System.out.println(data);
	
	String data1 = xls.getCellData("ShoppingTest", "Browser", 2);
	System.out.println(data1);
	
	String data2 = xls.getCellData("ShoppingTest", "MaxCost", 4);
	System.out.println(data2);
	//writing Data into Excel file

	}

}

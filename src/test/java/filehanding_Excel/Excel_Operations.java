package filehanding_Excel;

public class Excel_Operations {

	public static void main(String[] args) {
		// Step 1 - Create your Excel file (all data is stored)
		// Step 2 - You need to update your pom.xml file with lot of Apache Poi maven
		// dependencies
		// Step 3 - You have utilize a utility file to do Excel operations (Xls_Reader)
		// Step 4 - you need to know what operations are required

		String path = System.getProperty("user.dir") + "\\src\\test\\java\\filehanding_Excel\\SampleData.xlsx";

		Xls_Reader xls = new Xls_Reader(path);
		
		//1. get row count
		int rows = xls.getRowCount("ShoppingTest");
		System.out.println(rows);
		
		//2. get col count
		int cols = xls.getColumnCount("ShoppingTest");
		System.out.println(cols);
		
		//3. Read data from Excel file
		String data = xls.getCellData("ShoppingTest", "ProductName", 3);
		System.out.println(data);
		
		String data1 = xls.getCellData("ShoppingTest", "ProductName", 4);
		System.out.println(data1);
		
		/*
		 * //4. Write into data file boolean dataEntry = xls.setCellData("ShoppingTest",
		 * "ProductName", 10, "EnteringDataIntoThisExcel");
		 * System.out.println(dataEntry);
		 */

	}

}

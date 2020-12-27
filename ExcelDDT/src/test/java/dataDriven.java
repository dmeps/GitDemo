import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {

	@SuppressWarnings({ "resource" })
	public ArrayList<String> getData(String name) throws IOException {
		ArrayList<String> arr = new ArrayList<String>();
		FileInputStream fis = new FileInputStream("C:\\Users\\dmeps\\eclipse-workspace\\ExcelDDT\\Rock.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheets = workbook.getNumberOfSheets();
		for (int a = 0; a < sheets; a++) {
			if (workbook.getSheetName(a).equalsIgnoreCase("sheet1")) {
				XSSFSheet sheet = workbook.getSheetAt(a);
				// identify column by scanning first row (col headers)
				Iterator<Row> rows = sheet.iterator();
				Row firstRow = rows.next();
				Iterator<Cell> cols = firstRow.cellIterator();
				int x = 0;
				int column = 0;
				while (cols.hasNext()) {
					Cell value = cols.next();
					if (value.getStringCellValue().equalsIgnoreCase("guitarist")) { // desired column
						column = x;
					}
					x++;
				}
				// identify row by scanning the desired column
				while (rows.hasNext()) {
					Row r = rows.next();
					if (r.getCell(column).getStringCellValue().contains(name)) {
//					if (r.getCell(column).getNumericCellValue() == i) { for numeric
						// grab cells value of this specific row
						Iterator<Cell> celVal = r.cellIterator();
						while (celVal.hasNext()) {
							Cell cl = celVal.next();
							if (cl.getCellType() == CellType.STRING) {
								String cvalue = cl.getStringCellValue();
//								System.out.println(cvalue);
								arr.add(cvalue);
							} else {
								String cvalue = NumberToTextConverter.toText(cl.getNumericCellValue());
								arr.add(cvalue);
							}
						}
					}
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
	}
}
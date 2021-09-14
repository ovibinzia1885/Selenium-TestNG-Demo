import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class utilis {
    public static void readFromExcel(String filePath, String fileName, String sheetName) throws FileNotFoundException {
        File file = new File(filePath + "\\" + fileName);
        FileInputStream inputStream = new FileInputStream(file);
        Workbook workbook = null;
        String fileExtensionName = fileName.substring(fileName.indexOf("."));
        if (fileExtensionName.equals(".xls")) {
            workbook = new HSSFWorkbook(inputStream);
        }
        Sheet sheet = workbook.getSheet(sheetName);
        int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
        for (int j = 0; j < row.getLastCellNum(); j++) {
            System.out.print((row.getCell(j).getStringCellValue()) + "|| ");
        }
        System.out.println();
    }
}
}

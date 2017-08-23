package com.utils;

import java.text.DecimalFormat;

import org.apache.poi.hssf.usermodel.HSSFCell;

public class ExcelUtil {
	
	 /**
     * 根据HSSFCell类型设置数据
     * @param cell
     * @return
     */
    public static String getCellFormatValue(HSSFCell cell) {
        String cellValue = "";
        if (cell != null) {
        	
        	switch (cell.getCellType()) {  
            case HSSFCell.CELL_TYPE_NUMERIC: // 数字  
                DecimalFormat df = new DecimalFormat("0"); 
                cellValue = df.format(cell.getNumericCellValue());
                break;  

            case HSSFCell.CELL_TYPE_STRING: // 字符串  
                cellValue = cell.getStringCellValue();  
                break;  

            case HSSFCell.CELL_TYPE_BOOLEAN: // Boolean  
                cellValue = cell.getBooleanCellValue() + "";  
                break;  

            case HSSFCell.CELL_TYPE_FORMULA: // 公式  
                cellValue = cell.getCellFormula() + "";  
                break;  

            case HSSFCell.CELL_TYPE_BLANK: // 空值  
                cellValue = "";  
                break;  

            case HSSFCell.CELL_TYPE_ERROR: // 故障  
                cellValue = "非法字符";  
                break;  

            default:  
                cellValue = "未知类型";  
                break;  
            }  
        } else {
        	cellValue = "";
        }
        return cellValue;

    }
}

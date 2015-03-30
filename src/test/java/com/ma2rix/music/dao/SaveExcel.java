package com.ma2rix.music.dao;

import java.io.File;
import java.util.List;

//import jxl.Workbook;
//import jxl.write.Label;
//import jxl.write.WritableSheet;
//import jxl.write.WritableWorkbook;

/**
 * jxl 사용
 * @author Antop
 *
 */
public class SaveExcel {

	public SaveExcel(List<String> hangulList, String saveFile) {
		
		File file = new File(saveFile);
		
//		WritableWorkbook workbook = null;
		
		try {
			System.out.println("엑셀 저장중... " + file.toString());
			
			// 엑셀 파일 생성
//			workbook = Workbook.createWorkbook(file);
			// 시트 생성
//			workbook.createSheet("결과", 0);
			// 시트 가져오기
//			WritableSheet sheet = workbook.getSheet(0);
			
			
			int col = 0;
			int maxRow = hangulList.size();
			
			for(int row=0 ; row < maxRow ; row++) {
				// 시트에 입력[Ax] 칸에 입력
//				sheet.addCell( new Label(col, row, hangulList.get(row)) );
			}
			
			// 저장
//			workbook.write();
						
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
//				workbook.close();
			} catch (Exception ignore) {
				
			}
		}

		System.out.println("엑셀 저장 완료");
		
	}
	
}

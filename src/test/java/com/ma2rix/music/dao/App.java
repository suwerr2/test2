package com.ma2rix.music.dao;

import java.util.List;

public class App {

	public static void main(String[] args) {
		
		try {
			/**
			 * 추출할 폴더(하위폴더도 다 추출함)
			 */
			String dir = "D:\\springsource\\vfabric-tc-server-developer-2.9.5.SR1\\base-instance\\wtpwebapps\\music\\WEB-INF\\views";
			/**
			 * 추출할 확장자
			 * String[]
			 */
			// String[] exts = new String[] {"jsp", "java"};
			String[] exts = new String[] {"jsp"};
			/**
			 * 추출할 파일의 인코딩 타입
			 * euc-kr , utf-8 등
			 */
			String charset = "utf-8";
			/**
			 * 저장할 엑셀 파일
			 */
			String saveFile = "D:\\result.xls";
			
			// 디렉토리에서 확장자에 해당하는 파일 목록 추출
			List<String> fileList = new SearchDirectory(dir, exts).getList();
			// 파일 목록에서 한글을 추출 
			List<String> hangulList = new FindHangul(fileList, charset).getList();
			// 한글 목록을 엑셀로 저장
			new SaveExcel(hangulList, saveFile);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

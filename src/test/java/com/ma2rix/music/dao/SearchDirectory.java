package com.ma2rix.music.dao;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchDirectory {
	// 추출된 파일이 담길 리스트
	private List<String> fileList = new ArrayList<String>();
	// 검사할 확장자
	private String[] exts;
	
	public SearchDirectory(String dir, String[] exts) throws Exception {
		this.exts = exts;
		
		File root = new File(dir);
		
		if(root.exists() == false) {
			throw new Exception("존재하지 않는 디렉토리");
		}
		
		if(root.isDirectory() == false) {
			throw new Exception("디렉토리가 아님");
		}			
		
		// 파일 추출 시작
		searchDirectory(root);

	}
	
	private void searchDirectory(File dir) throws IOException {
				
		File[] fileList = dir.listFiles();
		File f = null;
		String ext;
		
		int size = fileList.length;
		for(int i=0 ; i < size ; i++) {
			f = fileList[i];
			
			if(f.isDirectory() == true) {
				// 디렉토리일 경우 다시 탐색
				searchDirectory(f);
			} else {
				// 확장자 추출
				ext = f.toString().substring( f.toString().lastIndexOf(".")+1, f.toString().length() );
												
				// 해당 확장자에 포함되는 것만 목록에 담는다.
				if(inExts(ext) == true) {
					this.fileList.add( f.getCanonicalPath() );
				}
			}			
		}
				
	}
	
	// 확장자 배열 속에 찾는 확장자가 있는지 검사
	private boolean inExts(String ext) {
		int size = this.exts.length;
		for(int i=0 ; i < size ; i++) {
			if(ext.equals(this.exts[i])) {
				return true;
			}
		}
		return false;
	}
	
	// 파일 목록 반환
	public List<String> getList() {
		return this.fileList;				
	}
	
}

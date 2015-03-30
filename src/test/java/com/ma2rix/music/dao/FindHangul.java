package com.ma2rix.music.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FindHangul {

	private List<String> hangulList = new ArrayList<String>();
	
	public FindHangul(List<String> fileList, String charset) {
		
		File file = null;
		BufferedReader br = null;
		
		try {
			
			String line = "";
			
			int startIdx = -1;
			int endIdx = -1;
			int length = 0;
			String c = "";
			String sub = "";
			
			int size = fileList.size();
			for(int i=0 ; i < size ; i ++) {
				
				// 파일 읽기
				file = new File(fileList.get(i));
				br = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));

				System.out.println("한글 추출... " + fileList.get(i));
				
				// 한 라인씩 읽어들인다.
				while( (line = br.readLine()) != null ) {
			
					length = line.length();
					
					/**
					 * 한글 찾기
					 * "서윤정 ㅁㄴdfdf 그러니까?" -> "서윤정 ㅁㄴdfdf 그러니까"
					 * "abcd 안 서" -> "안 서"
					 * "<td>제목</td><td>이름</td>" -> 제목</td><td>이름"
					 */
					
					// 앞에서부터 한글 찾기
					for(int j=0 ; j < length ; j++) {
						c = line.substring(j, j+1);
						if( c.matches("[가-힣]") == true ) {
							startIdx = j;
						}
						
						// 앞에서부터 한글을 찾았으면 그만~
						if(startIdx != -1) {
							break;
						}
					} // end for
					
					// 뒤에서부터 한글 찾기
					for(int j=length ; j > 0 ; j--) {
						c = line.substring(j-1, j);
						
						if( c.matches("[가-힣]") == true ) {
							endIdx = j;
						}
						
						if(endIdx != -1) {
							break;
						}
					} // end for
					
					// 찾은 앞에서부터 뒤에까지 잘른다.
					if(startIdx != -1 && endIdx != -1) {
						sub = line.substring(startIdx, endIdx);
						
						// 중복으로 들어가기 때문에 지웠다가 넣기
						hangulList.remove(sub);
						hangulList.add(sub);
					}
					/**
					 * 한글 찾기 끝
					 */
					
					// 초기화
					startIdx = -1;
					endIdx = -1;
									
				} // end while			
				
			} // end for
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception ignore) { }
			
		}

	}
	
	// 한글 목록 반환
	public List<String> getList() {
		return this.hangulList;
	}
}

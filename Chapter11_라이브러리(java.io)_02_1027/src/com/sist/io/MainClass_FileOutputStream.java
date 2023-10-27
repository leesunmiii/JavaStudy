package com.sist.io;
// => 한글 파일 읽기 => (X) => 다운로드 / 업로드
// read() / write() / => append
// => new FileInputStream  new FileOutStream ("경로명")
// => create => new FileOutputStream("경로명",true)
// 파일은 반드시 닫는다

import java.util.*;
import java.io.*;
public class MainClass_FileOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String[] cate= {
					"얼큰한 칼국수 맛집 베스트 20곳",
					"여의도 맛집 베스트 50곳",
					"일본 라멘 맛집 베스트 70곳",
					"어복쟁반 맛집 베스트 15곳",
					"한식 주점 베스트 30곳"
			};
			// category.txt
			for(String s:cate)
			{
				// 파일 저장
				FileOutputStream fos=new FileOutputStream("c:\\java_data\\category.txt",true);
				//																		-----를 붙여야 문장 다 들어감. 안붙이면 한줄씩 덮어씌워져서 한식 주점 저것만 저장됨
				fos.write((s+"\r\n").getBytes());
				//			  -- 이걸 붙여야 
				// 문자열을 byte[] 로 변환 => getBytes()
				fos.close();
			}
			System.out.println("파일 저장 완료!!");
		}catch(Exception ex) {
			
		}
	}

}

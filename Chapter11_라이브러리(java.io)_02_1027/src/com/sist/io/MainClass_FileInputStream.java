package com.sist.io;
import java.io.*;
public class MainClass_FileInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//FileInputStream fis=new FileInputStream("c:\\java_data\\category.txt"); // 한글이 깨진다
			FileReader fis=new FileReader("c:\\java_data\\category.txt");
			int i=0; // 한 글자씩 읽어온다 => ASC(문자번호)
			// A => 65
			// 파일 끝날때까지 읽어온다 => -1(EOF)
			// 바이트 스트림은 => 한글 파일 읽기 이런 용도가 아님, 파일 업로드나 다운로드 할 때 사용하는 것
			String msg="";
			while((i=fis.read())!=-1)
			{
				msg+=(char)i;
			}
			fis.close();
			System.out.println(msg);
		}catch(Exception ex) {}
	}

}

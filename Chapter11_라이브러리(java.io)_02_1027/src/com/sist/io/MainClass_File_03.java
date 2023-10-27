package com.sist.io;
// 파일 정보 출력
import java.io.*;
import java.util.*;
import java.text.*;

/*
 		getName(), getPath(), length()
 * 
 */
public class MainClass_File_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			File file=new File("c:\\javaDev\\movie.txt");
			System.out.println("최종 수정일 : "+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(file.lastModified())));
			System.out.println("===== 기타 정보 =====");
			System.out.println("***파일명:"+file.getName());
			System.out.println("***경로명+파일명:"+file.getPath());
			System.out.println("경로명:"+file.getParent());
			System.out.println("읽기 가능:"+file.canRead());
			System.out.println("쓰기 가능:"+file.canWrite());
			System.out.println("숨김 파일:"+file.isHidden());
			System.out.println("절대경로:"+file.getAbsolutePath());
			System.out.println("정규경로"+file.getCanonicalPath());
			System.out.println("파일 크기:"+ file.length());
			System.out.println("File.pathSeparator-"+File.pathSeparator);
			System.out.println(file.separator);
			long size=file.length();
			String ss="";
			if(size/1024>0)
				ss=(size/1024)+"KB";
			else
				ss=size+"Bytes";
		}catch(Exception ex) {}
		
		
	}

}

//startWith,endWith,contains => 검색기, 자동완성기

import java.util.Scanner;	
public class 문자열_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data= {
				"Java AND JSP",
				"Java AND Oracle",
				"Oracle Programming",
				"JQuery AND AJAX",
				"Spring AND Java"
		};
		Scanner scan=new Scanner(System.in);
		System.out.println("검색어 입력:");
		String findData=scan.nextLine();
		System.out.println(findData);
		for(int i=0;i<data.length;i++)
		{
			if(data[1].contains(findData))
			//if(data[1].endsWith(findData))
			//if(data[i].startsWith(findData))
			{
				try
				{
					Thread.sleep(100);
				}catch(Exception ex) {}
				System.out.println(data[i]);
			}
		}
		}
	}



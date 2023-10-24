package com.sist.seoul;

import com.sist.music.Music;
import com.sist.music.MusicManager;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeoulManager m=new SeoulManager();
		Seoul[] seoul=m.SeoulAllData();
		for(Seoul ss:seoul)
		{
			System.out.println(ss.getRank()+"."+ss.getExplain());
		}
	}

}

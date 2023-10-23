package com.sist.common;
//이미지 크기를 조절할 수 있게 해주는 소스
import java.awt.Image;

import javax.swing.ImageIcon;

public class ImageChange {
	public static Image getImage(ImageIcon icon,int w,int h) 
	{
		return icon.getImage().
				getScaledInstance(w,h,Image.SCALE_SMOOTH);
	}
}

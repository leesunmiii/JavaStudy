import java.text.DecimalFormat;

class Ressclass {
	int good_no;
	String goods_discoint;
	String goods_poster;
	String goods_name;
	
}
class 뮤직 {
	int music_no;
	int rank;
	String state;
	int idcrement;
	String poster;
	String title;
	String singer;
	String albunm;
	int like;
	
}
//class 맛집_카테고리{ //3번 정답
//	int food_cate_no;
//	String title;
//	String subject;
//	String poster;
//}
//new => 새로운 메모리 공간 생성

public class 정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int like=323457;
		//라이브러리
		// => 숫자 => int
		DecimalFormat df=new DecimalFormat("###,###");
		System.out.println("♡ "+df.format(like));
	}

}

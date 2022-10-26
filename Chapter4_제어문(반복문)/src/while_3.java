import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class while_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("====== Menu ======");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 영화목록");
			System.out.println("4. 영화상세");
			System.out.println("5. 영화예매");
			System.out.println("6. 종료");
			System.out.println("=================");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			if(menu==1) {
				break;
			}
			else if(menu==2) {
				break;
			}
			else if(menu==3) {
				movieList();
				break;
			}
			else if(menu==4) {
				break;
			}
			else if(menu==5) {
				break;
			}
			else if(menu==6) {
				System.out.println("종료");
				System.exit(0);
			}
			else {
				System.out.println("Error");
			}
		}//while
		
		
	}

	static void movieList() {
		try {
			Document doc=Jsoup.connect("https://movie.daum.net/ranking/reservation").get();
			Elements title=doc.select("strong.tit_item a.link_txt");
			Elements reserve=doc.select("span.info_txt span.txt_num");
			
			for(int i=0; i<=title.size();i++) {
				System.out.println((i+1)+ "." + title.get(i).text()+"("+reserve.get(i).text()+")");
			}
		}catch(Exception e) {
			
		}
	}
}

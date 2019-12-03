package java_20191203;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Cral {

	public static void main(String[] args) {
		
		String url = "http://www.imbc.com/";
		//HTML 문서 전체를 관리하기 위한 객체
		Document doc = null;
		Document doc2 = null;
		
		try {
			doc = Jsoup.connect(url).get();
			System.out.println("성공");

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Elements elements = doc.select(".con-wrap.notice-wrap");
		//Elements titleElements = elements.select("h3");
		Elements liElements = elements.select("ul li");
		
		for (int i = 0; i < liElements.size(); i++) {
			Element liElement = liElements.get(i);
			String href = liElement.select("a").attr("abs:href");  //absolute hyper link 를 이용해서 연결
			try{
				doc2 = Jsoup.connect(href).get();
			} catch(IOException e){
				e.printStackTrace();
			}
			Elements ele = doc2.select("#newsEndContents");
			String content = ele.text();
			String title = liElement.text();
			System.out.println(title + " : "+content);
		}
		
		//String noticeTitle = titleElements.text();
		//System.out.println(noticeTitle);
		
		
		/*
		String url = "https://sports.news.naver.com/index.nhn";
		//HTML 문서 전체를 관리하기 위한 객체
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
			System.out.println("성공");

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Elements elements = doc.select("#news_category_contents_2_0");
		//Elements titleElements = elements.select("h3");
		Elements liElements = elements.select("ul li");
		
		for (int i = 0; i < liElements.size(); i++) {
			Element liElement = liElements.get(i);
			String text = liElement.text();
			System.out.println(text);
		}
		
		//String noticeTitle = titleElements.text();
		//System.out.println(noticeTitle);
		
		 */
		
		
		/*
		String url = "https://www.daum.net/";
		//HTML 문서 전체를 관리하기 위한 객체
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
			System.out.println("성공");

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Elements elements = doc.select(".group_news");
		//Elements elements2 = doc.select(".newslst_common_wrap");
		
		Elements liElements = elements.select("ul li");
		//Elements liElements = elements2.select(".");
		for (int i = 0; i < liElements.size(); i++) {
			Element liElement = liElements.get(i);
			String text = liElement.text();
			System.out.println(text);
		}
		*/

	}

}

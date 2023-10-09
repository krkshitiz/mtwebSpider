package mtwebspider;

import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{
		ArrayList<webSpider> bots = new ArrayList<>();
		bots.add(new webSpider("https://abcnews.go.com", 1));
		bots.add(new webSpider("https://nytimes.com", 2));
		bots.add(new webSpider("https://jsoup.org", 3));
		
		for(webSpider w : bots)
		{
			try 
			{
				w.getThread().join();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

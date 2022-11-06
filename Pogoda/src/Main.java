
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) {
        try {
//
            Document document = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .data("query", "Java")
                    .userAgent("Google")
                    .cookie("auth", "token")
                    .get();
            //System.out.println(document.body());
            ArrayList<Elements> weather = new ArrayList<Elements>();
            weather.add(document.select("#app > div.MhOk.YCvP > div.IZf6.bXIS > div.ifod > div.D7mx > div.J8Tp > div:nth-child(1) > div.wkAo > div"));
            weather.add(document.select("#app > div.MhOk.YCvP > div.IZf6.bXIS > div.ifod > div.D7mx > div.J8Tp > div:nth-child(2) > div.w4bT"));
            weather.add(document.select("#app > div.MhOk.YCvP > div.IZf6.bXIS > div.ifod > div.D7mx > div.J8Tp > div:nth-child(2) > div.jdZ5"));
            weather.add(document.select("#app > div.MhOk.YCvP > div.IZf6.bXIS > div.ifod > div.D7mx > div.J8Tp > div:nth-child(2) > div.T8o8 > div.aLlQ > a > div > div"));
            weather.add(document.select("#app > div.MhOk.YCvP > div.IZf6.bXIS > div.ifod > div.D7mx > div.J8Tp > div:nth-child(2) > div.c5O4.mRU7 > span"));
            weather.add(document.select("#app > div.MhOk.YCvP > div.IZf6.bXIS > div.ifod > div.D7mx > div.J8Tp > div:nth-child(2) > div.T8o8 > div.Ay2V > div > div:nth-child(1) > div.XIz0.Ummt"));
            weather.add(document.select("#app > div.MhOk.YCvP > div.IZf6.bXIS > div.ifod > div.D7mx > div.J8Tp > div:nth-child(2) > div.T8o8 > div.Ay2V > div > div:nth-child(1) > div.xNIt > span"));
            weather.add(document.select("#app > div.MhOk.YCvP > div.IZf6.bXIS > div.ifod > div.D7mx > div.J8Tp > div:nth-child(2) > div.T8o8 > div.Ay2V > div > div:nth-child(2) > div.XIz0.Ummt"));
            weather.add(document.select("#app > div.MhOk.YCvP > div.IZf6.bXIS > div.ifod > div.D7mx > div.J8Tp > div:nth-child(2) > div.T8o8 > div.Ay2V > div > div:nth-child(2) > div.xNIt > span"));
            weather.add(document.select("#app > div.MhOk.YCvP > div.IZf6.bXIS > div.ifod > div.D7mx > div.J8Tp > div:nth-child(2) > div.T8o8 > div.Ay2V > div > div:nth-child(3) > div.XIz0.Ummt"));
            weather.add(document.select("#app > div.MhOk.YCvP > div.IZf6.bXIS > div.ifod > div.D7mx > div.J8Tp > div:nth-child(2) > div.T8o8 > div.Ay2V > div > div:nth-child(3) > div.xNIt > span"));
            weather.add(document.select("#app > div.MhOk.YCvP > div.IZf6.bXIS > div.ifod > div.MOHE > div.J6p7 > div.f__o > div.PQ4J.WIUD > div"));
            weather.add(document.select("#app > div.MhOk.YCvP > div.IZf6.bXIS > div.ifod > div.MOHE > div.J6p7 > div.f__o > div.xNuK.yo7M > div.hjtR.wind.hC8A.iBF1"));
            weather.add(document.select("#app > div.MhOk.YCvP > div.IZf6.bXIS > div.ifod > div.MOHE > div.J6p7 > div.f__o > div.xNuK.yo7M > div.hjtR.pressure.hC8A.iBF1"));
            weather.add(document.select("#app > div.MhOk.YCvP > div.IZf6.bXIS > div.ifod > div.MOHE > div.J6p7 > div.f__o > div.xNuK.yo7M > div:nth-child(3)"));
            weather.add(document.select("#app > div.MhOk.YCvP > div.IZf6.bXIS > div.ifod > div.D7mx > div.J8Tp > div:nth-child(2) > div.c5O4.mRU7 > a"));
            for (int i = 0; i < weather.size(); i++) {
                System.out.println(weather.get(i).eachText());
            }
        }
        catch (Exception e){}
    }
}

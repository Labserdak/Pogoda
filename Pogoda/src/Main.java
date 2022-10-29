
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
            Elements place = document.select("#app > div.MhOk.YCvP > div.IZf6.bXIS > div.ifod > div.D7mx > div.J8Tp > div:nth-child(1) > div.wkAo > div");
            System.out.println(place.eachText());
            Elements day = document.select("#app > div.MhOk.YCvP > div.IZf6.bXIS > div.ifod > div.D7mx > div.J8Tp > div:nth-child(2) > div.w4bT");
            System.out.println(day.eachText());
            Elements temp = document.select("#app > div.MhOk.YCvP > div.IZf6.bXIS > div.ifod > div.D7mx > div.J8Tp > div:nth-child(2) > div.T8o8 > div.aLlQ > a > div > div");
            System.out.println(temp.eachText());
            Elements gh = document.select("#app > div.MhOk.YCvP > div.IZf6.bXIS > div.ifod > div.D7mx > div.J8Tp > div:nth-child(2) > div.T8o8 > div.Ay2V > div");
            System.out.println(gh.eachText());
            Elements feel = document.select("#app > div.MhOk.YCvP > div.IZf6.bXIS > div.ifod > div.D7mx > div.J8Tp > div:nth-child(2) > div.c5O4.mRU7 > span");
            System.out.println(feel.eachText());
            Elements wind = document.select("#app > div.MhOk.YCvP > div.IZf6.bXIS > div.ifod > div.MOHE > div.J6p7 > div.f__o > div.xNuK.yo7M > div.hjtR.wind.hC8A.iBF1");
            Elements pressure = document.select("#app > div.MhOk.YCvP > div.IZf6.bXIS > div.ifod > div.MOHE > div.J6p7 > div.f__o > div.xNuK.yo7M > div.hjtR.pressure.hC8A.iBF1");
            Elements moon = document.select("#app > div.MhOk.YCvP > div.IZf6.bXIS > div.ifod > div.MOHE > div.J6p7 > div.f__o > div.xNuK.yo7M > div:nth-child(3)");
            Elements magfield = document.select("#app > div.MhOk.YCvP > div.IZf6.bXIS > div.ifod > div.D7mx > div.J8Tp > div:nth-child(2) > div.c5O4.mRU7 > a");
            System.out.println(wind.eachText() + "\n" + pressure.eachText() + "\n" + moon.eachText() + "\n" + magfield.eachText());
            Elements week = document.select("#app > div.MhOk.YCvP > div.IZf6.bXIS > div.ifod > div.D7mx > div.VaRX > div > h3");
            System.out.println(week.eachText());
            Elements name = document.select("#app > div.MhOk.YCvP > div.IZf6.bXIS > div.ifod > div.D7mx > div.VaRX > div > table > thead");
            System.out.println(name.eachText());
            Elements one = document.select("#app > div.MhOk.YCvP > div.IZf6.bXIS > div.ifod > div.D7mx > div.VaRX > div > table > tbody > tr:nth-child(1)");
            Elements two = document.select("#app > div.MhOk.YCvP > div.IZf6.bXIS > div.ifod > div.D7mx > div.VaRX > div > table > tbody > tr:nth-child(2)");
            Elements three = document.select("#app > div.MhOk.YCvP > div.IZf6.bXIS > div.ifod > div.D7mx > div.VaRX > div > table > tbody > tr:nth-child(3)");
            Elements four = document.select("#app > div.MhOk.YCvP > div.IZf6.bXIS > div.ifod > div.D7mx > div.VaRX > div > table > tbody > tr:nth-child(4)");
            Elements five = document.select("#app > div.MhOk.YCvP > div.IZf6.bXIS > div.ifod > div.D7mx > div.VaRX > div > table > tbody > tr:nth-child(5)");
            Elements six = document.select("#app > div.MhOk.YCvP > div.IZf6.bXIS > div.ifod > div.D7mx > div.VaRX > div > table > tbody > tr:nth-child(6)");
            Elements seven = document.select("#app > div.MhOk.YCvP > div.IZf6.bXIS > div.ifod > div.D7mx > div.VaRX > div > table > tbody > tr:nth-child(7)");
            System.out.println(one.eachText() + "\n" + two.eachText() + "\n" + three.eachText() + "\n" + four.eachText() + "\n" + five.eachText() + "\n" + six.eachText() + "\n" + seven.eachText());

        }
        catch (Exception e){}
    }
}
package guru.qa;

public class Main {

    Character aChar = 'c';
    Byte aByte = 1;
    Short aShort = 2;
    Integer anInt = 3;
    Long aLong = 5L;
    Float aFloat = 0.12f;
    Double aDouble = null;
    Boolean aBoolean = true;

    String aString = null;

    public static void main(String[] args) {
        WebSite newsSite = new WebSite("yandex.ru/news", false);
        WebSite newsSite1 = new WebSite("yandex.ru/news", false);
        WebSite ytSite = new WebSite("youtube.com", true);

        newsSite.setViewCount(10);
        newsSite.open();
        ytSite.open();

        newsSite.printItems();

        newsSite1.setViewCount(1);

        boolean isSiteFunny = newsSite.isThisSiteIsFunny();
        System.out.println(isSiteFunny);
        System.out.println(newsSite.viewCount);
        System.out.println(newsSite1.viewCount);
        System.out.println(ytSite.viewCount);
    }

}

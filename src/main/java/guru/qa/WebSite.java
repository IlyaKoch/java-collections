package guru.qa;

public class WebSite {

    String url;
    int viewCount;
    boolean isFunnySite;
    String[] menuItems = {"login", "logout", "profile"};

    public WebSite(String url, boolean isFunnySite) {
        this.url = url;
        this.isFunnySite = isFunnySite;
    }

    public WebSite() {

    }

    void setViewCount(int count) {
        if (viewCount > 0 || isFunnySite) {
            System.out.println("denied!");
        }
    }

    boolean isThisSiteIsFunny() {
        return isFunnySite;
    }

    WebSite open() {
        System.out.println("Opened!");
        if (isFunnySite) {
            System.out.println(":D");
        } else {
            System.out.println(":(");
        }
        return this;
    }

    void printItems() {
        int i = 0;
        while (i < menuItems.length) {
            System.out.println(menuItems[i]);
//            menuItems[i] = "smth";
            i++;
        }

        int a = 0;
        do {
            System.out.println(menuItems[a]);
//            menuItems[a] = "smth";
            a++;
        } while (a < menuItems.length);

        for (String menuItem : menuItems) {
            System.out.println(menuItem);
        }
    }
}

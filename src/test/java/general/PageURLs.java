package general;

public enum PageURLs {
    HOME_PAGE("https://tutorsalpha.herokuapp.com/"),
    LOGIN_PAGE("login/"),
    REGISTER_PAGE("register/");

    String pageURL;


    PageURLs(String pageURL) {
        this.pageURL = pageURL;
    }

    public String getPageURL() {
        return pageURL;
    }

    public void setPageURL(String url) {
        this.pageURL = url;
    }
}

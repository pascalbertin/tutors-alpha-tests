package general;

public enum PageURLs {
    HOME_PAGE("https://tutorsalpha.herokuapp.com/"),
    LOGIN_PAGE("login/"),
    REGISTER_PAGE("register/"),
    PROFILE_PAGE("profile/"),
    EDIT_PROFILE_PAGE("editYourData/"),
    CATEGORIES_PAGE("categories/");

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

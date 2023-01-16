package general;

public enum Messages {
    LOGIN_UNAUTHORIZED_MSG("Błąd logowania!"),
    REGISTER_USER_DUPLICATED("Użytkownik o takich danych już istnieje!");

    private final String message;

    Messages(String aMessage) {
        message = aMessage;
    }

    public String getMessage() {
        return this.message;
    }
}

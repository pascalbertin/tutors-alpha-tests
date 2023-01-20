package general;

public enum Messages {
    LOGIN_UNAUTHORIZED_MSG("Błąd logowania!"),
    LOGIN_INCORRECT_MSG("Błąd autoryzacji!"),
    EDIT_PROFILE_DATA_SUCCESS_MSG("Dane zmieniono poprawnie!"),
    REGISTER_USER_DUPLICATED("Użytkownik o takich danych już istnieje!");

    private final String message;

    Messages(String aMessage) {
        message = aMessage;
    }

    public String getMessage() {
        return this.message;
    }
}

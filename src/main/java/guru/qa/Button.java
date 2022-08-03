package guru.qa;

public enum Button {
    CANCEL("Кнопка cancel"),
    OK("Кнопка ок"),
    APPLY("Кнопка apply");

    private String buttonName;

    Button(String buttonName) {
        this.buttonName = buttonName;
    }

    public String getButtonName() {
        return buttonName;
    }


}

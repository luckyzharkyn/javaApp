public enum Weeks {
    MONDAY("Понедельник", "Monday"),
    TUESDAY("Вторник", "Tuesday"),
    WEDNESDAY("Среда", "Wednesday"),
    THURSDAY("Четверг", "Thursday"),
    FRIDAY("Пятница", "Friday"),
    SATURDAY("Суббота", "Saturday"),
    SUNDAY("Воскресенье", "Sunday");

    private String ru;
    private String en;

    Weeks(String ru, String en) {
        this.ru = ru;
        this.en = en;
    }

    public String getRu() {
        return ru;
    }

    public String getEn() {
        return en;
    }
}

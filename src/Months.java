public enum Months {
    JANUARY("Январь", "January"),
    FEBRUARY("Февраль", "February"),
    MARCH("Март", "March"),
    APRIL("Апрель", "April"),
    MAY("Май", "May"),
    JUNE("Июнь", "June"),
    JULY("Июль", "July"),
    AUGUST("Август", "August"),
    SEPTEMBER("Сентябрь", "September"),
    OCTOBER("Октябрь", "October"),
    NOVEMBER("Ноябрь", "November"),
    DECEMBER("Декабрь", "December");


    private String ru;
    private String en;

    Months(String ru, String en) {
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

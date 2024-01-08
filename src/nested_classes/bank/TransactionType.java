package nested_classes.bank;

public enum TransactionType {
    PUT("Пополнение"),

    GET("Снятие");
    String typeName;

    TransactionType(String typeName) {
        this.typeName = typeName;
    }
}

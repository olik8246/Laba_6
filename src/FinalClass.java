final class FinalClass {
    private final int finalVariable1 = 5;
    private final int finalVariable2;

    // Конструктор для ініціалізації finalVariable2 через статичний блок
    public FinalClass() {
        finalVariable2 = 10 + finalVariable1 ;
    }


    // Метод для використання final змінних
    public int calculateFinalValue() {
        return finalVariable1 * finalVariable2;
    }
}

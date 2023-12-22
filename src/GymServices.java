
class GymServices{
    public void showServices() {
        System.out.println("_______________________________________________");
        System.out.println("Додаткові послуги в спортзалі:");
        System.out.println("1. Персональний тренер 500");
        System.out.println("2. Сауна 200");
        System.out.println("3. Масаж 400");
        System.out.println("_______________________________________________");
    }
    private double discount() {
        double a = (500 + 200 + 400) * 0.85;
        return a;// Логіка закритого методу
    }

    private String method2() {
        // Логіка закритого методу
        return "При купівлі всіх додаткових послуг ціна буде: ";
    }

    // Допоміжний метод для виклику privateMethod1 з головного класу
    public double discount1() {
        return discount();
    }

    // Допоміжний метод для виклику privateMethod2 з головного класу
    public String metod2() {
        return method2();
    }
}

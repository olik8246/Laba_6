interface Calculate{

    void calculatePrice(double discount);
    void purchaseServices(GymServices services);

}
class GymMembership implements Calculate {
    private  double discount;
    private String memberName;
    private int membershipType; // 1 Денний абонемент  2 Місячний абонемент  3 Річний абонемент
    private double price;
    private String typeAbonement;

    private int paid;


    GymMembership(String memberName, int membershipType) {
        this.memberName = memberName;
        this.membershipType = membershipType;


        switch (membershipType) {
            case 1:
                price = 200.0;
                typeAbonement = "денного";
                break;
            case 2:
                price = 1400.0;
                typeAbonement = "місячного";
                break;
            case 3:
                price = 11000.0;
                typeAbonement = "річного";
                break;
            default:
                price = 0.0;
        }
    }


    public void calculatePrice(double discount) {
        price = (price/100)*(100- discount);
        System.out.println("Клієнт " + memberName + " отримав знижку " + discount + "%.");
        System.out.println("Загальна ціна "+ typeAbonement +" абонементу: ₴ " + price);
    }

    // Виклик методу, що викликає метод із іншого класу
    public void purchaseServices(GymServices services) {
        services.showServices();
        System.out.println("Клієнт " + memberName + " купив додаткові послуги.");
    }
    final class FinalClass {
        private final int finalVariable1 = 5;
        private final int finalVariable2;

        // Конструктор для ініціалізації finalVariable2 через статичний блок
        public FinalClass() {
            finalVariable2 = 10+ finalVariable1 ;
        }

        // Метод для використання final змінних
        public int calculateFinalValue() {
            return finalVariable1 * finalVariable2;
        }
    }
    String getMemberName() {
        return memberName;
    }

    void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    int getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(int membershipType) {
        this.membershipType = membershipType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price*2;
    }

    public String getTypeAbonement() {
        return typeAbonement;
    }

    public void setTypeAbonement(String typeAbonement) {
        this.typeAbonement = typeAbonement;
    }

    public int getPaid() {
        return paid;
    }

    public void setPaid(int paid) {
        this.paid = paid;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}


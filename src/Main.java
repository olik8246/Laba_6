public class Main {
    public static void main(String[] args) {
        GymMembership member1 = new GymMembership("Анна", 2);
        GymMembership member2 = new GymMembership("Петро", 3);


        // Виклик методу для обчислення ціни абонементу зі знижкою

        member1.calculatePrice(15.5);
        member2.calculatePrice(15.0);

        SportNutrinion sportNutrition = new SportNutrinion ();
        sportNutrition.staticMethod2();//Виклик методу static

        //Виклик методу, що викликає метод із іншого класу
        GymServices gymServices = new GymServices();
        member2.purchaseServices(gymServices);
        System.out.println(gymServices.metod2() + gymServices.discount1());


        FinalClass finalClass = new FinalClass();//Виклик методу final
        System.out.print(finalClass.calculateFinalValue());

        SportShop sportShop = new SportShop();
        Goods goods = new Goods();
        Prise prise = new Prise();
        DiscountShop discountShop =new DiscountShop();
        sportShop.choice();
        prise.choice(2,3);
        discountShop.discountS(2,3);


    }
}
interface Dis{
    void discountS(int a, int b);
}
public class SportShop {
    public void choice(){
        System.out.println("1)Шейкери");
        System.out.println("2)Ємкості для води");
        System.out.println("3)Ремні та пояси");
    }

}
class Goods extends SportShop {

    int choice(int a) {
        choice();
        if (a==1){
            System.out.println("__Шейкери__\nBiotech USA Wave Shaker 600 ml 135 грн \nBiotech USA Wave Shaker 600 ml 135 грн \nOstroVit Shaker Sport 700 ml Чорний 150 грн ");
            return 1;
        }
        else if(a==2){
            System.out.println("__Ємкості для води__\nSiS Wide Neck Bottle 600 ml 235 грн \nUniversal Nutrition Animal Meal Iconic Food Container 710 ml 190 грн \nOstroVit Shaker 700 ml Темно-зелений 130 грн");
            return 2;
        }
        else if(a==3){
            System.out.println("__Ремні та пояси__\nOlimp Training Gloves Hardcore Raptor 450 грн \nMyprotein Бинти для кістей 145 грн \nOstroVit Gym Bag Black 23 l 550 грн");
            return 3;
        }
        else {
            System.out.println("Хибна відповідь");
            return 0;
        }

    }
}
class Prise extends Goods {
    void discount(){
        System.out.println("Ви отримали знижку в магазині!!!");
    }
    int choice(int a, int b){
        choice(a);
        if (a==1){
            if (b==1){
                System.out.println("Ви обрали:Biotech USA Wave Shaker 600 ml 135 грн");
                return 135;
            }
            else if(b==2){
                System.out.println("Ви обрали:Biotech USA Wave Shaker 600 ml 135 грн");
                return 135;
            }
            else if(b==3){
                System.out.println("Ви обрали:OstroVit Shaker Sport 700 ml Чорний 150 грн ");
                return 150;
            }
            else {
                System.out.println("Ви обрали:ніц");
                return 0;
            }

        }
        else if(a==2){
            if (b==1){
                System.out.println("Ви обрали:SiS Wide Neck Bottle 600 ml 235 грн ");
                return 235;
            }
            else if(b==2){
                System.out.println("Ви обрали:Universal Nutrition Animal Meal Iconic Food Container 710 ml 190 грн ");
                return 190;
            }
            else if(b==3){
                System.out.println("Ви обрали:OstroVit Shaker 700 ml Темно-зелений 130 грн");
                return 130;
            }
            else {
                System.out.println("Ви обрали:nits");
                return 0;
            }
        }
        else if(a==3){
            if (b==1){
                System.out.println("Ви обрали:Olimp Training Gloves Hardcore Raptor 450 грн");
                return 450;
            }
            else if(b==2){
                System.out.println("Ви обрали:Myprotein Бинти для кістей 145 грн");
                return 145;
            }
            else if(b==3){
                System.out.println("Ви обрали:OstroVit Gym Bag Black 23 l 550 грн");
                return 550;
            }
            else {
                System.out.println("Ви обрали:nits");
                return 0;
            }
        }
        else {
            System.out.println("ne to");
            return 0;
        }

    }

}

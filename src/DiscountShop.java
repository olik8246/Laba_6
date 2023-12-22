public class DiscountShop extends Prise implements Dis{
    public void discountS(int a, int b){
        super.discount();
        System.out.println( "Ціна з знижкою: " + choice(a,b) * 0.90 );
    }
}

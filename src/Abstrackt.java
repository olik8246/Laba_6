abstract class Abstrackt {
    public abstract void fin();

    // Звичайний (конкретний) метод
    public void commonMethod() {
        System.out.println("Я не знав куди засунути");
    }
}
class Final extends Abstrackt {

    public void fin() {
        System.out.println("Дякуємо за покупки");
    }
}


class Final2 extends Abstrackt {

    public void fin() {
        System.out.println("Допобачення");
    }
}

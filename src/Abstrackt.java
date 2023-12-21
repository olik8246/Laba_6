abstract class Abstrackt {
    public abstract void draw();

    // Звичайний (конкретний) метод
    public void commonMethod() {
        System.out.println("Я не знав куди засунути");
    }
}
class Final extends Abstrackt {

    public void draw() {
        System.out.println("Дякуємо за покупки");
    }
}


class Final2 extends Abstrackt {

    public void draw() {
        System.out.println("Допобачення");
    }
}

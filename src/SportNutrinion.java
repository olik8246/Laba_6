public class SportNutrinion {
    private static int kreatin = 1230;

    private static int protein;

    static {
                                                  // Логіка ініціалізації статичної змінної у статичному блоку
        protein = 822;
    }

    // Статичний метод, який використовує статичні змінні
    public static int staticMethod1() {
        return kreatin + protein - 200 ; // smert
    }

    // Ще один статичний метод, який використовує результати роботи першого методу
    public static int staticMethod2() {
        System.out.println("_______Магазин_______");
        System.out.println("Ціна креатину " + kreatin);
        System.out.println("Ціна протеїну " + protein);
        System.out.println("При купівлі креатину і протеїну ціна разом буде " + staticMethod1());
        System.out.println("_____________________");
        return staticMethod1() * 2;
    }
}

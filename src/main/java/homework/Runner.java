package homework;

public class Runner {

    public static void main(String[] args) {
        String[] someArray = new String[5];
        String[] names = new String[]{"Барсик", "Фунтик",
                "Васька", "Мурка", "Шпунтик", "Лапка",
                "Исчадие ада", "Шерстяной проститут"};

        for (int i = 0; i < names.length; i++) {
            Cat cat = new Cat(names[i]);
            System.out.println(cat.getName());
        }
    }
}

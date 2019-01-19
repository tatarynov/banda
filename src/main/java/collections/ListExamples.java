package collections;

import java.util.*;

public class ListExamples {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Васька");
        names.add("Барсик");
        names.add("Исчадие ада");
        names.add("Шерстяной");
        names.add("Еще какой-то кот");

        for (String text : names) {
            System.out.println(text);
        }

        String[] namesInArray = new String[]{"Барсик", "Фунтик",
                "Васька", "Мурка", "Шпунтик", "Лапка",
                "Исчадие ада", "Шерстяной проститут"};
        System.out.println();
        names.addAll(Arrays.asList(namesInArray));
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println();
        HashSet<String> catNames = new HashSet<>(names);
        Iterator<String> iterator = catNames.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Map<String, Boolean> kvp = new HashMap<>();
        kvp.put("new_command_timeout", true);
        Iterator<Map.Entry<String, Boolean>> iterator1 = kvp.entrySet().iterator();

    }
}

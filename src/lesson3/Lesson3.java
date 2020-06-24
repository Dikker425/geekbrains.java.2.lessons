package lesson3;

import java.util.*;

import static lesson3.PhoneBook.*;


/**
 * 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
 * Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
 * Посчитать сколько раз встречается каждое слово.
 * <p>
 * 2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
 * В этот телефонный справочник с помощью метода add() можно добавлять записи.
 * С помощью метода get() искать номер телефона по фамилии.
 * Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
 * тогда при запросе такой фамилии должны выводиться все телефоны.
 */

public class Lesson3 {

    public static void firstTask() {
        List<String> wordsList = new ArrayList<>();
        Set<String> wordsSet = new HashSet<>();

        wordsList.add("robot"); // 1
        wordsList.add("community"); // 2
        wordsList.add("school"); // 4
        wordsList.add("pity"); // 1
        wordsList.add("community");
        wordsList.add("dog"); // 5
        wordsList.add("youth"); // 1
        wordsList.add("school");
        wordsList.add("school");
        wordsList.add("dog");
        wordsList.add("school");
        wordsList.add("dog");
        wordsList.add("ego"); // 1
        wordsList.add("dog");
        wordsList.add("dog");
        wordsList.add("width"); // 1
        wordsList.add("human"); // 1
        wordsList.add("release"); // 1

        wordsSet.addAll(wordsList);


        /** Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).**/
        System.out.println("Весь список:");
        System.out.println(wordsList + " : Размер: " + wordsList.size() + "\n");
        System.out.println("Список уникальных, без дуплиткатов:");
        System.out.println(wordsSet + " : Размер: " + wordsSet.size());
        System.out.println("==============");


        /** Посчитать сколько раз встречается каждое слово. **/
        for (String check : wordsSet
        ) {
            int count = 0;
            for (int i = 0; i < wordsList.size() ; i++) {
                if (check.equals(wordsList.get(i))){
                    count++;
                }
            }
            System.out.println("Слово *" + check + "* встречается: " + count + " раз(а)");
        }

    }


    public static void main(String[] args) {

        /**Запуск первого задания**/
        firstTask();

        System.out.println("============");

        /**Запуск Второго задания, Телефонной книги**/
        add("Петров","88005553535");
        add("Петров","84997891245");
        add("Медведев","84958071234");
        add("Путин","84991234567");
        add("Иванов","84957894561");
        getBook();
        System.out.println();
        get("Путин");
        get("Петров");

    }

}


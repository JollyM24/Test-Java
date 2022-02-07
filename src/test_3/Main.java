package test_3;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        List<Word> wordArr = new ArrayList<>();

        String phrase = str.nextLine();
        List<String> myList = new ArrayList<String>(Arrays.asList(phrase.split(" ")));

        for (String p : myList) {
            wordArr.add(new Word(p));
        }

        //Выводим слова отсортированным списком по кол-ву гласных
        //(сначала те, у кого больше гласных)
        List sortedList = wordArr.stream()
                .sorted(Comparator.comparingInt(Word::getCount)
                        .reversed())
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }
}



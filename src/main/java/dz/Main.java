package dz;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 1000; i++) {
//            коллекция от 100 до 200 чисел
            numbers.add((int) (rand.nextInt(100, 201)));
        }

        List<String> result = numbers.stream()
                .filter(i -> i % 5 == 0)
                // был его квадратный корень
                .map(Math::sqrt)
                .map(string -> "Math.sqrt: " + string)
//                .map(Main::mapToString)
                .toList();


        for (String str : result) {
            System.out.println(str);
        }
    }

    private static String mapToString(double a) {
        return "Math.sqrt: " + a;
    }
}

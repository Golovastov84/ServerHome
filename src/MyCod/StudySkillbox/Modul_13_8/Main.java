package MyCod.StudySkillbox.Modul_13_8;

import MyCod.StudySkillbox.Modul_13_8.TextFormat.SyntaxFormat;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String text = "Java is awesome!";

        /*System.out.println(new TextFormat().bold(text, SyntaxFormat.MD));
        System.out.println(new TextFormat().bold(text, SyntaxFormat.HTML));
        System.out.println(new TextFormat().bold(text, SyntaxFormat.BB));*/

//        int[] a = new int[]{1, 2, 3,};
//        IntStream intStream = Arrays.stream(a);
//        intStream.forEach((s) -> System.out.println(s));

//        Stream<String> stream = Stream.of("aa", "b", "cccc");
//        Stream<Integer> streamInt = stream.map(str -> str.length());
//        streamInt.forEach(x -> System.out.println(x));

        /*Stream.of(1, 2, 3, 4, 5, 6)
                .filter(number -> number % 3 == 0)
                .forEach(System.out::println);*/

        /*Stream.of("ski", "", "ll", " ", "box", "asd")
//                .filter(s -> !s.isBlank())
//                .filter(Predicate.not(s -> s.isBlank()))
//                .filter(Predicate.not(String::isBlank))
//                .filter(Predicate.isEqual("ski"))
//                .filter(Predicate.not((s) -> s.contains("a")))
                .distinct()
                .forEach(System.out::print);*/

/*        Random random = new Random(0xCAFE); // рандом с указанием seed
        Stream.generate(() -> random.nextInt(6)) // случайный int от 0 до 6 (вкл)
                .limit(10) // генерация 10 элементов в стрим
                .distinct() // удаляем повторы
                .map(x -> ++x) // добавляем +1 к каждому значению
                .forEach(System.out::println); // печать значений*/

        /*Stream.of("skillbox", "java", "art")
                .sorted()
                .forEach(System.out::println);

        Stream.of(List.of(1,4,5), List.of(1), List.of(4, 7))
                .sorted(Comparator.comparing(List::size))
                .forEach(System.out::println);*/

        /*Stream.of(1,2,3,5)
                .sorted()
                .limit(2)
                .forEach(System.out::println);

        Random random = new Random(0xDECF);
        Stream.generate(random::nextInt)
                .limit(5)
                .forEach(System.out::println);*/

        /*Stream<List<Integer>> stream = Stream.of(List.of(1, 4, 5), List.of(1), List.of(4, 7));
        stream.sorted(Comparator.comparing(List::size))
                .forEach(System.out::println);
        Stream<List<Integer>> streamOfList = Stream.of(List.of(1, 4, 5), List.of(1), List.of(4, 7));
        streamOfList.map(List::hashCode)
                .forEach(System.out::println);*/

       /* List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        Stream<String> stream = list.stream()
                .map(s -> "-> " + s);
        list.add("3");
        stream.forEach(System.out::println);*/

        /*Optional<Integer> shortestString = Stream.of(1, 2, 3, 4)
                .filter(i -> i >10)
                .max(Integer::compare);

        if(shortestString.isPresent()){
            System.out.println(shortestString.get());
        } else {
            System.out.println("Максимальное значение не найдено!");
        }*/

       /* Optional<Integer> any = Stream.of(10, 20, 30, 100)
                .parallel()
                .findAny();
                any.ifPresent(System.out::println);*/

//        HashSet<String> set = new HashSet<>();
//        set.add("zz");
//        set.add("tt");
//        set.add("xt");
//        set.add("it");
//        set.add("kt");
//
//        System.out.println(set.stream().findFirst());

/*
Map<String, Person> map =
        Stream.of(new Person("1"), new Person("1"), new Person("3"))
                .collect(Collectors.toMap(Person::getPhone, Function.identity(),
                        (existing, current) -> existing));
        System.out.println(map);
*/
//Map<String, Integer> map = Stream.of("a", "b", "c", "d", "a", "a")
//        .collect(Collectors.toMap(
//                Function.identity(),
//                (s) -> 1,
//                (existing, current) -> ++existing));
//        System.out.println(map);

       /* Map<String, Long> map =
                Stream.of(
                        new Product("milk", 60),
                        new Product("bread", 30),
                        new Product("milk", 40),
                        new Product("bread", 200))
                        .collect(Collectors.groupingBy(
                                Product::getType,
                                Collectors.summingLong(Product::getPrice)));
        System.out.println(map);*/

        Stream.of(1, 2, 3, 4, 5, 6)
                .mapMulti ((x, consumer) ->{
                    if(x % 2 == 0) {
                        consumer.accept(-x);
                        consumer.accept(x);
                    }
                })
                .forEach(System.out::println);
    }
}

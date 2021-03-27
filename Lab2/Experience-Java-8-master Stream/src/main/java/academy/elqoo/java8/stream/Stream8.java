package academy.elqoo.java8.stream;

import java.text.CollationElementIterator;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream8 {

    public static List<Integer> returnSquareRoot(List<Integer> numbers){
        // REDO !!!
        return numbers.stream()
                .map(x -> Math.sqrt(x))
                .map(x -> x.intValue())
                .collect(Collectors.toList());
    }

    public static List<Integer> getAgeFromUsers(List<User> user){
        return user.stream()
                .map(User::getAge)
                .collect(Collectors.toList());
    }

    public static List<Integer> getDistinctAges(List<User> users){
        return users.stream()
                .map(User::getAge)
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<User> getLimitedUserList(List<User> users, int limit){
        return users.stream()
                .limit(limit)
                .collect(Collectors.toList());
    }

    public static Integer countUsersOlderThen25(List<User> users){
        return Math.toIntExact(users.stream()
                .filter(x -> x.getAge() > 25)
                .count());
    }

    public static List<String> mapToUpperCase(List<String> strings){
        return strings.stream()
                .map(n -> n.toUpperCase())
                .collect(Collectors.toList());
    }

    public static Integer sum(List<Integer> integers){
        return integers.stream()
                .mapToInt(i -> i)
                .sum();
    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip){
        return integers.stream()
                .skip(toSkip)
                .collect(Collectors.toList());
    }

    public static List<String> getFirstNames(List<String> names){
        return names.stream()
                .map(x -> x.split(" ")[0])
                .collect(Collectors.toList());
    }

    public static List<String> getDistinctLetters(List<String> names){
        return Arrays.asList(String.join("", names).split(""))
                .stream().distinct()
                .collect(Collectors.toList());
    }


    public static String separateNamesByComma(List<User> users){
        return users.stream()
                .map(User::getName)
                .collect(Collectors.joining(", "));
    }

    public static double getAverageAge(List<User> users){
        return users.stream()
                .mapToInt(User::getAge)
                .average()
                .getAsDouble();
    }

    public static Integer getMaxAge(List<User> users){
        return users.stream()
                .mapToInt(User::getAge)
                .max()
                .getAsInt();
    }

    public static Integer getMinAge(List<User> users) {
        return users.stream()
                .mapToInt(User::getAge)
                .min()
                .getAsInt();
    }

    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users){
        return users.stream()
                .collect(Collectors.groupingBy(User::isMale));
    }

    public static Map<Integer, List<User>> groupByAge(List<User> users){
        return users.stream()
                .collect(Collectors.groupingBy(User::getAge));
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users){
        return users.stream()
                .collect(
                        Collectors.groupingBy(User::isMale,
                                Collectors.groupingBy(User::getAge))
                );
    }

    public static Map<Boolean, Long> countGender(List<User> users){
        return users.stream()
                .collect(Collectors.groupingBy(User::isMale,
                        Collectors.counting()));
    }

    public static boolean anyMatch(List<User> users, int age){
        return users.stream()
                .anyMatch(u -> u.getAge() == age);
    }

    public static boolean noneMatch(List<User> users, int age){
        return users.stream()
                .noneMatch(u -> u.getAge() == age);
    }

    public static Optional<User> findAny(List<User> users, String name){
        return users.stream()
                .filter(u -> u.getName() == name)
                .findAny();
    }

    public static List<User> sortByAge(List<User> users){
        return users.stream()
                .sorted((u1, u2) -> u1.getAge().compareTo(u2.getAge()))
                .collect(Collectors.toList());
    }

    public static Stream<Integer> getBoxedStream(IntStream stream){
        return stream.boxed();
    }

    public static List<Integer> generateFirst10PrimeNumbers(){
        return IntStream.rangeClosed(2, Integer.MAX_VALUE)
                .filter(n -> isPrime(n))
                .limit(10)
                .boxed()
                .collect(Collectors.toList());
    }

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0);
    }

    public static List<Integer> generate10RandomNumbers(){
        return new Random().ints(10)
                .boxed().collect(Collectors.toList());
    }

    public static User findOldest(List<User> users){
        return users.stream()
                .reduce(((user1, user2) -> user1.getAge() > user2.getAge() ? user1 : user2))
                .get();
    }

    public static int sumAge(List<User> users){
        return users.stream()
                .mapToInt(User::getAge)
                .sum();
    }

    public static IntSummaryStatistics ageSummaryStatistics(List<User> users){
        return users.stream()
                .mapToInt(User::getAge)
                .summaryStatistics();
    }

}

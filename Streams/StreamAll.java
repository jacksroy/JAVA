import java.util.*;
import java.util.stream.*;

public class StreamAll {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 10, 15, 10, 20, 25);

        // 1️⃣ filter – select elements
        numbers.stream()
                .filter(n -> n > 10)
                .forEach(n -> System.out.println("Filter >10: " + n));

        // 2️⃣ map – transform elements
        numbers.stream()
                .map(n -> n * 2)
                .forEach(n -> System.out.println("Map x2: " + n));

        // 3️⃣ distinct – remove duplicates
        numbers.stream()
                .distinct()
                .forEach(n -> System.out.println("Distinct: " + n));

        // 4️⃣ sorted – natural order
        numbers.stream()
                .sorted()
                .forEach(n -> System.out.println("Sorted: " + n));

        // 5️⃣ limit – take first N elements
        numbers.stream()
                .limit(3)
                .forEach(n -> System.out.println("Limit 3: " + n));

        // 6️⃣ skip – skip first N elements
        numbers.stream()
                .skip(2)
                .forEach(n -> System.out.println("Skip 2: " + n));

        // 7️⃣ count – total elements
        long count = numbers.stream().count();
        System.out.println("Count: " + count);

        // 8️⃣ reduce – combine elements (sum)
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + sum);

        // 9️⃣ anyMatch / allMatch / noneMatch
        boolean anyGreaterThan20 = numbers.stream().anyMatch(n -> n > 20);
        boolean allGreaterThan0 = numbers.stream().allMatch(n -> n > 0);
        boolean noneNegative = numbers.stream().noneMatch(n -> n < 0);

        System.out.println("Any >20: " + anyGreaterThan20);
        System.out.println("All >0: " + allGreaterThan0);
        System.out.println("None <0: " + noneNegative);

        // 🔟 findFirst / findAny
        Optional<Integer> first = numbers.stream().findFirst();
        Optional<Integer> any = numbers.stream().findAny();

        System.out.println("First: " + first.get());
        System.out.println("Any: " + any.get());

        // 1️⃣1️⃣ max / min
        int max = numbers.stream().max(Integer::compare).get();
        int min = numbers.stream().min(Integer::compare).get();

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        // 1️⃣2️⃣ collect – convert stream to list
        List<Integer> evenList = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Collected Even Numbers: " + evenList);

        // 1️⃣3️⃣ peek – debugging (not for logic)
        numbers.stream()
                .peek(n -> System.out.println("Peek: " + n))
                .filter(n -> n > 10)
                .forEach(n -> System.out.println("After filter: " + n));
    }
}

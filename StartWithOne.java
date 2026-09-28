import java.util.*;
import java.util.stream.Collectors;
class Main {
    public static void main(String[] args) {
       List <Integer> num = Arrays.asList(10, 15, 20, 31, 42, 101, 8);
        List <Integer> result = num.stream()
            .filter(n -> String.valueOf(n).startsWith("1"))
            .collect(Collectors.toList());
        System.out.print(result);
    }
}

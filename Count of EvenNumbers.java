import java.util.*;
class Main {
    public static void main(String[] args) {
      List <Integer> num = Arrays.asList(10,15,20,25,30,35,40,45);
        long count = num.stream()
            .filter(n -> n %2==0)
            .count();
           System.out.print(count);
        
        
    }
}

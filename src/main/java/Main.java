
import banking.Atm;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.iterate(0, i -> i + 1)
                .limit(10)
                .forEach(System.out::println);
        Atm atm = new Atm(5);
        System.out.println(atm.balanceCal());
    }
}

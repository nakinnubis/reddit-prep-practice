package Easies.DescedingOrder;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

public class Solution {
    public static int sortDesc(final int num) {
        //Your code

        var str = String.format("%s",num);
        var sp = Arrays.stream(str.stripLeading()
               .stripTrailing().split("", ',')).
               filter(a->!a.isEmpty())
               .mapToInt(a->Pred(a)).boxed()
               .collect(toList());
       sp.sort(Comparator.reverseOrder());
        var joinedString = sp.stream().map(String::valueOf).collect(Collectors.joining());
        int result = Integer.valueOf(joinedString);
        return result;

    }

    private static int Pred(String a) {
        return Integer.valueOf(a);

    }

    public static void main(String[] args) {
        sortDesc(42145);
  }

}


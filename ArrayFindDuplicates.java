package Practik;

import java.util.*;
public class ArrayFindDuplicates {
    public static void main(String[] args) {
        String[] city = {"Berlin", "London", "Kiev", "Isnanbul", "Kiev", "Berlin", "Detroit"};
        System.out.println("Input array: " + Arrays.toString(city));
        System.out.println("Duplicates: " + getDuplicatesWithIteration(city));
    }
    public static <T> List<T> getDuplicatesWithIteration(T[] a) {
        Set<T> duplicates = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            T e1 = a[i];
            if (e1 == null) continue; // ignor null
            // check the element with our
            for (int j = 0; j < a.length; j++) {
                if (i == j) continue; // we do not check the element with ourselves
                T e2 = a[j];
                if (e1.equals(e2)) {
                    // duplicat find
                    duplicates.add(e2);
                }
            }
        }
        return new ArrayList<>(duplicates);
    }
}

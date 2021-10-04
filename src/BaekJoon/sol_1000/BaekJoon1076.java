package BaekJoon.sol_1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BaekJoon1076 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Resistance> list = new ArrayList<Resistance>();
        list.add(new Resistance("black", 0, 1));
        list.add(new Resistance("brown", 1, 10));
        list.add(new Resistance("red", 2, 100));
        list.add(new Resistance("orange", 3, 1000));
        list.add(new Resistance("yellow", 4, 10000));
        list.add(new Resistance("green", 5, 100000));
        list.add(new Resistance("blue", 6, 1000000));
        list.add(new Resistance("violet", 7, 10000000));
        list.add(new Resistance("grey", 8, 100000000));
        list.add(new Resistance("white", 9, 1000000000));
        String color1Str = br.readLine();
        String color2Str = br.readLine();
        String color3Str = br.readLine();

        int result1 = 0, result2 = 0;
        long multiply = 0;
        for (int i = 0; i < 10; i++) {
            if (list.get(i).color.equals(color1Str)) {
                result1 = list.get(i).result;
            }
            if (list.get(i).color.equals(color2Str)) {
                result2 = list.get(i).result;
            }
            if (list.get(i).color.equals(color3Str)) {
                multiply = list.get(i).multiply;
            }
        }
        long result = (result1*10 + result2) * (long)multiply;
        System.out.print(result);

    }

    static class Resistance {
        String color;
        int result;
        long multiply;

        public Resistance(String color, int result, int multiply) {
            this.color = color;
            this.result = result;
            this.multiply = multiply;
        }
    }

}
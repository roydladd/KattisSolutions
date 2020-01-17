package com.roydl.kattis.oddities;

import java.util.*;

public class FreeFood {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int events = scanner.nextInt();
        Set<Integer> daysFree = new HashSet<>();

        for (int i=0; i<events; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            for (int j=a; j<=b; j++) {
                daysFree.add(j);
            }
          }

      System.out.println(daysFree.size());
  }
}

package com.roydl.kattis.problemA;
import java.io.*;

public class HeartRate {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        int n = Integer.parseInt(in.readLine());
        for (int i=0; i<n; i++) {
            String line = in.readLine();
            double b = Double.parseDouble(line.split(" ")[0]);
            double p = Double.parseDouble(line.split(" ")[1]);

            double min = (60 * (b-1) / p);
            double mid = ((60 * b) / p);
            double max = (60 * (b+1)/p);

            out.println(min + " " + mid + " " + max);
        }
        out.close();
        }
    }

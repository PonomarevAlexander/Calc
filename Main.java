package com.ponomarev.calculator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.println("Type expression by space then press ENTER");
        String[] expression = sc.nextLine().split(" ");
    }
}

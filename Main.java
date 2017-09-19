package com.company;

import java.util.Scanner;
import java.math.*;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

            System.out.print("Enter your car's MPG rating (miles/gallon)" +
                "as a positive ineger: ");
            int carMpg = s.nextInt();

            if (carMpg > 0) {

            } else {
                System.out.print("ERROR: ONLY POSITVE INTEGERS ARE " +
                             "ACCEPTED FOR MPG!!!");
            return;
            }
            System.out.print("Enter your car's tank capacity (gallons) " +
                         "as a positive decimal number: ");
            double tankCap = s.nextDouble();

            if (tankCap > 0) {

            } else {
                System.out.print("ERROR: ONLY POSITIVE DECIMAL NUMBERS " +
                             "ACCEPTED FOR TANK CAPACITY!!!");
            return;
            }
            System.out.print("Enter the percentage of the gas tank that " +
                         "is currently filled (from 0-100%): ");
            double tankPercent = s.nextDouble();

            if ((tankPercent >= 0) && (tankPercent <= 100)) {

            } else {
                System.out.print("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER" +
                                 " IN THE RANGE OF 0-100(INCLUSIVE)!!!");
            return;
            }

            double rawRange = carMpg * tankCap * (tankPercent * 0.01);

            int milsLeft = (int)rawRange; //put (int) in front of a double to "cast" a number
            if (milsLeft <= 25) {
                System.out.print("Attention! Your current estimated range is " +
                                 "running low: " + milsLeft + " miles left!!!");
            } else {
                System.out.print("Keep driving! Your current estimated range is : "
                                 + milsLeft + " miles!");
            }

            s.close();

            return;


        }

    }

package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {
    private static int monkeyTypewriter(String monkeysGoal){
        Random tempRandom = new Random();
        int counter = 0;

        for(int i = 0; i < monkeysGoal.length(); i++){
            char tempChar = monkeysGoal.charAt(i);
            int randomInt = tempRandom.nextInt(256);
            if(randomInt != (int)tempChar){
                i = 0;
            }
            counter++;
        }

        return counter;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Type your text here (Do not press enter until done): ");
        String monkeysGoal = myObj.nextLine();

        int counter = monkeyTypewriter(monkeysGoal);

        long secondsDisplay = counter % 60;
        long elapsedMinutes = counter / 60;
        System.out.println("Total time the monkey needed on the typewriter for your text: " + elapsedMinutes + ":" + secondsDisplay);
    }
}

package org.taskTracker;

import java.util.Scanner;
 //Classe que escuta o imput
public class Listen {


    public String listenning() {
        Scanner scanner = new Scanner(System.in);
        String scannerString = scanner.toString();

        return scannerString;
    }
}

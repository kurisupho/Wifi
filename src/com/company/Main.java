package com.company;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
        Prompt prompt = new Prompt();
        System.out.println("Reboot the computer and try to start again");
        boolean answer = prompt.promptResponse();
        if (answer == true) {
            exit(0);

        }
        System.out.println("Reboot the router and try to connect");
        answer = prompt.promptResponse();
        if (answer == true) {
            exit(0);
        }

        System.out.println("Make sure the cables connecting the router are firmly plugged in and power is getting to the router");
        answer = prompt.promptResponse();
        if (answer == true) {
            exit(0);
        }

        System.out.println("Move the computer closer to the router and try to connect");
        answer = prompt.promptResponse();
        if (answer == true) {
            exit(0);
        }

        System.out.println("Contact your isp");
        exit(0);
    }

}

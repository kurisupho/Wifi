package com.company;
import java.util.Scanner;

public class Prompt {
    public boolean promptResponse (){
        Scanner response = new Scanner(System.in);
        System.out.println("Did that fix the problem?");
        String userResponse = response.nextLine();
        if (userResponse.equals("yes")){
            //when user says yes, return true
            return true;
        } else if (userResponse.equals("no")){
            //when user says no, return false
            return false;
        } else {
            //if user says anything else, ask again
            return promptResponse();
        }
    }
}

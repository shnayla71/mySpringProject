package com.cydeo.loosely_coupled;

public class CydeoApp {
    public static void main(String[] args) {
        FullTimeMentor fullTimeMentor=new FullTimeMentor();
        PartTimeMentor partTimeMentor=new PartTimeMentor();

        MentorAccount mentor=new MentorAccount(fullTimeMentor);
        mentor.manageAccount();
    }
}

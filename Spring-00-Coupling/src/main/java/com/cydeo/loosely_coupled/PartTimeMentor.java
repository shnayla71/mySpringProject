package com.cydeo.loosely_coupled;

import com.cydeo.loosely_coupled.Mentor;

public class PartTimeMentor implements Mentor {
    @Override
    public void createAccount() {
        System.out.println("Part time mentor is created");
    }
}

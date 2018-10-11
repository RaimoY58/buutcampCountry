package com.buutcamp.inputhandle.main;

import com.buutcamp.inputhandle.AppConfig;
import com.buutcamp.inputhandle.Finland;
import com.buutcamp.inputhandle.HandleInput;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunApp {

    public RunApp() {

        AnnotationConfigApplicationContext country =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HandleInput handleInput = new HandleInput();
        Finland finland = new Finland();
        finland.setCountryName("Rebublic of Finland");
        finland.setPresidentName("Sauli Niinistö");
        finland.setCountryPopul("5517887");
        Viro estonia = new Viro();
        estonia.setCountryName("Republic of Estonia");
        estonia.setPresidentName("Kersti Kaljulaid");
        estonia.setCountryPopul("1300000");


        while (true) {
            System.out.println("User input please: ");

            String userInput = handleInput.getUserInput();
            if (userInput.equals ("get Finland")){
                    System.out.println("Official name of the country:" + finland.getCountryName());
                    System.out.println("President: " + finland.getCountryPresident());
                    System.out.println("Population count: "+ finland.getCountryPopul());
            }
            if (userInput.equals ("get Estonia")) {
                System.out.println("Official name of the country:" + estonia.getCountryName());
                System.out.println("President: " + estonia.getCountryPresident());
                System.out.println("Population count: " + estonia.getCountryPopul());
            }
            if (userInput.equals ("set estonia name = sweden")){
                estonia.setCountryName("sweden");
            }

            if (userInput.equals("exit")) {
                return;
            }
        }
    }
}

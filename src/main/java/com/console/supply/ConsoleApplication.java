package com.console.supply;

import java.util.Scanner;

public class ConsoleApplication {

    public static void main(String[] args) {
        // create a Spring context
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // retrieve a Spring bean
//        MyService myService = context.getBean(MyService.class);

        // call a Spring project function
//        String result = myService.doSomething();

        // print the result to the console
        System.out.println("result");

        String[] options = {"1- Option 1",
                "2- Option 2",
                "3- Option 3",
                "4- Exit",
        };
        Scanner scanner = new Scanner(System.in);
        int option;
        while (true) {
            printMenu(options);
            option = scanner.nextInt();
        }
    }

    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Choose your option : ");
    }
}

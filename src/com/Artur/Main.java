package com.Artur;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
//	    Gearbox mcLaren = new Gearbox(6);
////	    Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
//
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(3000));
//
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(3);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(6000));
//_________________________________________________________________________________
//        class ClickListener implements Button.OnClickListener{      //LOCAL CLASS
//            public ClickListener() {
//                System.out.println("I'be been attached.");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked.");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());
//        listen();
//_________________________________________________________________________________
        btnPrint.setOnClickListener(new Button.OnClickListener() {      //Anonymous CLASS
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked.");
            }
        });
        listen();
    }

    private static void listen(){
        boolean quit = false;
        while(!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}

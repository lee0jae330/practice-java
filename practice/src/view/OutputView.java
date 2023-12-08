package view;

import util.OutputViewMessage;

public class OutputView {

    public static void printHyphen(int numberOfRepeat) {
        System.out.println(OutputViewMessage.HYPHEN.getMessage().repeat(numberOfRepeat));
    }

    public static void printMenu() {
        System.out.println(OutputViewMessage.MENUS.getMessage());
    }

    public static void printExit() {
        System.out.println(OutputViewMessage.EXIT.getMessage());
    }
}

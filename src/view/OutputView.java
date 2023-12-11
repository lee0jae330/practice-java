package view;

import java.util.List;
import util.OutputViewMessage;

public class OutputView {

    private static void printHyphen(int repeatNumber) {
        System.out.println(OutputViewMessage.HYPHEN.getMessage().repeat(repeatNumber));
    }

    public static void printMenu() {
        printHyphen(20);
        System.out.println(OutputViewMessage.MENUS.getMessage());
        printHyphen(20);
    }

    public static void printCreateMsg() {
        printHyphen(10);
        System.out.println(OutputViewMessage.CREATE.getMessage());
        printHyphen(10);
    }

    public static void printCreateResult() {
        System.out.println(OutputViewMessage.CREATE_RESULT.getMessage());
    }


    public static void printAccounts(List<String> accounts) {
        printHyphen(10);
        System.out.println(OutputViewMessage.SHOW_ACCOUNTS.getMessage());
        printHyphen(10);
        for (String information : accounts) {
            System.out.println(information);
        }
    }

    public static void printError(String errorMessage) {
        System.out.println(errorMessage);
    }


    public static void printExit() {
        System.out.println(OutputViewMessage.EXIT.getMessage());
    }
}

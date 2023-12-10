package view;

import java.util.List;
import util.OutputViewMessage;

public class OutputView {

    public static void printMenu() {
        System.out.println(OutputViewMessage.HYPHEN.getMessage().repeat(20));
        System.out.println(OutputViewMessage.MENUS.getMessage());
    }

    public static void printCreateMsg() {
        System.out.println(OutputViewMessage.HYPHEN.getMessage().repeat(10));
        System.out.println(OutputViewMessage.CREATE.getMessage());
        System.out.println(OutputViewMessage.HYPHEN.getMessage().repeat(10));
    }

    public static void printCreateResult() {
        System.out.println(OutputViewMessage.CREATE_RESULT.getMessage());
    }


    public static void printAccounts(List<String> accounts) {
        for (String information : accounts) {
            System.out.println(information);
        }
    }



    public static void printExit() {
        System.out.println(OutputViewMessage.EXIT.getMessage());
    }
}

package Lesson4;

import java.util.Scanner;

// В калькулятор добавьте возможность отменить последнюю операцию.

import java.util.Stack;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import Lesson2.log;

public class homework3 {
    public static void main(String[] args) {
        String logpath = "Lesson4/calc_log.txt";
        Stack<Float> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введите выражение, или наберите cancel для отмены последнего:");
            String expr = sc.nextLine();
            // String[] strnum;
            if (expr.contains("+")) {
                String[] strnum = expr.split("\\+");
                if (strnum[0].isEmpty()) {
                    Float result = stack.peek() + Float.parseFloat(strnum[1]);
                    String logstr = stack.peek() + " + " + strnum[1] + " = " + result;
                    logging(logstr, logpath);
                    stack.push(result);
                    System.out.println(stack.peek());
                } else {
                    Float result = Float.parseFloat(strnum[0]) + Float.parseFloat(strnum[1]);
                    String logstr = strnum[0] + " + " + strnum[1] + " = " + result;
                    logging(logstr, logpath);
                    stack.push(result);
                    System.out.println(stack.peek());
                }
            } else if (expr.contains("-")) {
                String[] strnum = expr.split("\\-");
                if (strnum[0].isEmpty()) {
                    Float result = stack.peek() - Float.parseFloat(strnum[1]);
                    String logstr = stack.peek() + " - " + strnum[1] + " = " + result;
                    logging(logstr, logpath);
                    stack.push(result);
                    System.out.println(stack.peek());
                } else {
                    Float result = Float.parseFloat(strnum[0]) - Float.parseFloat(strnum[1]);
                    String logstr = strnum[0] + " - " + strnum[1] + " = " + result;
                    logging(logstr, logpath);
                    stack.push(result);
                    System.out.println(stack.peek());
                }
            } else if (expr.contains("*")) {
                String[] strnum = expr.split("\\*");
                if (strnum[0].isEmpty()) {
                    Float result = stack.peek() * Float.parseFloat(strnum[1]);
                    String logstr = stack.peek() + " * " + strnum[1] + " = " + result;
                    logging(logstr, logpath);
                    stack.push(result);
                    System.out.println(stack.peek());
                } else {
                    Float result = Float.parseFloat(strnum[0]) * Float.parseFloat(strnum[1]);
                    String logstr = strnum[0] + " * " + strnum[1] + " = " + result;
                    logging(logstr, logpath);
                    stack.push(result);
                    System.out.println(stack.peek());
                }
            } else if (expr.contains("/")) {
                String[] strnum = expr.split("\\/");
                if (strnum[0].isEmpty()) {
                    Float result = stack.peek() / Float.parseFloat(strnum[1]);
                    String logstr = stack.peek() + " / " + strnum[1] + " = " + result;
                    logging(logstr, logpath);
                    stack.push(result);
                    System.out.println(stack.peek());
                } else {
                    Float result = Float.parseFloat(strnum[0]) / Float.parseFloat(strnum[1]);
                    String logstr = strnum[0] + " / " + strnum[1] + " = " + result;
                    logging(logstr, logpath);
                    stack.push(result);
                    System.out.println(stack.peek());
                }
            } else if (expr.equals("cancel")) {
                System.out.println("Отмена последнего действия: " + stack.pop());
                System.out.println("Результат: " + stack.peek());
                logging("Отмена последнего действия", logpath);
            } else {
                System.out.println("Некорректное выражение");
                break;
            }
        }
        sc.close();
    }

    public static void logging(String str, String path) {
        try {
            Logger fl = Logger.getLogger(log.class.getName());
            String logpath = path;
            String msg = str;
            FileHandler fh = new FileHandler(logpath, true);
            fl.addHandler(fh);
            SimpleFormatter form = new SimpleFormatter();
            // XMLFormatter form = new XMLFormatter();
            fh.setFormatter(form);
            fl.info(msg);
        } catch (Exception e) {
            System.err.println("Error");
        }
    }
}

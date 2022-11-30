//11. Реализовать простой калькулятор (пользователь вводит 2 числа и вводит операцию (+ - / *). Добавить логирование

package task011_Calculator;

import java.util.Scanner;
import java.util.LinkedList;

import java.io.IOException;
import java.util.logging.*;

public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Пример: ");
        String text = iScanner.nextLine();
        int res = GetRes(text);
        System.out.println("Ответ " + res);
        Logging(text + " = " + "" + res);
        iScanner.close();
    }

    static boolean isDelim(char c) {
        return c == ' ';
    }

    static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '%';
    }

    static int priority(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
            case '%':
                return 2;
            default:
                return -1;
        }
    }

    static void processOperator(LinkedList<Integer> st, char op) {
        int r = st.removeLast();
        int l = st.removeLast();
        switch (op) {
            case '+':
                st.add(l + r);
                break;
            case '-':
                st.add(l - r);
                break;
            case '*':
                st.add(l * r);
                break;
            case '/':
                st.add(l / r);
                break;
            case '%':
                st.add(l % r);
                break;
        }
    }

    static int GetRes(String s) {
        LinkedList<Integer> st = new LinkedList<Integer>();
        LinkedList<Character> op = new LinkedList<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isDelim(c))
                continue;
            if (c == '(')
                op.add('(');
            else if (c == ')') {
                while (op.getLast() != '(')
                    processOperator(st, op.removeLast());
                op.removeLast();
            } else if (isOperator(c)) {
                while (!op.isEmpty() && priority(op.getLast()) >= priority(c))
                    processOperator(st, op.removeLast());
                op.add(c);
            } else {
                String operand = "";
                while (i < s.length() && Character.isDigit(s.charAt(i)))
                    operand += s.charAt(i++);
                --i;
                st.add(Integer.parseInt(operand));
            }
        }

        while (!op.isEmpty())
            processOperator(st, op.removeLast());

        return st.get(0);
    }

    static void Logging(String str) {
        Logger logger = Logger.getLogger(program.class.getName());
        ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh;
        try {
            fh = new FileHandler("task011_Calculator/log.txt");
            logger.addHandler(ch);
            logger.addHandler(fh);

            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);
            logger.info(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package yuown.hackerrank;

import java.util.Scanner;

public class ContactApplication {
    public static void main(String[] args) {
        Node b = new Node();
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            if (input.trim().length() > 0) {
                String[] data = input.split(" ");
                if (data[0].equals(ACTION.ADD.toString().toLowerCase())) {
                    b.add(data[1]);
                } else if (data[0].equals(ACTION.FIND.toString().toLowerCase())) {
                    System.out.println(b.find(data[1]));
                }
            }
        }
    }
}

enum ACTION {
    ADD, FIND
}

class Node {

    final static int MAX = 26;

    Node[] chars = new Node[MAX];

    private int size;

    public int getPosition(char c) {
        return c - 'a';
    }

    public void add(String name) {
        add(name, 0);
    }

    private void add(String name, int index) {
        size++;
        if(index == name.length()) {
            return;
        }
        char current = name.charAt(index);
        Node child = getNode(current);
        if(null == child) {
            child = new Node();
            setNode(child, current);
        }
        child.add(name, index + 1);
    }

    private Node getNode(char charCode) {
        return chars[getPosition(charCode)];
    }

    private void setNode(Node n, char charCode) {
        chars[getPosition(charCode)] = n;
    }

    public int find(String name) {
        return find(name, 0);
    }

    private int find(String name, int index) {
        if (index == name.length())
            return size;
        Node child = getNode(name.charAt(index));
        if (child == null) {
            return 0;
        }
        return child.find(name, index + 1);
    }
}

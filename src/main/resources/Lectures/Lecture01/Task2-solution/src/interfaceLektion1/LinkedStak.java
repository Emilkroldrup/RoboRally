
package interfaceLektion1;

class StakElement {
    StakElement next;
    String data;

    StakElement(String s, StakElement e) {
        data = s;
        next = e;
    }
}

public class LinkedStak implements IStak {

    private StakElement start;

    public LinkedStak() {
        start = null;
    }

    public void push(String s) {
        StakElement temp;
        temp = new StakElement(s, start);
        start = temp;
    }

    public String pop() {
        if (empty()) return null;
        String s = start.data;
        start = start.next;
        return s;
    }

    public boolean empty() {
        return start == null;
    }

    public boolean full() {
        return false;
    }

    public void show() {
        for (StakElement p = start; p != null; p = p.next)
            System.out.println(p.data + " ");
        System.out.println("*");
    }
}


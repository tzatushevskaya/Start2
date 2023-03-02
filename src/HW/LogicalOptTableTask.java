package HW;

public class LogicalOptTableTask {

    public static void main(String args[]) {

        boolean p1, q1;
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
        p1 = true;
        q1 = true;
        System.out.print(p1 + "\t" + q1 + "\t");

        System.out.print((p1&q1) + "\t" + (p1|q1) + "\t");
        System.out.println((p1^q1) + "\t" + (!p1));
        p1 = true;
        q1 = false;
        System.out.print(p1 + "\t" + q1 + "\t");
        System.out.print((p1&q1) + "\t" + (p1|q1) + "\t");
        System.out.println((p1^q1) + "\t" + (!p1));
        p1 = false;
        q1 = true;
        System.out.print(p1 + "\t" + q1 + "\t");
        System.out.print((p1&q1) + "\t" + (p1|q1) + "\t");
        System.out.println((p1^q1) + "\t" + (!p1));
        p1 = false;
        q1 = false;
        System.out.print(p1 + "\t" + q1 + "\t");
        System.out.print((p1&q1) + "\t" + (p1|q1) + "\t");
        System.out.println((p1^q1) + "\t" + (!p1));

    }


}

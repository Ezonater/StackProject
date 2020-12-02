public class StackTester

{

    public static void main(String [] args) {

        Stack s = new Stack();

        System.out.println(s);

        s.push(1);

        System.out.println(s);

        s.push(2);

        s.push(3);

        System.out.println(s.pop());

        s.push(4);

        s.push(5);

        System.out.println(s);

        System.out.println(s.pop());

        System.out.println(s.pop());

        System.out.println(s.pop());

        System.out.println(s);

    }

}


package localInnerClass;

public class Outer {
    private int number = 10;

    public void someMethod() {
        //always as final
        int x = 5;

        class LocalInner {
            private void print() {
                //x = 6;//Variable 'x' is accessed from within inner class, needs to be final or effectively final
                number = 11;//could be edited in local inner class
                System.out.printf("number + x = %d%n", Outer.this.number + x);
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.print();
    }

    //LocalInner localInner = new LocalInner(); doesn't have an access outside of block!
}

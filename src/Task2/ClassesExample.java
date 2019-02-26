package Task2;

public class ClassesExample {

    private static class NestedClass {
        public void showNested() {
            System.out.println("This is result of Static Nested Class");
        }
    }


    class Inner {
        public void showInner() {
            System.out.println("This is result of Inner Class");
        }

    }


    static void printVars() {

        class Local {

            void printLocal() {
                System.out.println("This is result of Local Class");
            }
        }

        Local local = new Local();
        local.printLocal();
    }


    static Res h = new Res() {
        public void show() {
            System.out.println("This is result of Anonymous Inner Class");
        }
    };


    public static void runInnerClassExample() {
        //test for inner class
        ClassesExample.Inner inner = new ClassesExample().new Inner();
        inner.showInner();
        //test for static nested class
        ClassesExample.NestedClass nestedObject = new ClassesExample.NestedClass();
        nestedObject.showNested();
        //test for anonymous class
        h.show();
        //test for local class
        ClassesExample.printVars();

    }
}

interface Res {
    void show();
}



package Assingnment4_GC;

class UnreachableObject {
    String name;

    UnreachableObject(String name) {
        this.name = name;
    }

    void display() {
        new UnreachableObject("Inner Object").show();
    }

    void show() {
        new UnreachableObject("Nested Object").display();
    }

    @Override
    protected void finalize() {
        System.out.println("Object " + name + " successfully garbage collected.");
    }
}

public class Question1 {
    public static void main(String[] args) {
        UnreachableObject obj = new UnreachableObject("Main Object");
        obj.show();
        System.gc();
    }
}

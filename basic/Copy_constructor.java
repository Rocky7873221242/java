class Copy_constructor {
    int id;
    String name;

    Copy_constructor(int i, String n) {
        id = i;
        name = n;
    }

    Copy_constructor(Copy_constructor s) {
    
        id = s.id;
        name = s.name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        Copy_constructor s1 = new Copy_constructor(111, "Karan");
        Copy_constructor s2 = new Copy_constructor(s1);
        s1.display();
        s2.display();
    }
}
package test;

public class TestMain {
    public static void main(String[] args) {
        Object[] tab = {1, "bob", "4.11f", false, 'x'};
        for(Object o:tab)
            System.out.println(o);
    }
}

public class NameMain {
    public static void main(String[] args) {
        Name n = new Name("Sean" , "morris");
        System.out.println(n.fullname());

        Name n2 = new Name("Sean","");
        System.out.println(n2.fullname());
    }
}

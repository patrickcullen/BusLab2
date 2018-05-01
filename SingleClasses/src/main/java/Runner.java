public class Runner {

    public static void main(String[] args) {
        Bear bear = new Bear("Balu");
        String name = bear.getName();
        System.out.println(name);
        bear.setName("Balloo");
        System.out.println(bear.getName());
        name = bear.getName();
        System.out.println(name);
//        System.out.println(bear.name);
//        bear.name = "";
//        System.out.println(bear.name);
    }
}

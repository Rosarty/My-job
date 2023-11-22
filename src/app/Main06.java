package app;

public class Main06 {
    static String[] nameproducts;
    static String name;
    static int time;

    public static void main(String[] args) {

        nameproducts = new String[]{"smartphone", "charge", "camera", "notebook", "charge"};
        name = "charge";
        time = 9;
        int num = 0;
        for (String item : nameproducts) {
            num++;
            System.out.print(num + ")" + "Purchase of a " + item + " at " + time + " p.m." + "\n");

            if (item.equals(name))
                System.out.println("repetitive product ");

            if (!item.equals(name))
                System.out.println("One product");
        }
    }
}


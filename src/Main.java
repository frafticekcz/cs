import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        var arrayList = new ArrayList<>();
        arrayList.add("cs");

        var c = "c";
        switch (c)
        {
            case "a", "b" -> System.out.println("nn");
            case "c", "d" -> System.out.println("jj");
            default -> System.out.println("nn2");
        }
    }
}

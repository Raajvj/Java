import java.util.*;

class Exampleset {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<String>();
        hs.add("ICT");
        hs.add("Academy");
        hs.add("Welcome");
        System.out.println("USing hashset add()" + hs);
        hs.remove("ICT");
        System.out.println("Using hashset remove()" + hs);
        hs.size();
        System.out.println("Using hashset size()" + hs);
    }

}
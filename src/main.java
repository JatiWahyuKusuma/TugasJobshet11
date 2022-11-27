public class main {
    public static void main (String [] args){
        Singa singa1 = new Singa("Bruno", 4 , "rawrrr", "Coklatt");
        singa1.displayBinatang();
        singa1.displayMakan();
        singa1.displayData();
        System.out.println("====================================");
        Gorilla gorilla1 = new Gorilla("Gerry", 4, "ahaummm", "hitam manis");
        gorilla1.displayBinatang();
        gorilla1.displayMakan();
        gorilla1.displayData();
        System.out.println("====================================");
        Keledai keledai1 = new Keledai("Donkey", 4, "hehehehe", "abu abu");
        keledai1.displayBinatang();
        keledai1.displayMakan();
        keledai1.displayData();
        System.out.println("====================================");
    }
}

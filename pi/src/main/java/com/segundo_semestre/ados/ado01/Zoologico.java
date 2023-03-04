package pi.ado01;

public class Zoologico {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem vindo ao nosso bando de Kiwis!");

        Kiwi kiwi_kaua = new Kiwi();
        Kiwi kiwi_calixto = new Kiwi("calixto", 18, 15);

        kiwi_kaua.setName("kaua");
        kiwi_kaua.setAge(18);
        kiwi_kaua.setBeakSize(15);

        System.out.println(kiwi_kaua.getName());
        System.out.println(kiwi_calixto.getName());

        kiwi_kaua.sleep();

        System.out.println("\nCurrent sleeping kiwis:\n" + kiwi_kaua.getName() + ": " + kiwi_kaua.isSleeping() + "\n"
                + kiwi_calixto.getName() + ": " + kiwi_calixto.isSleeping());

    }
}

public class Main {
    public static void main(String[] args) {

        RussianHen russianHen1 = new RussianHen("Russian", 1);
        HenFactory.getHen(russianHen1.getCountry());
        UkraineHen ukraineHen1 = new UkraineHen("Ukraine", 2);
        HenFactory.getHen(ukraineHen1.getCountry());

    }
}
public class HenFactory {
    public static void getHen(String countryName){
        if(countryName.equals("Russian")){
            RussianHen russianHen = new RussianHen("Russian", 1);
            russianHen.getDescription();
        }
        else if(countryName.equals("Ukraine")){
            UkraineHen ukraineHen = new UkraineHen("Ukraine", 2);
            ukraineHen.getDescription();
        }
    }
}

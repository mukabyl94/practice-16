import org.w3c.dom.ls.LSOutput;

public class RussianHen extends Hen{
    public RussianHen(String country, int egg) {
        super(country, egg);
    }

    public RussianHen() {
    }
    @Override
    public  int getCountOfEggsPerMonth(){
       return getEgg()*30;
    }
    @Override
    public  void getDescription(){
        System.out.println("menin olkon " + getCountry() + " men bir aida " + getCountOfEggsPerMonth() + " jumurtka tuuim");
    }

}

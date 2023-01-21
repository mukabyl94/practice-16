public class UkraineHen extends Hen{


    public UkraineHen(String country, int egg) {
        super(country, egg);
    }

    public UkraineHen() {
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return getEgg()*30;
    }

    @Override
    public void getDescription() {
        System.out.println("menin olkon " + getCountry() + " men bir aida " + getCountOfEggsPerMonth() + " jumurtka tuuim");
    }
}

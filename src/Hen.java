public class Hen {
    private String country;
    private int egg;
//    private static int counter;
//    private boolean sold;

    public Hen(String country, int egg) {
        this.country = country;
        this.egg = egg;
    }

    public Hen() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getEgg() {
        return egg;
    }

    public void setEgg(int egg) {
        this.egg = egg;
    }

    public int getCountOfEggsPerMonth(){
        int result = egg*30;
        return result;
    }
    public void getDescription(){

    }

}

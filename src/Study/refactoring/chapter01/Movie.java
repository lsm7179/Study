package Study.refactoring.chapter01;

import Study.refactoring.chapter01.Price.*;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REAGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public String getTitle() {
        return title;
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    public void setPriceCode(int priceCode) {
        switch (priceCode){
            case REAGULAR:
                price=new ReqularPrice();
                break;
            case NEW_RELEASE:
                price=new NewReleasePrice();
                break;
            case CHILDRENS:
                price=new ChildrensPrice();
                break;
        }
    }

    //비디오 종류별 대여료 계산
    double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }
}

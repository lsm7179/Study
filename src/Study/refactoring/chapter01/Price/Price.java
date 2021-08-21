package Study.refactoring.chapter01.Price;

import Study.refactoring.chapter01.Movie;

public abstract class Price {
    public abstract int getPriceCode();

    //비디오 종류별 대여료 계산
    public abstract double getCharge(int daysRented);
}


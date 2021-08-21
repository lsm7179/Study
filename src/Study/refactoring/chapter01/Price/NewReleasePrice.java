package Study.refactoring.chapter01.Price;

import Study.refactoring.chapter01.Movie;

public class NewReleasePrice extends Price {

    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    //비디오 종류별 대여료 계산
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }
}

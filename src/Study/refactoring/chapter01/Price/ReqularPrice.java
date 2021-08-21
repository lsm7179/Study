package Study.refactoring.chapter01.Price;

import Study.refactoring.chapter01.Movie;

public class ReqularPrice extends Price {

    @Override
    public int getPriceCode() {
        return Movie.REAGULAR;
    }

    //비디오 종류별 대여료 계산
    public double getCharge(int daysRented) {
        double result = 2;
        if (daysRented > 2)
            result += (daysRented - 2) * 1.5;

        return result;
    }
}

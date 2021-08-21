package Study.refactoring.chapter01;

class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public double getCharge() {
        return movie.getCharge(daysRented);
    }

    //최신물을 이틀 이상 대여하면 2포인트 지급하고 그외엔 1포인 트 지급하는 코드를
    //빼내 getFrequentRenterPoints 메서드로 만들고 이 Rental 클래스로 옮겼다.
    public int getFrequentRenterPoints() {
        if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDaysRented() > 1)
            return 2;
        else
            return 1;
    }


}

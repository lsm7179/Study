package Study.refactoring.chapter01;

import java.util.Enumeration;
import java.util.Vector;

class Customer {
    private String name;
    private Vector _rentals = new Vector();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = getName() + " 고객님의 대여 기록\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();

            frequentRenterPoints += each.getFrequentRenterPoints();

            //이번에 대여하는 비디오 정보와 대여료를 출력
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    String.valueOf(each.getCharge()) + "\n";

            //현재까지 누적된 총 대여료
            totalAmount += each.getCharge();
        }
        //푸터 행 추가
        result += "누적 대여료 " + String.valueOf(totalAmount) + "\n";
        result += "적립 포인트 " + String.valueOf(frequentRenterPoints) + "\n";
        return result;
    }

}

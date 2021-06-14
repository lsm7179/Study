package studyStreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("이승민","홍길동","김철수","강민수","고영희","차수박","신영수","김태우","김이나", "이승민");

        //list 복사
        List<String> sortingNames = names.stream().collect(Collectors.toList());

        //Stream 검색
        names.stream().filter(x -> x.contains("이")).forEach(x-> System.out.println("이 글자가 포함된 이름 : "+x));

        //쿼리 filter 여러개
        names.stream().filter(x -> x.contains("이")).filter(x -> x.contains("민")).forEach(x-> System.out.println("이,민 글자가 포함된 이름 : "+x));

        //count 확인
        long count = 0;
        count = names.stream().count();
        System.out.println("Count : " + count);

        //문자열에 추가 또는 삭제 또는 수정 map을 사용한다.
        names.stream().map(x -> x.concat(" 이름 뒤에 붙은 문자열 : ")).forEach(x -> System.out.println(x));

        //개수 정하기
        names.stream().limit(5).forEach(x -> System.out.println("limit5 : "+x));

        //정렬
        names.stream().sorted().forEach(x -> System.out.println("정렬 : "+x));
        names.stream().sorted(Comparator.reverseOrder()).forEach(x -> System.out.println("역순 정렬 : "+x));

        //중복 제거
        names.stream().distinct().forEach(x -> System.out.println("중복제거 : "+x));

        //최대, 최소값 구하기
        names.stream().min(Comparator.naturalOrder()).ifPresent(x-> System.out.println("최소값 : "+x));
        names.stream().max(Comparator.naturalOrder()).ifPresent(x-> System.out.println("최대값 : "+x));
    }
}



package Programmers;
import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/42579
// https://velog.io/@yanghl98/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EB%B2%A0%EC%8A%A4%ED%8A%B8%EC%95%A8%EB%B2%94-JAVA%EC%9E%90%EB%B0%94
public class Solution_42579 {

    class Music {
        String genre;
        int play;
        int idx;

        public Music(String genre, int play, int idx) {
            this.genre = genre;
            this.play = play;
            this.idx = idx;
        }
    }

    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i < genres.length; i++){
            map.put(genres[i], map.getOrDefault(genres[i], 0)+plays[i]);
        }

        // 장르목록 정렬 sort
        List<String> genresList = new ArrayList<>();
        while(map.size() != 0) {
            int max = -1;
            String maxKey = "";
            for(String key : map.keySet()){
                int tmp = map.get(key);
                if(tmp > max){
                    max = tmp;
                    maxKey = key;
                }
            }
            genresList.add(maxKey);
            map.remove(maxKey);
        }

        // 장르 내 노래선정
        List<Music> result = new ArrayList<>();
        for(String gern: genresList){
            ArrayList<Music> list = new ArrayList<>();
            for(int i=0 ;i< genres.length;i++) {
                if(genres[i].equals(gern)){
                    list.add(new Music(gern,plays[i],i));
                }
            }

            Collections.sort(list, (o1,o2) -> o2.play - o1.play);

            // 결과값 수록
            result.add(list.get(0));
            if(list.size() > 1){
                result.add(list.get(1));
            }
        }


        int[] answer = new int[result.size()];
        for(int i =0; i < result.size();i++){
            answer[i] = result.get(i).idx;
        }

        return answer;
    }
}

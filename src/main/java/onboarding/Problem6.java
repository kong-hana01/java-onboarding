package onboarding;

import java.util.HashMap;
import java.util.List;

public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
        List<String> answer = List.of("answer");
        return answer;
    }

    // 이메일과 닉네임을 저장할 HashMap을 초기화하는 함수
    public static HashMap<String, String> initDatabaseOfNickname() {
        return new HashMap<String, String>();
    }

    // 이메일과 닉네임의 중복 여부를 판단할 HashMap을 초기화하는 함수
    public static HashMap<String, Integer> initDuplicationOfNickname() {
        return new HashMap<String, Integer>();
    }

    // 이메일과 닉네임을 HashMap에 추가하는 함수
    public static void addUsers(HashMap<String, String> databaseOfNickname, List<String> user) {
        databaseOfNickname.put(user.get(0), user.get(1));
    }

    // 이메일과 닉네임을 추가한 뒤 중복 여부를 판단하는 함수
    public static boolean checkDuplicationOfNicknames(HashMap<String, String> databaseOfNickname, String newNickname) {
        for (String nickname : databaseOfNickname.values()) {
            if (checkDuplicationOfNickname(nickname, newNickname)) return true;
        }
        return false;
    }

    // 유저들 각각에 대해 중복 여부를 판단하는 함수
    public static boolean checkDuplicationOfNickname(String nickname, String newNickname) {
        for (int i = 0; i < newNickname.length() - 1; i++) {
            if (nickname.contains(newNickname.substring(i, i+2))) return true;
        }
        return false;
    }
}

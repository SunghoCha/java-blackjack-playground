package blackjack.view;

import blackjack.domain.Player;
import blackjack.domain.PlayerName;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class InputView {
    private static Scanner sc = new Scanner(System.in);
    private static final String regex = "([\\w],)*+[\\w]$";
    private static String[] values;

    public static String[] getName() {
        System.out.println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)");
        String value = sc.next();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(value);

        if (matcher.find()) {
            values = value.trim().split(",");
        }
        return values;
    }
}

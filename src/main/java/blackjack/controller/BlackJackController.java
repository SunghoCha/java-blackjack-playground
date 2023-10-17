package blackjack.controller;

import blackjack.domain.Player;
import blackjack.domain.PlayerName;
import blackjack.view.InputView;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class BlackJackController {
    private static Scanner sc = new Scanner(System.in);
    private static final String regex = "([\\w],)*+[\\w]$";
    private static String[] values;
    private String value = "pobi,jason";

    public void sdf() {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(value);

        if (matcher.find()) {
            values = value.trim().split(",");
        }
        List<Player> players = Arrays.stream(values).map(name -> new Player(new PlayerName(name))).collect(Collectors.toList());
        players.stream().map()
    }
}

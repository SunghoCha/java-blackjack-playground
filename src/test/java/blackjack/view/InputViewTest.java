package blackjack.view;

import org.junit.jupiter.api.Test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputViewTest {

    @Test
    void ds() {
        String regex = "([\\w],)*+[\\w]$";
        String value = "pobi,jason";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(value);
        boolean b = matcher.find();
        System.out.println("b = " + b);

    }
}

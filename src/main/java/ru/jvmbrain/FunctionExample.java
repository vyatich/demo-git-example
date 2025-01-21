package ru.jvmbrain;

import java.util.function.BiFunction;
import java.util.function.Function;

import static ru.jvmbrain.FunctionExample.Type.KICK_FROM_A_U_TURN;
import static ru.jvmbrain.FunctionExample.Type.PUNCH;

public class FunctionExample {

    static Function<Object, Long> powerFunc =
            obj -> obj instanceof JackieChan ? 10L : Long.MAX_VALUE;

    static BiFunction<Object, Type, Long> hitFunc =
            (obj, type) ->
                    obj instanceof ChuckNorris &&
                    type == KICK_FROM_A_U_TURN ? Long.MAX_VALUE : 7L;

    public static void main(String[] args) {
        String s = "";
        s
                .toCharArray();
        JackieChan jackieChan = new JackieChan();
        System.out.println(powerFunc.apply(jackieChan));
        System.out.println(hitFunc.apply(jackieChan, PUNCH));

        ChuckNorris chuckNorris = new ChuckNorris();
        System.out.println(powerFunc.apply(chuckNorris));
        System.out.println(hitFunc.apply(chuckNorris, KICK_FROM_A_U_TURN));
    }

    static class JackieChan { }

    static class ChuckNorris { }

    enum Type {
        KICK_FROM_A_U_TURN("Удар ноги с разворота"),
        PUNCH("Удар кулаком");

        private final String desc;

        Type(String desc) {
            this.desc = desc;
        }
    }
}

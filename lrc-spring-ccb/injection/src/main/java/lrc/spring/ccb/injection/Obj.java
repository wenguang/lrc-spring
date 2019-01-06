package lrc.spring.ccb.injection;

public class Obj {
    public static int NO_AGE = 20;
    public static String NO_BARKING = "汪";

    public static void SetBarking(String barking) {
        NO_BARKING = barking;
    }

    public static int Get100Age() {
        return 100;
    }
}



/**
 * @Author Thomas V.Yttri
 */
public class TODO {

    public static String method() {

        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();

        return "Metoden " + methodName + " er ikkje implementert";
    }

    public static String constructor(String className) {

        return "Konstruktøren for klassen " + className + " er ikke implementert";
    }
}
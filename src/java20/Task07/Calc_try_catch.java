package java20.Task07;

/**
 * Задание №7
 *
 * @author Marenkov
 */

public class Calc_try_catch {

    private Double param1;
    private Double param2;
    private String oper;

    public static String str;

    public Calc_try_catch(Double param1, Double param2, String oper) {
        this.param1 = param1;
        this.param2 = param2;
        this.oper = oper;

    }

    public Double calculation() {
        Double result;
        result = 0.0;

        switch (this.oper) {
            case "+":
                result = param1 + param2;
                break;
            case "-":
                result = param1 - param2;
                break;
            case "*":
                result = param1 * param2;
                break;
            case "/":
                try {
                    if (param2 == 0.0) {
                        throw new IllegalArgumentException("На ноль делить нельзя.");
                    } else {
                        result = param1 / param2;
                        break;
                    }
                } catch (IllegalArgumentException e) {
                    str = e.getMessage();
                    System.err.println(str);
                }
                break;
            default:
                throw new IllegalArgumentException("Некорректная операция.");
        }
        return result;
    }
}
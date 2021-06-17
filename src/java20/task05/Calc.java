package java20.task05;

public class Calc {

    private Double param1;
    private Double param2;
    private String oper;

    public Calc(Double param1, Double param2, String oper) {
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
                if (param2 == 0){
                    throw new IllegalArgumentException("На ноль делить нельзя.");
                }
                else{
                    result = param1 / param2;
                    break;
            }
            default:
                throw new IllegalArgumentException("Некорректная операция.");
        }
        return result;
    }
}
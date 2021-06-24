package java20.Task08;

import java20.Task07.Calc_try_catch;
import java20.Task07.Task07;
import org.junit.Assert;
import org.junit.Test;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 * Задание №8
 * Написаны тесты на проверку калькулятора из задания №7.
 *
 * @author Marenkov
 */

public class Task08 {

    @Test
    public void checkingsumresult() {  // Проверка сложения.
        Calc_try_catch calc = new Calc_try_catch(2.0, 3.0, "+");

        Double expected = 5.0;
        Assert.assertEquals(expected, calc.calculation());
    }

    @Test
    public void checkingsubtractionresult() { // Проверка вычитания.
        Calc_try_catch calc = new Calc_try_catch(12.0, 13.0, "-");

        Double expected = -1.0;
        Assert.assertEquals(expected, calc.calculation());
    }

    @Test
    public void checkingmultiplicationresult() { // Проверка умножения.
        Calc_try_catch calc = new Calc_try_catch(11.5, 66.26, "*");

        Double expected = 761.99;
        Assert.assertEquals(expected, calc.calculation());
    }

    @Test
    public void checkingmdivisionresult() { // Проверка деления и вывод отрицательного результата.
        Calc_try_catch calc = new Calc_try_catch(-10.2, 2.2, "/");

        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.UK);
        otherSymbols.setGroupingSeparator('.');
        DecimalFormat tolres = new DecimalFormat("0.0000", otherSymbols);

        Double finres = Double.parseDouble(tolres.format(calc.calculation()));
        Double expected = -4.6364;

        Assert.assertEquals(expected, finres);
    }

    @Test
    public void checkingzeroresult() { // Проверка вывода 0.0.
        Calc_try_catch calc = new Calc_try_catch(0.0, 0.0, "+");

        Double expected = 0.0;
        Assert.assertEquals(expected, calc.calculation());
    }


    @Test
    public void testdivisionzero() { // Проверка деления на ноль.
        Calc_try_catch calc = new Calc_try_catch(12.0, 0.0, "/");
        String str = null;
        try {
            calc.calculation();
        }
        catch (IllegalArgumentException e) {
            str = e.getMessage();
        }
        String expected = "На ноль делить нельзя.";
        Assert.assertEquals(expected, str);
    }
}

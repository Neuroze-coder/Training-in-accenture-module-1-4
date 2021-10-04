/**
 * Комплексные числа
 * необходимо определить класс для работы с комплексными числами
 * ( напоминаю, что у комплексного числа имеется действительная real (r,j) и мнимая imaginary (i) части, общий вид записи такого числа : c= r+i*j)
 * для комплексных чисел определены операции сложения, вычитания, умножения и деления.
 * Относительно этих операций множество комплексных чисел C является полем.
 * Однако многие свойства комплексных чисел отличаются от свойств вещественных чисел;
 * например, два комплексных числа нельзя сравнивать на больше/меньше.
 * Реализуйте код операций с комплексными числами
 */
public class Complex {
    private double re; //Real
    private double im; //Imaginary

    public Complex() {
    }

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public String toString() {
        return "Complex{" + "re=" + re + ", im=" + im + '}';
    }

    public Complex Negative() { // Комплексное отрицание
        Complex negative = new Complex();

        negative.re = -re;
        negative.im = -im;

        return negative;
    }

    public Complex Addition(Complex cB) { // Сложение cA + cB
        Complex sum = new Complex();

        sum.re = re + cB.re;
        sum.im = im + cB.im;

        return sum;

    }

    public Complex Subtraction(Complex cB) { // Разность cA - cB
        Complex difference = new Complex();

        difference.re = re - cB.re;
        difference.im = im - cB.im;

        return difference;
    }

    public Complex Multiplication(Complex cB) { // Разность cA - cB
        Complex product = new Complex();

        product.re = re * cB.re - im * cB.im;
        product.im = im * cB.re + re * cB.im;

        return product;
    }

    public Complex Division(Complex cB) { // Деление cA / cB
        Complex div = new Complex();
        double dR, dDen;

        if (Math.abs(cB.re) >= Math.abs(cB.im)) { // метод Math.abs дает модуль числа
            dR = cB.im / cB.re;
            dDen = cB.re + dR * cB.im;
            div.re = (re + dR * im) / dDen;
            div.im = (im - dR * re) / dDen;
        } else {
            dR = cB.re / cB.im;
            dDen = cB.im + dR * cB.re;
            div.re = (dR * re + im) / dDen;
            div.im = (dR * im - re) / dDen;
        }

        return div;

    }

    public Complex Scale(double dFactor) { // Скалирование (масштабирование)
        Complex scale = new Complex();

        scale.re = dFactor * re;
        scale.im = dFactor * im;

        return scale;
    }

    public Complex Conjugate() { // Комплексное сопряжение
        Complex conj = new Complex();

        conj.re = re;
        conj.im = -im;

        return conj;
    }

    public static void main(String[] args) {
        System.out.println("Run test");

        Complex cA = new Complex(3.0, 5.0);
        Complex cB = new Complex(8.0, 9.0);

        System.out.println("Complex number cA = " + cA.toString());
        System.out.println("Complex number cB = " + cB.toString());

        // Сложение и вычитание

        Complex cC = cA.Addition(cB);
        System.out.println("Complex cA + cB = " + cC.toString());
        Complex cD = cA.Subtraction(cB);
        System.out.println("Complex cA - cB = " + cD.toString());

        // Умножение и деление

        Complex cE = cA.Multiplication(cB);
        System.out.println("Complex cA * cB = " + cE.toString());
        Complex cF = cA.Division(cB);
        System.out.println("Complex cA / cB = " + cF.toString());

        // Скалирование

        Complex cG = cA.Scale(10.0);
        System.out.println("Complex 10 * cA = " + cG.toString());

        // Отризацние

        Complex cH = cA.Negative();
        Complex cI = cB.Negative();
        System.out.println("Complex negative cA = " + cH.toString());
        System.out.println("Complex negative cB = " + cI.toString());

    }

}

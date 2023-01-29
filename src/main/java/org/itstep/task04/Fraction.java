package org.itstep.task04;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction addition(Fraction fraction) {
        Fraction tmp = new Fraction();
        tmp.numerator = this.numerator * fraction.denominator + fraction.numerator * this.denominator;
        tmp.denominator = this.denominator * fraction.denominator;
        return reduction(tmp);
    }

    public Fraction subtraction(Fraction fraction) {
        Fraction tmp = new Fraction();
        tmp.numerator = this.numerator * fraction.denominator - fraction.numerator * this.denominator;
        tmp.denominator = this.denominator * fraction.denominator;
        return reduction(tmp);
    }

    public Fraction multiplication(Fraction fraction) {
        Fraction tmp = new Fraction();
        tmp.numerator = this.numerator * fraction.numerator;
        tmp.denominator = this.denominator * fraction.denominator;
        return reduction(tmp);
    }

    public Fraction division(Fraction fraction) {
        Fraction tmp = new Fraction();
        tmp.numerator = numerator * fraction.denominator;
        tmp.denominator = denominator * fraction.numerator;
        return reduction(tmp);
    }

    private int nodResult(int a, int b) {
        if (b == 0)
            return a;
        else
            return nodResult(b, a % b);
    }

    private Fraction reduction(Fraction fraction) {
        int nod = nodResult(fraction.numerator, fraction.denominator);
        int numerator = fraction.numerator / nod;
        int denominator = fraction.denominator / nod;

        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        return new Fraction(numerator, denominator);
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}

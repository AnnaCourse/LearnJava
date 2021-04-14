package org.learn.java.classes;

public class Operators {

    public int unaryPlusAfter(int a) {
        return a++;
    }

    public int unaryPlusBefore(int a) {
        return ++a;
    }

    public boolean unaryLogicalOposite(boolean flag) {
        return !flag;
    }

    public int modulus(int a, int b) {
        return a % b;
    }

    public boolean inclAND(boolean a, boolean b) {
        return a & b;
    }

    public boolean inclOR(boolean a, boolean b) {
        return a | b;
    }

    public boolean exclOR(boolean a, boolean b) {
        return a ^ b;
    }

    public boolean compare(int a, int b) {
        System.out.println("a="+a+" b="+b);
        if (a == b) {
            System.out.println("True");
            return true;
        }
        else {
            System.out.println("False");
            return false;
        }
    }

    public int ternaryComparison(int a, int b) {
        return a == b ? ( 5) : ( 6 );
    }

    public boolean complexCompare(int a, int b) {
        if (a > b) {
            if (a > 10) return true;
        } else if (a == b) return false;
        else if (a < b) {
            if (a < 10) return true;
        } else return false;
        return true;
    }


 }

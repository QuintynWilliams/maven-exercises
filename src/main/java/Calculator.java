public class Calculator {

    public static int add(int inpt1, int inp2) {
        return inpt1 + inp2;
    }

//    public static int add(int inpt1, int inp2) {
//        return inpt1 - inp2;
//    }
//RESULTS RESULTS RESULTS RESULTS RESULTS RESULTS
//    java.lang.AssertionError:
//Expected :14
//Actual   :-2
//

    public static double tip (double bill, double tipPercent) {
        return bill * (tipPercent/100);
    }

}

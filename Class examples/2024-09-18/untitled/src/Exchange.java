public class Exchange {

    //version 1
//    public static double convertEURtoUSD(double amount) {
//        return amount * 1.11;
//    }
//
//    public static double convertYENtoUSD(double amount) {
//        return amount * 0.01;
//    }
//
//    public static double convertRUBtoUSD(double amount) {
//        return amount * 0.01;
//    }

    //version 2
//    private static double eurRate = 1.11;
//    private static double yenRate = 0.01;
//    private static double rubRate = 0.01;
//
//    public static double convertEURtoUSD(double amount) {
//        return amount * eurRate;
//    }
//
//    public static double convertYENtoUSD(double amount) {
//        return amount * yenRate;
//    }
//
//    public static double convertRUBtoUSD(double amount) {
//        return amount * rubRate;
//    }

    // version 3

//    static final double EUR_RATE = 1.11;
//    static final double YEN_RATE = 0.01;
//    static final double RUB_RATE = 0.01;
//
//    public static double convert(double amount, double rate) {
//        return amount * rate;
//    }

    // version 4
    public static double convert(double amount, Curency c) {
        return amount * c.getRate();
    }

}

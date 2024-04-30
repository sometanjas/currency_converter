public class Converter {
    // Currency: 1 EUR ~ 1.07 USD,
    // 1 EUR ~ 168.23 JPY,
    // 1 USD ~ 157.02 JPY
    // 30.04.2024
    public static double convertEURtoUSD(double input) {
        return Math.round(input*1.07 * 100.0) / 100.0;
    }
    public static double convertEURtoJPY(double input) {
        return Math.round(input*168.23 * 100.0) / 100.0;
    }
    public static double convertUSDtoEUR(double input) {
        return Math.round(input/1.07 * 100.0) / 100.0;
    }
    public static double convertUSDtoJPY(double input) {
        return Math.round(input*157.02 * 100.0) / 100.0;
    }
    public static double convertJPYtoUSD(double input) {
        return Math.round(input/157.02 * 100.0) / 100.0;
    }
    public static double convertJPYtoEUR(double input) {
        return Math.round(input/168.23 * 100.0) / 100.0;
    }
}

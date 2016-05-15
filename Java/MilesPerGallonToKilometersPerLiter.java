public class Converter {
    public static double mpgToKPM(final float mpg) {
        double kpl = mpg / (4.54609188D / 1.609344D);
        double result = Math.round(kpl * 100.0D) / 100.0D;
        return result;
    }
}
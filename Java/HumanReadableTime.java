public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int countSeconds = seconds % 60;
        int minutes = seconds % 3600 / 60;
        int hours = seconds / 3600;
        return String.format("%02d", hours) + ":" + String.format("%02d", minutes) + ":" + String.format("%02d", countSeconds);
    }

}
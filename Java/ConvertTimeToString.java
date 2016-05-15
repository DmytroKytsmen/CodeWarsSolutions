class TimeUtils {
    public static String convertTime(int timeDiff) {
        // TODO your code here
        int seconds = timeDiff % 60;
        int minutes = timeDiff % 3600 / 60;
        int hours = timeDiff / (3600) % 24;
        int days = timeDiff / (3600 * 24);
        return days + " " + hours + " " + minutes + " " + seconds;
    }
}
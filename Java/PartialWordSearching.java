class WordSearch {
    static String[] findWord(String x, String[] y) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < y.length; i++) {
            if (y[i].toLowerCase().contains(x))
                result.add(y[i]);
        }
        return (result.size() == 0 ? new String[]{"Empty"} : result.toArray(new String[result.size()]));
    }
}
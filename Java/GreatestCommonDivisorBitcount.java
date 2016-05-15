public class BinaryGCD {
    public static int gcdBinary(int x, int y) {
        int gcd = 0;
        if (x == 0 || y == 0) {
            gcd = Math.abs(x - y);
            return findDigitsInBinary(gcd).length() - findDigitsInBinary(gcd).replace("1", "").length();
        }
        if (x == 0 && y == 0) {
            return 0;
        }

        ArrayList<Integer> factorsOfA = allFactors(x);
        ArrayList<Integer> factorsOfB = allFactors(y);
        for (Iterator iterator = factorsOfB.iterator(); iterator.hasNext(); ) {
            Integer integer = (Integer) iterator.next();
            System.out.println(integer);
        }
        factorsOfA.retainAll(factorsOfB);
        gcd = Collections.max(factorsOfA);
        System.out.println(gcd + " " + findDigitsInBinary(gcd));
        return findDigitsInBinary(gcd).length() - findDigitsInBinary(gcd).replace("1", "").length();
    }

    public static ArrayList<Integer> allFactors(int a) {
        ArrayList<Integer> resultList = new ArrayList<>();
        if (a < 0) {
            a *= -1;
        }
        for (int i = 1; i <= Math.round(Math.sqrt(a)); i++) {
            if (a % i == 0) {
                resultList.add(i);
                if (i != Math.sqrt(a)) {
                    resultList.add(a / i);
                }
            }
        }
        return resultList;
    }

    public static String findDigitsInBinary(int a) {
        String result = "";
        List<Integer> resultList = new ArrayList<>();
        while (a > 0) {
            int rem = a % 2;
            resultList.add(rem);
            a = a / 2;
        }
        Collections.reverse(resultList);
        for (Integer element : resultList) {
            result = result + element;
        }
        return result;
    }

}
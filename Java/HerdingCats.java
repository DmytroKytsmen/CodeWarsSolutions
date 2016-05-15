import java.util.Comparator;

public class CatWeightComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        if (cat1.weight > cat2.weight) {
            return 1;
        }
        if (cat1.weight < cat2.weight) {
            return -1;
        }
        return 0;

    }
}

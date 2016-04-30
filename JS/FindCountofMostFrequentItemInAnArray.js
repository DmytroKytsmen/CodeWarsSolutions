function mostFrequentItemCount(collection) {
    var mf = 0;
    var m = 0;
    var item;
    for (var i = 0; i < collection.length; i++) {
        for (var j = i; j < collection.length; j++) {
            if (collection[i] == collection[j]) m++;
            if (mf < m) {
                mf = m;
                item = collection[i];
            }
        }
        m = 0;
    }
    return mf;
}
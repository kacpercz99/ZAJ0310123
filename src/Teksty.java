public class Teksty{
    private final String[] tablicaLancuchow;

    public Teksty(String[] tablicaLancuchow) {
        this.tablicaLancuchow = tablicaLancuchow;
    }

    StringsIterator getIterator() {
        return new Iterator();
    }

    private class Iterator implements StringsIterator{
        private int i = 0;
        private final int length = tablicaLancuchow.length;
        @Override
        public boolean hasNext() {
            return i != length;
        }
        @Override
        public String next() {
            return tablicaLancuchow[i++];
        }
    }

}

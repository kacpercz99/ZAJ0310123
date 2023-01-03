public class Teksty{
    public final String[] tablicaLancuchow;

    public Teksty(String[] tablicaLancuchow) {
        this.tablicaLancuchow = tablicaLancuchow;
    }

    StringsIterator getIterator() {
        return new Iterator();
    }

    public class Iterator implements StringsIterator{
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

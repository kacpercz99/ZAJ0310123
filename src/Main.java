public class Main {
    public static void main(String[] args) {
        Teksty teksty = new Teksty(new String[]{"abc", "dca", "abab"});
        StringsIterator iterator = teksty.getIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
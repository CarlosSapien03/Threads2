public class X {
    public static int totalCount2;
    public static double t2;
    public X(int totalcount){
        this.totalCount2 = totalcount;
    }
    public static void main(String[] args) {
        for (String s : args) {
            Thread txt = new Thread(new threads2(s));
            txt.start();
        }
    }
}
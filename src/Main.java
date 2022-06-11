public class Main {
    public static void main(String[] args) {
        IndexWeightBody service = new IndexWeightBody();
        double g = 0.17;
        double w = 120;
        double imt = service.inwb (g,w);
        System.out.println(imt);
    }
}
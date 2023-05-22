public class Main {
    public static void main(String[] args) {
        double[][] mr = {{1.0, 3.0, 5.0}, {2.0, 4.0, 6.0}};
        Matrix m = new Matrix(mr);

        double[][] identity = {{1, 0}, {0, 1}};
        Matrix I = new Matrix(identity);

        double[] vr = {1, 2, 3};
        Vector v = new Vector(vr);

        double[] v2s = {1, 2};
        Vector v2 = new Vector(v2s);

        m.printRows();
        v.printVec();

        v.add(v).scale(2).printVec();

        System.out.println(v.dot(v));

        m.add(m).printRows();

        m.transpose().printRows();

        I.transform(v2).printVec();

        I.mul(I).printRows();
    }
}
public class Vector {
    private double[] v;

    public Vector(double[] vals) {
        this.v = vals;
    }

    public double[] components() {
        return this.v;
    }

    public void printVec() {
//        System.out.println();
        System.out.print("[ ");
        for(int i = 0; i < this.v.length; i++) {System.out.print(this.v[i]); System.out.print(" ");}
        System.out.println("]");
    }

    public Vector add(Vector v2) {
        double[] vs = new double[v2.components().length];

        for(int i = 0; i < this.v.length; i++) vs[i] = this.v[i] + v2.components()[i];

        return new Vector(vs);
    }

    public Vector scale(double s) {
        double[] vs = new double[this.v.length];

        for(int i = 0; i < this.v.length; i++) vs[i] = (this.v[i] * s);

        return new Vector(vs);
    }

    public double dot(Vector v2) {
        double sum = 0;

        for(int i = 0; i < this.v.length; i++) sum += (this.v[i] * v2.components()[i]);

        return sum;
    }

}

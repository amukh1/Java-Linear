import java.util.ArrayList;

public class Matrix {
    private double[][] rows;
    private double[][] columns;
    public Matrix(double[][] arrRow) {
        this.rows = arrRow;
        setCol();
    }

    public double[][] getRows() {
        return this.rows;
    }

    public double[][] getCols() {
        return this.columns;
    }

    public void printRows() {
        System.out.print("[ ");
        for(int i = 0; i < this.rows.length; i++) {
            for(int j = 0; j < this.rows[0].length; j++) {
                System.out.print(this.rows[i][j]);
                System.out.print(" ");
            }
            if(i != this.rows.length - 1)
            System.out.println("");
            else System.out.print("");
        }
        System.out.println("]");
    }

    public Matrix add(Matrix m2) {
        double[][] rs = new double[this.rows.length][this.rows[0].length];

        for(int i = 0; i < this.rows.length; i++) {
            rs[i] = new Vector(this.rows[i]).add(new Vector(m2.getRows()[i])).components();
        }

        return new Matrix(rs);
    }

    public Matrix transpose() {
        return new Matrix(this.columns);
    }

    public Vector transform(Vector v) {
        double[] zs = new double[v.components().length];
        for(int i = 0; i < v.components().length; i++) zs[i] = 0;
        Vector v2 = new Vector(zs);

        for(int i = 0; i < v.components().length; i++) {
            v2 = v2.add(new Vector(this.columns[i]).scale(v.components()[i]));
        }

        return v2;
    }

    public Matrix mul(Matrix m2) {
        double[][] m3s = new double[this.rows.length][m2.getRows().length];

        for(int i = 0; i < this.rows.length; i++) m3s[i] = new double[m2.getRows().length];

        for(int i = 0; i < this.rows.length; i++) {
            for(int j = 0; j < m2.getRows().length; j++) {
                m3s[i][j] = new Vector(this.rows[i]).dot(new Vector(m2.getCols()[j]));
            }
        }
        return new Matrix(m3s);
    }

    private void setCol() {
        double[][] cols = new double[this.rows[0].length][this.rows.length];

        for(int i = 0; i < this.rows[0].length; i++) {
            cols[i] = (new double[this.rows.length]);
        }

        for(int i = 0; i < this.rows.length; i++) {
            for(int j = 0; j < this.rows[i].length; j++) {
                cols[j][i] = this.rows[i][j];
            }
        }
        this.columns = cols;
    }
}

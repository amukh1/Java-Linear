
# Java-Linear - Amukh1

This is a Java library for computational Linear Algebra. It is a work in progress.

<!-- Checklist with all the features -->

## Features
- [x] Vectors
- [x] Matrices
- [x] Vector operations
- [x] Matrix operations
- [x] Matrix-Vector operations
- [x] Matrix output
- [x] Vector output
- [ ] Spaces (Soon!)
- [ ] Space operations (Soon!)
- [ ] Subspaces (Soon!)

## Usage

# Defining Matrices and Vectors

## Matrices
Constant elements:
```java
// 2 x 2 Matrix by rows:
double[][] rows = {{1, 2} {3, 4}};
new Matrix(rows);
```

Non-constant elements:
```java
// n x m Matrix by rows:
double[][] rows = new double[n][m];
for(int i = 0; i < n; i++) {
    // fill n arrays with m elements
}
new Matrix(rows);
```

## Vectors
Constant components/elements:
```java
// Vector in R^2:
double[] elements = {1, 2};
new Vector(elements);
```

Non-constant components/elements:
```java
// Vector in R^n:
double[] elements = new double[n];
for(int i = 0; i < n; i++) /* generate n elements */;
new Vector(elements);
```

# Vector operations:
## Addition:
```java
// Add v and w:
Vector v = new Vector(vE);
Vector w = new Vector(wE);

v.add(w);
w.add(v);
```

## Scalar multiplication:
```java
// Scale v by a factor of x:
Vector v = new Vector(vE);

v.scale((double) x);
```

## Subtraction:
```java
// Substract w from v:
Vector v = new Vector(vE);
Vector w = new Vector(wE);

v.add(w.scale(-1));
```

## Dot Product:
```java
// Dot Product between v and w:
Vector v = new Vector(vE);
Vector w = new Vector(wE);

v.dot(w);
w.dot(v);
```

## Cross Product (Soon!):
```java
// Cross Product between v and w:
Vector v = new Vector(vE);
Vector w = new Vector(wE);

v.cross(w);
w.cross(v);
```

# Matrix operations

## Addition:
```java
// Matrix A + B:
Matrix A = new Matrix(AE);
Matrix B = new Matrix(BE);

A.add(B);
B.add(A);
```

## Scalar multiplication (Soon!):
```java
// Matrix xA:
Matrix A = new Matrix(AE);

A.scale((double) x);
```

## Multiplication:
```java
// Matrix A x B:
Matrix A = new Matrix(AE);
Matrix B = new Matrix(BE);

A.mul(B);
B.mul(A);
```

## Transposition:
```java
// Matrix A^T:
Matrix A = new Matrix(AE);

A.transpose();
```

# Matrix-Vector operations:
## Linear Maps/Matrix transformations
```java
Matrix A = new Matrix(AE);
Vector x = new Vector(xE);

A.transform(x);
```

# Matrix output:

```java
Matrix A = new Matrix(AE);

A.printRows();
```

# Vector output:

```java
Vector x = new Vector(xE);

x.printVec();
```

# Final Example:
```java
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
```

```
[ 1.0 3.0 5.0 
2.0 4.0 6.0 ]

[ 1.0 2.0 3.0 ]

[ 4.0 8.0 12.0 ]

14.0

[ 2.0 6.0 10.0 
4.0 8.0 12.0 ]

[ 1.0 2.0 
3.0 4.0 
5.0 6.0 ]

[ 1.0 2.0 ]

[ 1.0 0.0 
0.0 1.0 ]
```
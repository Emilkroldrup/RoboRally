package excercise1;

public interface IComplex {

    double getRe();
    double getIm();

    String toString();

    double abs();

    double phase();

    IComplex plus(IComplex b);

    public IComplex minus(IComplex b);

    IComplex times(IComplex b);

    public IComplex scale(double alpha);

    public IComplex conjugate();

    public IComplex reciprocal();

    public IComplex divides(IComplex b);

    public IComplex exp();

    public IComplex sin();

    public IComplex cos();

    public IComplex tan();


}

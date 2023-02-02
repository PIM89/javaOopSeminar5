package Model;

public class DifModel extends Model implements ModelInterfaceRes {
    @Override
    public double result(double x, double y) {
        return x - y;
    }
}
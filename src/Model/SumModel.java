package Model;

public class SumModel extends Model implements ModelInterfaceRes{
    @Override
    public double result(double x, double y) {
        return x + y;
    }
}

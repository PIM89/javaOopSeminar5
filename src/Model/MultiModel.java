package Model;

public class MultiModel extends Model implements ModelInterfaceRes{
    @Override
    public double result(double x, double y) {
        return x * y;
    }
}

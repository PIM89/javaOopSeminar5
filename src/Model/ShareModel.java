package Model;

public class ShareModel extends Model implements ModelInterfaceRes{
    @Override
    public double result(double x, double y) {
        return x / y;
    }
}

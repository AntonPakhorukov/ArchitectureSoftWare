package LIP_03;
/**
 * Джип имеет размеры кузова, длина и ширина
 */
public class Jeep extends ParkingArea{
    int width, length;
    public Jeep(int width, int length) {
        this.width = width;
        this.length = length;
    }
    @Override
    public int parkingArea() {
        return width * length;
    }
}

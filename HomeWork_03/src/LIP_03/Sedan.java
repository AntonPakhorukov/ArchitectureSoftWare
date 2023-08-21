package LIP_03;

/**
 * Седан имеет размеры кузова, длина и ширина
 */
public class Sedan extends ParkingArea{
    int width, length;

    public Sedan(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public int parkingArea() {
        return width * length;
    }
}

package ModelElements;

import Stuff.Point3D;

import java.util.ArrayList;
import java.util.List;

public class Poligon {
    /**
     * Мощность отношений 1 ко многим, значит должна быть как минимум одна точка,
     * следовательно, делаем конструктор который принимает точку, и это будет список,
     * так как точек много.
     * Создаем список, за тем создаем конструктор
     */
    public List<Point3D> Points = new ArrayList<>();

    public Poligon(List<Point3D> points) {
        this.Points = points;
    }
    /**
     * public Poligon(Point3D point) {
     *         points.add(point);
     *     }
     */
}

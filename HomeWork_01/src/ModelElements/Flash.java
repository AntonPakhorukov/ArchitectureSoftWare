package ModelElements;

import Stuff.Angle3D;
import Stuff.Point3D;

/**
 * Класс источника света
 */
public class Flash {
    public Point3D Location;
    public Angle3D Angle;
    public java.awt.Color Color;
    public float Power;

    /**
     * Поворот источника света
     * @param angelAction
     */
    public void Rotate(Angle3D angelAction) {
    }

    /**
     * Перемещение к точке
     * @param pointAction
     */
    public void Move(Point3D pointAction) {
    }
}

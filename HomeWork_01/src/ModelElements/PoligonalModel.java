package ModelElements;

import Stuff.Point3D;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List<Poligon> Poligons; // так как poligonS => List
    public List<Texture> Textures; // так как textureS => List

    /**
     * Чтобы показать отношения Texture и Poligon, создается конструктор
     * @param textures
     */
    public PoligonalModel(List<Texture> textures) {
        this.Textures = textures; // не закрашенный ромбик = агрегация
        // => принимаем в качестве аргумента в конструктор, может существовать обособленно
        Poligons = new ArrayList<>(); // закрашенный ромбик = композиция
        // => создаем внутри конструктора, не может существовать обособленно
    }
}

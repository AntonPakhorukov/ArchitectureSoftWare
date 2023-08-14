package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List<Poligon> Poligons; // так как poligonS => List
    public List<Texture> Textures; // так как textureS => List

    public PoligonalModel(List<Texture> textures) {
        this.Textures = textures; // не закрашенный ромбик = агрегация = принимаем в качестве аргумента в конструктор
        Poligons = new ArrayList<>(); // закрашенный ромбик = композиция = создаем внутри конструктора
    }
}

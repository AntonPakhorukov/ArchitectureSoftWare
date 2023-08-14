package ModelElements;

import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    public Scene(int id, List<PoligonalModel> models,
                 List<Flash> flashes,
                 List<Camera> cameras) throws Exception {
        this.id = id;
        if(models.size() > 0){
            Models = models;
        } else {
            throw new Exception("Без камеры нельзя");
        }
        Flashes = flashes;
        if (cameras.size() > 0) {
            Cameras = cameras;
        } else {
            throw new Exception("Без камеры нельзя");
        }
    }
    public <T> T method1(T flash){
        return flash;
    }
    public <T, E> T method2 (T flash, E camera) {
        return flash;
    }
    /*
     * public Type T method2 (Type t) {
     *     return t;
     * }
     * public Type T method2 (Type t1, Type t2) {
     *     return t;
     * }
     */
}

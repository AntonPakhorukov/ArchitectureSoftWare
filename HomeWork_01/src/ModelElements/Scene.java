package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> Models;
//    public List<PoligonalModel> models = new ArrayList<>();
    public List<Flash> Flashes;
//    public List<Flash> flashes = new ArrayList<>();
    public List<Camera> Cameras;
//    public List<Camera> cameras = new ArrayList<>();

    /**
     * Конструктор, вспышки может не быть??
     * Обязательно их инициализируем, чтобы они были не пустые
     * => зачем создавать объект с пустыми списками??
     * @param id
     * @param models
     * @param flashes
     * @param cameras
     * @throws Exception
     */
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
     *     return t1;
     * }
     * ИЛИ
     * public Type1 method1(Type1 t) {
     *     return t;
     * }
     * public Type1 method2(Type1 t1, Type2 t2) {
     *     return t1;
     * }
     */
}

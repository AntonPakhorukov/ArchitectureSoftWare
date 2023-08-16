package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger{
    /**
     * Так как видим отношение 1 ко множеству, то сразу создаем все листы
     */
    public List<PoligonalModel> Models;
//    public List<PoligonalModel> Models = new ArrayList<PoligonalModel>();
    public List<Scene> Scenes;
//    public List<Scene> Scenes = new ArrayList<Scene>();
    public List<Flash> Flashes;
//    public List<Flash> Flashes = new ArrayList<Flash>();
    public List<Camera> Cameras;
//    public List<Camera> Cameras = new ArrayList<Camera>();
    /**
     * Так как связь с интерфейсом указана "ассоциация", то мы здесь создаем
     * его экземпляр, и имплементировать его не нужно
     */
    private List<IModelChangeObserver> changeObserves;
//    public List<IModelChangeObserver> changeObservers = new ArrayList<IModelChangeObserver>();
    public Scene GetScena(int scena){
        for (int i = 0; i < Scenes.size(); i++) {
            if (Scenes.get(i).id == scena) {
                return Scenes.get(i);
            }
        }
        return null;
    }

    /**
     * Так как связь с интерфейсом указана "зависимость", то интерфейс
     * мы имплементируем и переопределяем метод, так как при такой связи
     * существует некоторая связь класса и интерфейса, при которой изменение
     * одного класса, требует изменение другого класса
     * @param iModelChanger принимает на вход метод смены модели
     */
    @Override
    public void NotifyChange (IModelChanger iModelChanger){
    }

    public ModelStore(List<IModelChangeObserver> changeObserves) throws Exception {
        this.changeObserves = changeObserves;
        this.Models = new ArrayList<>();
        this.Scenes = new ArrayList<>();
        this.Flashes = new ArrayList<>();
        this.Cameras = new ArrayList<>();
        Models.add(new PoligonalModel(null)); // Или передавать Texture texture вместо листа?
        Flashes.add(new Flash());
        Cameras.add(new Camera());
        Scenes.add(new Scene(0, Models, Flashes, Cameras));
    }
}

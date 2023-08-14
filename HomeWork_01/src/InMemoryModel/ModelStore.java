package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore {
    public List<PoligonalModel> Models;
    public List<Scene> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    private List<IModelChangeObserver> changeObserves;
    public Scene GetScena(int scena){
        for (int i = 0; i < Scenes.size(); i++) {
            if (Scenes.get(i).id == scena) {
                return Scenes.get(i);
            }
        }
        return null;
    }
    public void NotifyChange (IModelChanger iModelChanger){
    }

    public ModelStore(List<IModelChangeObserver> changeObserves) throws Exception {
        this.changeObserves = changeObserves;
        this.Models = new ArrayList<>();
        this.Scenes = new ArrayList<>();
        this.Flashes = new ArrayList<>();
        this.Cameras = new ArrayList<>();
        Models.add(new PoligonalModel(null));
        Flashes.add(new Flash());
        Cameras.add(new Camera());
        Scenes.add(new Scene(0, Models, Flashes, Cameras));
    }
}

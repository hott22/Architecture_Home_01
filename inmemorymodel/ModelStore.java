package inmemorymodel;

import modelelements.*;

import java.util.ArrayList;
import java.util.Collection;

public class ModelStore implements ModelChanger {

    private Collection<PoligonalModel> models = new ArrayList<>();
    private Collection<Scene> scenes = new ArrayList<>();
    private Collection<Flash> flashes = new ArrayList<>();
    private Collection<Camera> cameras = new ArrayList<>();
    private Collection<ModelChangedObserver> changeObservers = new ArrayList<>();


    @Override
    public void RegisterModelChanger(ModelChangedObserver o) {
        changeObservers.add(o);
    }

    @Override
    public void RemoveModelChanger(ModelChangedObserver o) {
        changeObservers.remove(o);
    }

    @Override
    public void NotifyChange() {
            for (ModelChangedObserver o : changeObservers){
                o.ApplyUpdateModel();
            }
    }


    public Scene getScena (int id){
        return new Scene(id);
    }
}

package Service;

//import Model.MODEL; atentie la asta
import Repo.ModelRepo;

import java.util.List;

public class ModelService {
    private final ModelRepo modelRepo;

    public ModelService(ModelRepo modelRepo) {
        this.modelRepo = modelRepo;
    }
    public void add(Model model){
        modelRepo.add(model);
    }
    public void deleteByName(String name){
        modelRepo.deleteByName(name);
    }
    public Model findByName(String name){
        List<Model> models = modelRepo.readAll();
        return models.stream()
                .filter(x -> x.getName().equals(name))
                .findFirst().orElse(null);

    }
    public List<Model> findAll(){
        return modelRepo.readAll();
    }
    public void update(String name, Model model){
        modelRepo.updateByName(name, model);
    }
}

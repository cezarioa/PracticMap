package Controller;

//import Model.MODEL; atentie la asta
import Service.ModelService;

public class ModelController {
    private final ModelService modelService;

    public ModelController(ModelService modelService) {
        this.modelService = modelService;
    }

    public void add(Model model){
        modelService.add(model);

    }
    public void delete(String name){
        modelService.deleteByName(name);
    }
    public void showByName(String name){
        System.out.println(modelService.findByName(name));
    }
    public void showAll(){
        System.out.println(modelService.findAll());
    }
    public void update(String name, Model model){
        modelService.update(name, model);
    }

}

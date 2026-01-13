package Controller;

//import Tribut.Tribut; atentie la asta
import Model.Tribut;
import Service.TributService;

public class TributController {
    private final TributService TributService;

    public TributController(TributService TributService) {
        this.TributService = TributService;
    }

    public void add(Tribut Tribut){
        TributService.add(Tribut);

    }
    public void delete(String name){
        TributService.deleteByName(name);
    }
    public void showByName(String name){
        System.out.println(TributService.findByName(name));
    }
    public void showAll(){
        System.out.println(TributService.findAll());
    }
    public void update(String name, Tribut Tribut){
        TributService.update(name, Tribut);
    }
    public void showCount(){
        System.out.println(TributService.countAll());
    }

}

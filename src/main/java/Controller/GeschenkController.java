package Controller;

//import Geschenk.Geschenk; atentie la asta
import Model.Geschenk;
import Service.GeschenkService;

public class GeschenkController {
    private final GeschenkService GeschenkService;

    public GeschenkController(GeschenkService GeschenkService) {
        this.GeschenkService = GeschenkService;
    }

    public void add(Geschenk Geschenk){
        GeschenkService.add(Geschenk);

    }

    public void showAll(){
        System.out.println(GeschenkService.findAll());
    }

    public void showCount(){
        System.out.println(GeschenkService.countAll());
    }

}

package Controller;

//import Ereignis.Ereignis; atentie la asta
import Model.Ereignis;
import Service.EreignisService;

public class EreignisController {
    private final EreignisService EreignisService;

    public EreignisController(EreignisService EreignisService) {
        this.EreignisService = EreignisService;
    }

    public void add(Ereignis Ereignis){
        EreignisService.add(Ereignis);

    }


    public void showAll(){
        System.out.println(EreignisService.findAll());
    }

    public void showCount(){
        System.out.println(EreignisService.countAll());
    }

}

package Controller;

import Service.EreignisService;
import Service.GeschenkService;
import Service.TributService;

public class MixController {
    private final TributService TributService;
    private final EreignisService EreignisService;
    private final GeschenkService GeschenkService;

    public MixController(TributService tributService, EreignisService ereignisService, GeschenkService geschenkService) {
        TributService = tributService;
        EreignisService = ereignisService;
        GeschenkService = geschenkService;
    }

    public void showTributAndCountAll(){
        System.out.println("Tributs: ");
        System.out.println(TributService.countAll());
        System.out.println("Geschenke: ");
        System.out.println(GeschenkService.countAll());
        System.out.println("Ereignisse: ");
        System.out.println(EreignisService.countAll());


    }
}

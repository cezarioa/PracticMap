import Controller.EreignisController;
import Controller.GeschenkController;
import Controller.MixController;
import Controller.TributController;
import Model.Ereignis;
import Repo.EreignisRepo;
import Repo.GeschenkRepo;
import Repo.TributRepo;
import Service.EreignisService;
import Service.GeschenkService;
import Service.TributService;
import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

//replace Class with your actual class name
//replace Ereignis cu classa actuala

public class Main {
    static String filename="";
    static List<Class> readAll(String filename) {
        ObjectMapper mapper = new ObjectMapper();
        List<Class> classs;

        classs = new ArrayList<>(Arrays.asList(mapper.readValue(new File(filename), Class[].class)));
        return classs;

    }


    public static void main(String[] args) {
        String filename1 = "src/main/resources/events.json";
        String filename2 = "src/main/resources/gifts.json";
        String filename3 = "src/main/resources/tributes.json";

        Ereignis Ereignis1 = new Ereignis();
        Ereignis Ereignis2 = new Ereignis();
        Ereignis Ereignis3 = new Ereignis();
        Ereignis Ereignis4 = new Ereignis();

        EreignisRepo EreignisRepo = new EreignisRepo(filename1);
        TributRepo TributRepo = new TributRepo(filename2);
        GeschenkRepo GeschenkRepo = new GeschenkRepo(filename3);

        EreignisService EreignisService = new EreignisService(EreignisRepo);
        TributService TributService = new TributService(TributRepo);
        GeschenkService GeschenkService = new GeschenkService(GeschenkRepo);

        EreignisController EreignisController = new EreignisController(EreignisService);
        TributController TributController = new TributController(TributService);
        GeschenkController GeschenkController = new GeschenkController(GeschenkService);

        MixController mixController=new MixController(TributService, EreignisService, GeschenkService);
        mixController.showTributAndCountAll();


        EreignisController.showAll();


        



    }
}

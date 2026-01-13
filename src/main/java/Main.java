import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

//replace Class with your actual class name
//replace Model cu classa actuala

public class Main {
    static String filename="";
    static List<Class> readAll(String filename) {
        ObjectMapper mapper = new ObjectMapper();
        List<Class> classs;

        classs = new ArrayList<>(Arrays.asList(mapper.readValue(new File(filename), Class[].class)));
        return classs;

    }

    public static void main(String[] args) {
        String filename1 = "";
        
        Model model1 = new Model();
        Model model2 = new Model();
        Model model3 = new Model();
        Model model3 = new Model();

        ModelRepo modelRepo = new ModelRepo(filename1);
        ModelService modelService = new ModelService(modelRepo);
        ModelController modelController = new ModelController(modelService);

        modelController.add(model1);
        modelController.add(model2);
        modelController.add(model3);
        modelController.delete("Max Mustermann");
        modelController.update("cristi", model4);
        modelController.showAll();

        String filename2 = "";
        



    }
}

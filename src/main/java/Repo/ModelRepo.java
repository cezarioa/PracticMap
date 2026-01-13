package Repo;

import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModelRepo {
    String filename;
    ObjectMapper mapper = new ObjectMapper();
    
    public ModelRepo(String filename) {
        this.filename = filename;
    }

    public List<Model> readAll(){
        List<Model> model;

        model = new ArrayList<>(             // Mutable list for medications
                Arrays.asList(                         // Wrap array as List
                        mapper.readValue(                  // Deserialize JSON file
                                new File(filename),            // Source file
                                Model[].class             // Array of Medikament objects
                        )
                )
        );
        return model;
    }

    private void persist(List<Model> model){
        mapper.writerWithDefaultPrettyPrinter() // Create a writer with pretty printing
                .writeValue(                     // Write to file
                        new File(filename),          // Target file
                        model                  // List of medications to serialize
                );
    }
    public void add(Model model){
        List<Model> models = readAll();
        models.add(model);
        persist(models);
    }
    public void deleteByName(String name){
        List<Model> models = readAll();
        models.removeIf(x -> x.getName().equals(name));
        persist(models);
    }
    public void updateByName(String name, Model model){
        List<Model> models = readAll();
        models.removeIf(x -> x.getName().equals(name));
        models.add(model);
        persist(models);
    }
}

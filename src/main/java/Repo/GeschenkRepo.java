package Repo;

import Model.Geschenk;
import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeschenkRepo {
    String filename;
    ObjectMapper mapper = new ObjectMapper();

    public GeschenkRepo(String filename) {
        this.filename = filename;
    }

    public List<Geschenk> readAll(){
        List<Geschenk> Geschenk;

        Geschenk = new ArrayList<>(             // Mutable list for medications
                Arrays.asList(                         // Wrap array as List
                        mapper.readValue(                  // Deserialize JSON file
                                new File(filename),            // Source file
                                Geschenk[].class             // Array of Medikament objects
                        )
                )
        );
        return Geschenk;
    }
    public int countAll(){
        return readAll().size();
    }

    private void persist(List<Geschenk> Geschenk){
        mapper.writerWithDefaultPrettyPrinter() // Create a writer with pretty printing
                .writeValue(                     // Write to file
                        new File(filename),          // Target file
                        Geschenk                  // List of medications to serialize
                );
    }
    public void add(Geschenk Geschenk){
        List<Geschenk> Geschenks = readAll();
        Geschenks.add(Geschenk);
        persist(Geschenks);
    }

}

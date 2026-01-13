package Repo;

import Model.Tribut;
import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TributRepo {
    String filename;
    ObjectMapper mapper = new ObjectMapper();

    public TributRepo(String filename) {
        this.filename = filename;
    }

    public List<Tribut> readAll(){
        List<Tribut> Tribut;

        Tribut = new ArrayList<>(             // Mutable list for medications
                Arrays.asList(                         // Wrap array as List
                        mapper.readValue(                  // Deserialize JSON file
                                new File(filename),            // Source file
                                Tribut[].class             // Array of Medikament objects
                        )
                )
        );
        return Tribut;
    }
    public int countAll(){
        return readAll().size();
    }

    private void persist(List<Tribut> Tribut){
        mapper.writerWithDefaultPrettyPrinter() // Create a writer with pretty printing
                .writeValue(                     // Write to file
                        new File(filename),          // Target file
                        Tribut                  // List of medications to serialize
                );
    }
    public void add(Tribut Tribut){
        List<Tribut> Tributs = readAll();
        Tributs.add(Tribut);
        persist(Tributs);
    }
    public void deleteByName(String name){
        List<Tribut> Tributs = readAll();
        Tributs.removeIf(x -> x.getName().equals(name));
        persist(Tributs);
    }
    public void updateByName(String name, Tribut Tribut){
        List<Tribut> Tributs = readAll();
        Tributs.removeIf(x -> x.getName().equals(name));
        Tributs.add(Tribut);
        persist(Tributs);
    }
}

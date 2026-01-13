package Repo;

import Model.Ereignis;
import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EreignisRepo {
    String filename;
    ObjectMapper mapper = new ObjectMapper();

    public EreignisRepo(String filename) {
        this.filename = filename;
    }

    public List<Ereignis> readAll(){
        List<Ereignis> Ereignis;

        Ereignis = new ArrayList<>(             // Mutable list for medications
                Arrays.asList(                         // Wrap array as List
                        mapper.readValue(                  // Deserialize JSON file
                                new File(filename),            // Source file
                                Ereignis[].class             // Array of Medikament objects
                        )
                )
        );
        return Ereignis;
    }
    public int countEreignis(){
        List<Ereignis> Ereignis = readAll();
        return Ereignis.size();
    }

    private void persist(List<Ereignis> Ereignis){
        mapper.writerWithDefaultPrettyPrinter() // Create a writer with pretty printing
                .writeValue(                     // Write to file
                        new File(filename),          // Target file
                        Ereignis                  // List of medications to serialize
                );
    }
    public void add(Ereignis Ereignis){
        List<Ereignis> Ereigniss = readAll();
        Ereigniss.add(Ereignis);
        persist(Ereigniss);
    }


    public int countAll() {
        List<Ereignis> Ereigniss = readAll();
        return Ereigniss.size();
    }
}

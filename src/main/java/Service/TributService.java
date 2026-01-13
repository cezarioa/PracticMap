package Service;

//import Tribut.Tribut; atentie la asta
import Model.Tribut;
import Repo.TributRepo;

import java.util.List;

public class TributService {
    private final TributRepo TributRepo;

    public TributService(TributRepo TributRepo) {
        this.TributRepo = TributRepo;
    }
    public void add(Tribut Tribut){
        TributRepo.add(Tribut);
    }
    public void deleteByName(String name){
        TributRepo.deleteByName(name);
    }
    public Tribut findByName(String name){
        List<Tribut> Tributs = TributRepo.readAll();
        return Tributs.stream()
                .filter(x -> x.getName().equals(name))
                .findFirst().orElse(null);

    }
    public List<Tribut> findAll(){
        return TributRepo.readAll();
    }
    public void update(String name, Tribut Tribut){
        TributRepo.updateByName(name, Tribut);
    }
    public int countAll(){
        return TributRepo.countAll();
    }

}

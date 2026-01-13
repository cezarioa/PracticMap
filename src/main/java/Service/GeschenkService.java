package Service;

//import Geschenk.Geschenk; atentie la asta
import Model.Geschenk;
import Repo.GeschenkRepo;

import java.util.List;

public class GeschenkService {
    private final GeschenkRepo GeschenkRepo;

    public GeschenkService(GeschenkRepo GeschenkRepo) {
        this.GeschenkRepo = GeschenkRepo;
    }
    public void add(Geschenk Geschenk){
        GeschenkRepo.add(Geschenk);
    }


    public List<Geschenk> findAll(){
        return GeschenkRepo.readAll();
    }

    public int countAll(){
        return GeschenkRepo.countAll();
    }
}

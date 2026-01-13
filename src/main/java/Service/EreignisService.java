package Service;

//import Ereignis.Ereignis; atentie la asta
import Model.Ereignis;
import Repo.EreignisRepo;

import java.util.List;

public class EreignisService {
    private final EreignisRepo EreignisRepo;

    public EreignisService(EreignisRepo EreignisRepo) {
        this.EreignisRepo = EreignisRepo;
    }
    public void add(Ereignis Ereignis){
        EreignisRepo.add(Ereignis);
    }

    public List<Ereignis> findAll(){
        return EreignisRepo.readAll();
    }

    public int countAll(){
        return EreignisRepo.countAll();
    }
}

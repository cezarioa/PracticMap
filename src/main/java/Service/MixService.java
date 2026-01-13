package Service;

import Repo.EreignisRepo;
import Repo.GeschenkRepo;
import Repo.TributRepo;

public class MixService {
    private final TributRepo TributRepo;
    private final EreignisRepo EreignisRepo;
    private final GeschenkRepo GeschenkRepo;

    public MixService(TributRepo tributRepo, EreignisRepo ereignisRepo, GeschenkRepo geschenkRepo) {
        TributRepo = tributRepo;
        EreignisRepo = ereignisRepo;
        GeschenkRepo = geschenkRepo;
    }



}

package cz.czechitas.java2webapps.ukol6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitatyService {
    private final CitatyRepository citatyRepositoryservice;
    private final NahodneCisloService nahodneCisloService;

    @Autowired
    public CitatyService(CitatyRepository citatyRepositoryservice, NahodneCisloService nahodneCisloService) {
        this.citatyRepositoryservice = citatyRepositoryservice;
        this.nahodneCisloService = nahodneCisloService;
    }


    public String nahodnyCitat() {
        int nahodneCislo = nahodneCisloService.dejNahodneCislo(citatyRepositoryservice.pocet());
        return citatyRepositoryservice.citat(nahodneCislo);
    }

    public String nahodnyCitatCZ() {
        int nahodneCislo = nahodneCisloService.dejNahodneCislo(citatyRepositoryservice.pocet());
        return citatyRepositoryservice.citatCZ(nahodneCislo);
    }

    public String nahodnyCitatEN() {
        int nahodneCislo = nahodneCisloService.dejNahodneCislo(citatyRepositoryservice.pocet());
        return citatyRepositoryservice.citatEN(nahodneCislo);
    }

    public String konkretniCitat(int cislo) {
        if (citatyRepositoryservice.pocet() < cislo) {
            return nahodnyCitat();
        } else {
            return citatyRepositoryservice.citat(cislo);
        }
    }


}

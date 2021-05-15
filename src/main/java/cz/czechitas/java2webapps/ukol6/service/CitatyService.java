package cz.czechitas.java2webapps.ukol6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitatyService {

    private final CitatyRepository serviceRep;

    private final NahodneCisloService serviceNah;



    @Autowired
    public CitatyService(CitatyRepository serviceRep, NahodneCisloService serviceNah) {
        this.serviceRep = serviceRep;
        this.serviceNah = serviceNah;
    }




    public String nahodnyCitat() {


        return serviceRep.citat(serviceNah.dejNahodneCislo(serviceRep.pocet()));

    }    public String nahodnyCitatCZ() {


        return serviceRep.citatCZ(serviceNah.dejNahodneCislo(serviceRep.pocetCZ()));

    }    public String nahodnyCitatEN() {


        return serviceRep.citatEN(serviceNah.dejNahodneCislo(serviceRep.pocetEN()));

    }

    public String konkretniCitat(int cislo) {
        if (serviceRep.pocet()<cislo) {
            return nahodnyCitat();
        }
        else {
            return serviceRep.citat(cislo);
        }
    }


}

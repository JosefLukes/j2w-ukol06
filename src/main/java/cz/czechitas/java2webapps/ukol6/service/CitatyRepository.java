package cz.czechitas.java2webapps.ukol6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CitatyRepository {
    public final List<String> seznamCitatu = new ArrayList<String>();
    public final List<String> seznamCitatuEN;
    public final List<String> seznamCitatuCZ;

    public CitatyRepository() {
        this.seznamCitatuEN = List.of(
                "Debugging /de·bugh·ing/ (verb): The Classic Mystery Game where you are the detective, the victim, and the murderer.",
                "A user interface is like a joke. If you have to explain it, it's not that good.",
                "To replace programmers with robots, clients will have to accurately describe what they want. We're safe.",
                "I have a joke on programming but it only works on my computer.",
                "99 little bugs in the code, 99 bugs in the code. Take one down, patch it around. 127 little bugs in the code…",
                "When I wrote this code, only God & I understood what it did. Now… Only God knows.",
                "Programmer (noun.): A machine that turns coffee into code.",
                "Real programmers count from 0.");

        this.seznamCitatuCZ = List.of("I špatný běh je lepší než žádný.",
                "Nehledám čas na běhání. Vytvářím si ho.",
                "Hlas, který ti v duchu šeptá, že to nedokážeš, lže.",
                "Poznej své limity – a pak je pokoř.",
                "Síla nepramení z toho, co dokážeš. Vychází z překonávání toho, o čem jsi býval přesvědčený, že nemůžeš zvládnout.",
                "Každý úspěch začíná odhodláním to zkusit.",
                "Nezáleží na tom, jak pomalu běžíš – dokud dokážeš nezastavit.",
                "Nejprve od sebe musíte velké věci očekávat, teprve pak jich můžete dosáhnout.",
                "Když se vzdáváš, mysli na to, proč jsi začal.",
                "Energie a vytrvalost překoná všechno.",
                "Nemusíš být skvělý, abys začal, ale musíš začít, abys mohl být skvělý.",
                "Nemůžeš? Přidej!",
                "Můžu, protože si myslím, že můžu.",
                "Věř v sebe samotného-Nehleďte na pravidla-Ignorujte pochybovače-Nebojte se selhat-Dejte do toho všechno-Dávejte nazpět");
        this.seznamCitatu.addAll(seznamCitatuCZ);
        this.seznamCitatu.addAll(seznamCitatuEN);
    }

    public int pocet() {

        return seznamCitatu.size();
    }

    public String citat(int poradi) {

        return seznamCitatu.get(poradi);
    }

    public int pocetCZ() {

        return seznamCitatuCZ.size();
    }

    public String citatCZ(int poradi) {

        return seznamCitatuCZ.get(poradi);
    }

    public int pocetEN() {

        return seznamCitatuEN.size();
    }

    public String citatEN(int poradi) {

        return seznamCitatuEN.get(poradi);
    }

}

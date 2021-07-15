package fonetizacao;

import java.util.HashMap;

public class Dicionario {

    private HashMap<String, String> words = new HashMap<>();

    private static Dicionario instance;

    public Dicionario() {
        words.put("S", "X");
        words.put("SS", "X");
        words.put("CH", "X");
        words.put("SC", "X");
        words.put("Z", "X");
        words.put("Ç", "X");
        words.put("RR", "R");
        words.put("H", "R");
    }

    public static Dicionario getInstance() {
        if (instance == null) {
            instance = new Dicionario();
        }
        return Dicionario.instance;
    }

    public String substituir(String value) {
        final String[] res = {value};
        words.forEach((k, v) -> {
            if (value.contains(k)) {
                res[0] = res[0].replaceAll(k, v);
            }
        });
        return res[0];
    }
}

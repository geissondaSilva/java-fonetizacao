package fonetizacao;

import java.util.Locale;

public class Fonetizacao {

    private static Fonetizacao instance;

    private final Dicionario dicionario = Dicionario.getInstance();

    public static Fonetizacao getInstance() {
        if (instance == null) {
            instance = new Fonetizacao();
        }
        return instance;
    }

    public String fonetizar(String value) {
        String retorno = value.toUpperCase(Locale.ROOT);
        retorno = dicionario.substituir(retorno);
        return retorno;
    }
}

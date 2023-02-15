import java.util.Locale;

public class IdiomaSistema {
    public static void main(String[] args) {
        Locale sistema = Locale.getDefault();
        System.out.println("O idioma do sistema é " + sistema.getDisplayLanguage());
    }
}
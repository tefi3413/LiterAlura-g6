package Modelo;

public enum Idiomas {
    ES("es"),
    FR("fr"),
    EN("en"),
    PT("pt");

    private String idioma;

    Idiomas(String idioma) {
        this.idioma = idioma;
    }

    public String getIdioma(){
        return this.idioma;
    }

    public static Idiomas fromString(String text) {
        for (Idiomas idioma : Idiomas.values()) {
            if (idioma.idioma.equalsIgnoreCase(text)) {
                return idioma;
            }
        }
        throw new IllegalArgumentException("No constant with text " + text + " found");
    }
}
package primeraevaluacion.tema04.ejemplos;

public class EjemplosString {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str); // null
        str = ""; // esto es una cadena vacía
        System.out.println(str);
        str = "hola";
        System.out.println(str); // hola


        String cadena = "Esto es una cadena";
        System.out.println(cadena); // imprime “Esto es un string"

        String otraCadena = "Esta\n es\n otra cadena"; // cadena con caracteres de escape
        //System.out.println(otraCadena); // imprime el resultado en varias líneas

        // Cómo obtener la longitud (length) y los caracteres de un String (char at)
        int longitud = cadena.length(); // devuelve un valor de tipo int
        System.out.println("Longitud: " + longitud);
        // 4º carácter
        System.out.println("4º carácter: " + cadena.charAt(3));
        // primer carácter
        System.out.println("primer carácter: " + cadena.charAt(0));
        // último carácter: si el primer carácter está en el índice 0 y la longitud es length()
        // el último carácter es length() - 1
        System.out.println("Último carácter: " + cadena.charAt(longitud - 1));
        char últimoCarácter = cadena.charAt(longitud - 1);

        // Métodos útiles para trabajar con cadenas de texto
        String cadena1 = "Los ordenadores son buenos siguiendo instrucciones, no leyendo tu mente";
        String cadena2 = "";
        // isEmpty() devuelve true si la cadena está vacía; de lo contrario, false;
        boolean b1 = cadena1.isEmpty();
        System.out.println("cadena1 está vacía: " + b1);
        boolean b2 = cadena2.isEmpty();
        System.out.println("cadena2 está vacía: " + b2);

        // toUpperCase() devuelve una nueva cadena en mayúsculas;
        String mayúsculas = cadena1.toUpperCase();
        System.out.println(mayúsculas);

        // toLowerCase() devuelve una nueva cadena en minúsculas;
        String minúsculas = cadena1.toLowerCase();
        System.out.println(minúsculas);

        // startsWith(prefijo) devuelve true si la cadena comienza con el prefijo de cadena dado; de lo contrario, false;
        boolean empiezaPor = cadena1.startsWith("Los");
        System.out.println(empiezaPor); // true

        // endsWith(sufijo) devuelve true si la cadena termina con el sufijo dado; de lo contrario, false.
        boolean terminaPor = cadena1.endsWith("Los");
        System.out.println(terminaPor); // false

        // contains(...) devuelve true si la cadena contiene la cadena o el carácter dados;
        boolean contiene = cadena1.contains("mente");
        System.out.println(contiene); // true

        // substring(posicionInicial, posicionFinal) devuelve una subcadena de la cadena en el rango: posicionInicial, posicionFinal - 1;
        String subcadena = cadena1.substring(10,15);
        System.out.println(subcadena);

        // replace(old, new) devuelve una nueva cadena obtenida reemplazando todas las apariciones de old con new que pueden ser caracteres o cadenas.
        String reemplazar = cadena1.replace("o", "i");
        System.out.println(reemplazar);
        // trim() devuelve una copia de la cadena obtenida al omitir los espacios en blanco iniciales y finales. Ten en cuenta que el espacio en blanco incluye no solo el carácter de espacio, sino principalmente todo lo que parece vacío: tabulación, retorno de carro, carácter de nueva línea, etc.
        String conBlancos = "     hola     ";
        System.out.println(conBlancos);
        System.out.println(conBlancos.length()); // 14
        // queremos quitar los espacios de delante y los de detrás
        String sinBlancos = conBlancos.trim();
        System.out.println(sinBlancos);
        System.out.println(sinBlancos.length());

        String primera1 = "primera";
        String segunda1 = "segunda";

        String primera2 = "primera";
        String segunda2 = "SEGUNDA";

        System.out.println(primera1.equals(segunda1));//“primera”.equals(“segunda”)->false
        System.out.println(primera1.equals(primera2)); //“primera”.equals(“primera”)->true

        System.out.println(segunda1.equals(segunda2));//“segunda”.equals(“SEGUNDA”)->false
        System.out.println(segunda1.equalsIgnoreCase(segunda2)); // true





    }
}

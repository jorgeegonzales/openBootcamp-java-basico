public class Ejercicio3 {
    public static void main(String[] args) {

        String[] amigas = new String[]{"Cristina","Katherine","Livia","karina"};

        String concatenacion = " ";

                for (int i = 0; i < amigas.length; i++) {

                    concatenacion = concatenacion + " " + amigas[i];
                    if (i == amigas.length - 1) {
                        System.out.println("Estas chicas fueron mis amigas:" + concatenacion);
                    }

                }
    }
}

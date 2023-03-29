public class Tarea {
    public static void main(String[] args){

    }
    public static boolean isPrime(int number) {
        boolean prime = true;
        if (number == 0) {
            prime = false;
        }
        if (number == 1) {
            prime = false;
        }
        for (int cont = 2; cont < number; cont++) {
            if (number % cont == 0) {
                prime = false;
            }
        }
        return prime;
    }
    public static void copyVectors(int[] vec, int [] otherVec ) {
        int otherPos = 0;
        for (int pos = 0; pos < vec.length; pos++) {
            // aquí se hace uso de nuestro método isPrime
            // podemos saber si el número es o no primo
            if (isPrime(vec[pos])) {
                otherVec[otherPos] = vec[pos];
                otherPos++;
            }
        }
    }
}

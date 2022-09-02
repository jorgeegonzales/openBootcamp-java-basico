package com.tareas;

public class DividePorCero {
    public static void main(String[] args) {

        try {
            int result = divide(4, 0);
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de código");
        }
    }

    public static int divide(int A, int B) throws ArithmeticException{
        int resultado = 0;
        try {
            resultado = A / B;
        }catch(ArithmeticException e){
            throw new ArithmeticException();
        }
        return resultado;
    }
}

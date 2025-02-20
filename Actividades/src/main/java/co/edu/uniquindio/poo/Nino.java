package co.edu.uniquindio.poo;


//CASO ESTUDIO: Guarderia

public class Nino {
    public static void main(String[]args){

        private String nombre;
        private String docIdentidad;
        private String alergias;
        private String nombreAcudiente;
        private String numeroContacto;
        private int edad;
        private char genero;

        public Nino(String nombre, String docIdentidad, String nombreAcudiente, String alergias, String numeroContacto, int edad, char genero ){

            this nombre=nombre;
            this docIdentidad=docIdentidad;
            this nombreAcudiente=nombreAcudiente;
            this alergias=alergias;
            this numeroContacto=numeroContacto;
            this edad=edad;
            this genero=genero;

        }

        @Override
        public String toString() {
            return "Niño{" +
                    "nombre ='" + nombre + '\'' +
                    "edad ='" + edad + '\'' +
                    '}';
        }


    }
}

/*
    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre ='" + nombres + '\'' +
                "edad ='" + edad + '\'' +
                '}';
    }
}

*/
package Vista;

import Controlador.Animal;
import Modelo.Conejo;
import Modelo.Gato;
import Modelo.Perro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Menu {
    private static final Scanner scan = new Scanner(System.in);
    private static  String user;
    private static final SimpleDateFormat dateF = new SimpleDateFormat("dd-MM-yyyy");

    private static Menu instace = null;

    private Menu(){

    }
    public static Menu getInstance(){
        if (instace == null){
            instace = new Menu();
        }
        return instace;
    }

    public void menu(){
        System.out.println("Bienvenido al menu principal");
        System.out.println("1- Listar");
        System.out.println("2- Agregar");
        System.out.println("3- Dar alta medica");
        System.out.println("4- Salir");

        int opcion = scan.nextInt();
         switch (opcion){
             case 1 -> ListarAnimales();

             case 2 -> AgregarAnimales();

             case 3 -> DarDeAltaAnimal();

             case 4 -> System.exit(87348);

         }

    }

    public void AgregarAnimales(){
        String duenio;
        String nombreAnimal;
        String color;
        Date fechaNacimiento;
        int edad;
        String fechaNacimientO;

        System.out.println("Tipo de animal");
        System.out.println("1- Perro");
        System.out.println("2- Gato");
        System.out.println("3- Conejo");
        System.out.println("4- Cancelar");
        int opAgregar = scan.nextInt();

        switch (opAgregar){
            case 1 -> {
                System.out.println("Ingrese nombre dueño");
                duenio = scan.next();
                System.out.println("Ingrese nombre del animal");
                nombreAnimal = scan.next();
                System.out.println("Ingres color del Animal");
                color = scan.next();
                System.out.println("Ingrese fecha de nacimiento del animal");
                fechaNacimientO = scan.next();
                try {
                    fechaNacimiento = dateF.parse(fechaNacimientO);
                }catch (ParseException e){
                    throw new RuntimeException(e);
                }
                System.out.println("Ingrese edad del Animal");
                edad = scan.nextInt();
                Perro perro = new Perro(duenio, nombreAnimal, color,fechaNacimiento, edad);
                Animal.getInstance().agregaPerro(perro);
                menu();
            }

            case 2 -> {
                System.out.println("Ingrese nombre dueño");
                duenio = scan.next();
                System.out.println("Ingrese nombre del animal");
                nombreAnimal = scan.next();
                System.out.println("Ingres color del Animal");
                color = scan.next();
                System.out.println("Ingrese fecha de nacimiento del animal");
                fechaNacimientO = scan.next();
                try {
                    fechaNacimiento = dateF.parse(fechaNacimientO);
                }catch (ParseException e){
                    throw new RuntimeException(e);
                }
                System.out.println("Ingrese edad del Animal");
                edad = scan.nextInt();
                Gato gato = new Gato(duenio, nombreAnimal, color,fechaNacimiento, edad);
                Animal.getInstance().agregaGato(gato);
                menu();
            }

            case 3 -> {
                System.out.println("Ingrese nombre dueño");
                duenio = scan.next();
                System.out.println("Ingrese nombre del animal");
                nombreAnimal = scan.next();
                System.out.println("Ingres color del Animal");
                color = scan.next();
                System.out.println("Ingrese fecha de nacimiento del animal");
                fechaNacimientO = scan.next();
                try {
                    fechaNacimiento = dateF.parse(fechaNacimientO);
                }catch (ParseException e){
                    throw new RuntimeException(e);
                }
                System.out.println("Ingrese edad del Animal");
                edad = scan.nextInt();
                Conejo conejo = new Conejo(duenio, nombreAnimal, color,fechaNacimiento, edad);
                Animal.getInstance().agregaConejo(conejo);
                menu();
            }

            case 4 -> menu();
        }
    }

    public void DarDeAltaAnimal(){
        String nombreAnimal;
        System.out.println("Que tipo de anial se dara de alta");
        System.out.println("1- Perro");
        System.out.println("2- Gato");
        System.out.println("3- Conejo");
        System.out.println("4- volver");
        int opAlta = scan.nextInt();

        switch (opAlta){

            case 1 -> {
                System.out.println("ingrese el nombre del gato a eliminar");
                nombreAnimal = scan.next();
                Animal.getInstance().AltaPerro(nombreAnimal);
                menu();
            }

            case 2 -> {
                System.out.println("ingrese el nombre del gato a eliminar");
                nombreAnimal = scan.next();
                Animal.getInstance().AltaGato(nombreAnimal);
                menu();
            }

            case 3 -> {
                System.out.println("ingrese el nombre del gato a eliminar");
                nombreAnimal = scan.next();
                Animal.getInstance().AltaConejo(nombreAnimal);
                menu();
            }
        }

    }

    public void ListarAnimales(){
        System.out.println("Que clase de animal desea listar?");
        System.out.println("1- Perro");
        System.out.println("2- Gato");
        System.out.println("3- Conejo");
        System.out.println("4- Cancelar");
        int opList = scan.nextInt();

        switch (opList){

            case 1 -> {
                Animal.getInstance().listarPerro();
                menu();
            }

            case 2 -> {
                Animal.getInstance().listarGato();
                menu();
            }

            case 3 -> {
                Animal.getInstance().listarConejo();
                menu();
            }

            case 4 -> menu();
        }
    }
    public void Login(){
        boolean validacion = false;
        do {
            String pass;
            System.out.println("ingrese usuario: ");
            user = scan.next();
            System.out.println("Ingrese contraseña: ");
            pass = scan.next();
            if (user.equalsIgnoreCase("Vet") && pass.equalsIgnoreCase("1234")){
                menu();
                validacion = true;
            }else if (user.equalsIgnoreCase("Dueno") && pass.equalsIgnoreCase("0000")){
                MenuDueno();
                validacion = true;
            }else{
                System.out.println("Credenciales incorrectas");
                validacion = false;
            }
        }while (validacion != true);

    }
    public void MenuDueno(){
        System.out.println("Menu veterinario");
        System.out.println("1. Agregar animal");
        System.out.println("2- Volver");
        int opMenu = scan.nextInt();

        switch (opMenu){
            case 1 -> {
                AgregarAnimales();
            }
            case 2 -> {
                System.exit(89);
            }
        }
    }


}

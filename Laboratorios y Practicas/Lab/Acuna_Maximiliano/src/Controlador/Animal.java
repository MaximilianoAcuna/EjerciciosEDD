package Controlador;

import Modelo.Conejo;
import Modelo.Gato;
import Modelo.Perro;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Animal {

    private static Animal instance =null;
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    private ArrayList<Gato> gatos;
    private ArrayList<Perro> perros;
    private ArrayList<Conejo> conejos;

    public static Animal getInstance() {
        if (instance == null) {
            instance = new Animal();
        }
        return instance;
    }

    public Animal() {
        this.gatos = new ArrayList<>();
        this.perros = new ArrayList<>();
        this.conejos = new ArrayList<>();
    }

    public void listarGato() {

        if(!gatos.isEmpty()) {
            for (Gato gato : gatos) {
                System.out.println(gato.toString());

            }

        } else{
            System.out.println("no exiten gatos por listar");
        }

    }

    public void listarPerro() {
        if(!perros.isEmpty()) {
            for (Perro perro: perros){
                System.out.println(perro.toString());

            }
        } else{
            System.out.println("no exiten perritos por listar");
        }

    }

    public void listarConejo() {


        if(!conejos.isEmpty()) {
            for (Conejo conejo: conejos){
                System.out.println(conejo.toString());

            }
        } else{
            System.out.println("no exiten conejos por listar");
        }

    }

    public void agregaGato( Gato gato){
        gatos.add(gato);


    }

    public void agregaPerro( Perro perro){
        perros.add(perro);

    }

    public void agregaConejo( Conejo conejo){
        conejos.add(conejo);

    }

    //eliminar
    public void AltaGato(String gatoS){
        Gato gato = buscaGato(gatoS);
        gatos.remove(gato);

    }

    public void AltaPerro(String perroS){
        Perro perro = buscaPerro(perroS);
        perros.remove(perro);
    }

    public void AltaConejo(String conejoS){
        Conejo conejo = buscaConejo(conejoS);
        conejos.remove(conejo);
    }

    public Gato buscaGato(String nombreGato){
        for (Gato gato : gatos){
            if (gato.getNombreAnimal().equalsIgnoreCase(nombreGato)){
                return gato;
            }
        }
        return null;
    }

    public Perro buscaPerro(String nombrePerro){
        for (Perro perro : perros){
            if (perro.getNombreAnimal().equalsIgnoreCase(nombrePerro)){
                return perro;
            }
        }
        return null;
    }

    public Conejo buscaConejo(String nombreConejo){
        for (Conejo conejo : conejos){
            if (conejo.getNombreAnimal().equalsIgnoreCase(nombreConejo)){
                return conejo;
            }
        }
        return null;
    }
}

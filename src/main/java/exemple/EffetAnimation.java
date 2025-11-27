package exemple;

import bandeau.Bandeau;

public class EffetAnimation extends Scenario implements CarParCar, Rotation, Clignotant{
public EffetAnimation(){

}

public void carParCaractere(Bandeau bandeau, String message){
        bandeau.setMessage("");
        for (int i=0; i< message.length();i++){
            bandeau.setMessage(bandeau.getMessage()+Character.toString(message.charAt(i)));
            bandeau.sleep(500);

        }
}

public void clignoter(Bandeau bandeau, String message, int nombre, int temps){
        bandeau.setMessage("");
        for (int i=0; i<nombre;i++){
            bandeau.setMessage(message);
            bandeau.sleep(temps);
            bandeau.setMessage("");
            bandeau.sleep(temps);
        }
    }

public void tourner(Bandeau bandeau, String message, int nombre, double angle){
        bandeau.setMessage("");
        bandeau.setMessage(message);
        for (int i=1; i<=nombre;i++){
            bandeau.sleep(500);
            bandeau.setRotation(i*angle);
            
        }

    }

    

    }
    

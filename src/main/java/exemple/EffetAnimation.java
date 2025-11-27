package exemple;

import bandeau.Bandeau;

public class EffetAnimation extends Scenario implements CarParCar, Rotation, Clignotant{
public EffetAnimation(){

}

public void carParCaractere(String message){
        Bandeau bandeau3=new Bandeau();
        bandeau3.setMessage("");
        for (int i=0; i< message.length();i++){
            bandeau3.setMessage(bandeau3.getMessage()+Character.toString(message.charAt(i)));
            bandeau3.sleep(500);

        }
}

public void clignoter(String message, int nombre, int temps){
        Bandeau bandeau3=new Bandeau();
        bandeau3.setMessage("");
        for (int i=0; i<nombre;i++){
            bandeau3.setMessage(message);
            bandeau3.sleep(temps);
            bandeau3.setMessage("");
            bandeau3.sleep(temps);
        }
    }

public void tourner(String message, int nombre, double angle){
        Bandeau bandeau3=new Bandeau();
        bandeau3.setMessage("");
        bandeau3.setMessage(message);
        for (int i=1; i<=nombre;i++){
            bandeau3.sleep(500);
            bandeau3.setRotation(i*angle);
            
        }

    }

    

    }
    

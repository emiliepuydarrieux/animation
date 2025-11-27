package exemple;

import bandeau.Bandeau;

public class Rotation extends EffetAnimation {
    public Rotation(){
        super();
    };

    public void Tourner(String message, int nombre, double angle){
        Bandeau bandeau3=new Bandeau();
        bandeau3.setMessage("");
        bandeau3.setMessage(message);
        for (int i=0; i<nombre;i++){
            bandeau3.sleep(500);
            bandeau3.setRotation(angle);
            
        }

    }
    
}

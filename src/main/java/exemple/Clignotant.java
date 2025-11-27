package exemple;

import bandeau.Bandeau;

public class Clignotant extends EffetAnimation{

    public Clignotant(){
        super();
    };

    public void Clignoter(String message, int nombre, int temps){
        Bandeau bandeau3=new Bandeau();
        bandeau3.setMessage("");
        for (int i=0; i<nombre;i++){
            bandeau3.setMessage(message);
            bandeau3.sleep(temps);
            bandeau3.setMessage("");
            bandeau3.sleep(temps);


        }



    }
    
}

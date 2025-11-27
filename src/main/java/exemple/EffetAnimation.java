package exemple;

import bandeau.Bandeau;

public class EffetAnimation extends Bandeau {
public EffetAnimation(){

}

    public void carParCaractere(String message){
        for (int i=0; i< message.length();i++){
            System.out.println(message.charAt(i));
        }

    }
    
}

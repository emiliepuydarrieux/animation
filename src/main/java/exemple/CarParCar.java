package exemple;

import bandeau.Bandeau;

public class CarParCar extends EffetAnimation {
    
    public CarParCar(){
        super();
    };

    public void carParCaractere(String message){
        Bandeau bandeau3=new Bandeau();
        bandeau3.setMessage("");
        for (int i=0; i< message.length();i++){
            bandeau3.setMessage(bandeau3.getMessage()+Character.toString(message.charAt(i)));
            bandeau3.sleep(3000);

        }
}
}

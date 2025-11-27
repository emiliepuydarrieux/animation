package exemple;

import bandeau.Bandeau;

public class Scenario {
    public Scenario(){

    };

    public void scenario1(Bandeau bandeau,String messageCarParCar, String messageClig, int nombreClig, int tempsClig, String messageRot, int nombreRot, double angle){
        EffetAnimation effet1= new EffetAnimation();
         effet1.carParCaractere(bandeau,messageCarParCar);
         effet1.clignoter(bandeau,messageClig,nombreClig, tempsClig);
         effet1.tourner(bandeau,messageRot,nombreRot,angle);


    }
}

package exemple;

public class Scenario {
    public Scenario(){

    };

    public void scenario1(String messageCarParCar, String messageClig, int nombreClig, int tempsClig, String messageRot, int nombreRot, double angle){
        EffetAnimation effet1= new EffetAnimation();
         effet1.carParCaractere(messageCarParCar);
         effet1.clignoter(messageClig,nombreClig, tempsClig);
         effet1.tourner(messageRot,nombreRot,angle);


    }
}

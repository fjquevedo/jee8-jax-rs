package es.dzone;

import javax.enterprise.event.Observes;

public class NewZoneeHandler {

    public void onNewZonee(@Observes Zonee zonee) {
        System.out.println("new zonee: " + zonee);
    }

}

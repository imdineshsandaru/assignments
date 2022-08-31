package org.example;

import java.util.List;

public class TreadmillGame {

    public void onTreadmillData(List<Chaser> chasers , int distance, int timeElapsed){
        int status = 0;

        for(Chaser chaser: chasers){
            if (timeElapsed - chaser.getDelay() > 0){
              Double chaserDistance = (timeElapsed - chaser.getDelay())*chaser.getSpeed();
              if(chaserDistance >= distance){
                  status = 2;
                  break;
              }
            }
        }

        if(distance>=5000){
            status=1;
        }

        System.out.println("Q2: " + "Winning status: "+ status);
    }
}

package com.thecodeexperience.ActuatorLearning;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class DatabaseHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        boolean isDBUp = checkDBConnection();
        return isDBUp ? Health.up().withDetail("DB","Available").build()
                : Health.down().withDetail("DB","Not Available").build();
    }

    private boolean checkDBConnection(){
        return true;
    }
}

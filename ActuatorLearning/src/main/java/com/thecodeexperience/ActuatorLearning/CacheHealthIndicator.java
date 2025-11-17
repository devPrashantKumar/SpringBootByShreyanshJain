package com.thecodeexperience.ActuatorLearning;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CacheHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        boolean isDBUp = checkDBConnection();
        return isDBUp ? Health.up().withDetail("Cache","Available").build()
                : Health.down().withDetail("Cache","Not Available").build();
    }

    private boolean checkDBConnection(){
        return true;
    }
}

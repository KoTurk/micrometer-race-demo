package nl.turk.ide.car.controller;

import io.micrometer.core.instrument.Metrics;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("car/race")
public class CarCounterController {

    @RequestMapping("laps")
    public String addOneLap() {
        Metrics.counter("car.race.laps.counter").increment();
        return "Added a lap";
    }
}

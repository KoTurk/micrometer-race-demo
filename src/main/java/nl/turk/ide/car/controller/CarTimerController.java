package nl.turk.ide.car.controller;

import io.micrometer.core.annotation.Timed;
import io.micrometer.core.instrument.Metrics;
import io.micrometer.core.instrument.Timer;
import io.micrometer.prometheus.PrometheusMeterRegistry;
import lombok.extern.slf4j.Slf4j;
import nl.turk.ide.car.domain.FormulaOneCar;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;

@RestController
@RequestMapping("car/race")
@Slf4j
public class CarTimerController {
    // create registry
    PrometheusMeterRegistry registry;

    FormulaOneCar formulaOneCar = new FormulaOneCar();

    public CarTimerController(PrometheusMeterRegistry registry) {
        this.registry = registry;
    }

    @RequestMapping("/pitstop")
//  @Timed("car.race.pitstop.timer")
    public String race() {
        pitstop();
        return "wow super fast pitstop";
    }

    private void pitstop() {
        registry.timer("car.race.pitstop.timer").record(formulaOneCar.refuel());
//        Metrics.timer("car.race.pitstop.timer").record(formulaOneCar.refuel());
//        Timer.builder("car.race.pitstop.timer").tags("RiderOne").register(registry).record(formulaOneCar.refuel());
    }
}

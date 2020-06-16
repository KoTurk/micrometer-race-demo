package nl.turk.ide.car.controller;

import io.micrometer.core.instrument.Metrics;
import nl.turk.ide.car.domain.FormulaOneCar;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("car/race")
public class CarGaugeController {
    FormulaOneCar formulaOneCar = new FormulaOneCar();

    @RequestMapping("/tires")
    public void getTireWear() {
        Metrics.gauge("car.race.tire.wear.gauge", formulaOneCar.getTireWear());
    }
}

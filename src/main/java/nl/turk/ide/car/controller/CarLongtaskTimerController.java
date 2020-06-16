package nl.turk.ide.car.controller;

import io.micrometer.core.annotation.Timed;
import io.micrometer.core.instrument.Timer;
import io.micrometer.prometheus.PrometheusMeterRegistry;
import lombok.extern.slf4j.Slf4j;
import nl.turk.ide.car.domain.FormulaOneCar;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("car/race")
@Slf4j
public class CarLongtaskTimerController {
    private FormulaOneCar formulaOneCar = new FormulaOneCar();

    @RequestMapping("")
    @Timed(value = "car.race.longtasktimer", longTask = true)
    public String race() throws InterruptedException {
        driving();
        return "Well done, you finished 1st";
    }

    private void driving() throws InterruptedException {
        formulaOneCar.driving();
    }
}

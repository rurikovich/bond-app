package org.bondapp.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.bondapp.domain.Bond;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BondController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/bond")
    public Bond bond(@RequestParam(value = "isin", defaultValue = "World") String isin) {
        return new Bond(counter.incrementAndGet(), isin);
    }

}

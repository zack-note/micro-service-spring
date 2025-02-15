package com.in28minutes.microservices.currency_conversion_service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@RestController
public class CurrencyConversionController {
    @GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion retrieveCurrencyConversion(
            @PathVariable String from,
            @PathVariable String to,
            @PathVariable double quantity
    ) {

        HashMap<String,String> uriVariables = new HashMap<>();
        uriVariables.put("from",from);
        uriVariables.put("to",to);

        ResponseEntity<CurrencyConversion> responseEntity = new RestTemplate().getForEntity(
            "http://127.0.0.1:8000/currency-exchange/from/USD/to/INR",
                CurrencyConversion.class,
                uriVariables
        );
        CurrencyConversion currencyConversion = responseEntity.getBody();
        currencyConversion.setQuantity(quantity);
        currencyConversion.setTotalCalculatedAmount(quantity * currencyConversion.getConversionMultiple());

        return currencyConversion;
    }
}

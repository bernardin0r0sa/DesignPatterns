package designpatterns.strategy;

import java.math.BigDecimal;

/**
 * Created by bernardinorosa on 30/03/19.
 */
public interface Pricing {
    BigDecimal getPrice(BigDecimal basePrice);

    static Pricing monthlyPrice() {
        return basePrice -> basePrice.divide(BigDecimal.valueOf(12));
    }

    static Pricing yearlyPrice() {
        return basePrice -> basePrice.subtract((basePrice.multiply(BigDecimal.valueOf(0.25))));
    }
}

package designpattern.strategy;

import java.math.BigDecimal;

/**
 * Created by bernardinorosa on 30/03/19.
 */
public class StreamingService {

    public static void main(String[] args) {

        BigDecimal basePrice = BigDecimal.valueOf(240);
        String paymentPlan="MONTHLY";
        BigDecimal price;

        Pricing pricing;

        switch(paymentPlan) {
            case "MONTHLY" : {pricing=Pricing.monthlyPrice(); break;}
            case "YEARLY" :  {pricing=Pricing.yearlyPrice();  break;}
            default:{pricing=Pricing.yearlyPrice();  break;}
        }

        price = pricing.getPrice(basePrice);

        System.out.println("Payment Plan:"+paymentPlan+" Price:"+price);
    }
}

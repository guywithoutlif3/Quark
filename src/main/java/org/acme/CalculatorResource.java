package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/calculator")
public class CalculatorResource {

    @GET
    @Path("{number1}/{number2}")
    @Produces(MediaType.TEXT_PLAIN)

    public String calculate(int number1, int number2) {
        int number3 = number1 + number2;
        String response = String.valueOf(number3);
        return "The result of " + number1 +" + "+ number2 + " Equals "+ number3;
    }

}
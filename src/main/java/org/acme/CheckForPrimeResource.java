package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.math.BigInteger;

@Path("/isprime")
public class CheckForPrimeResource {

    @Inject
    CheckForPrimeService service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{number}")
    public Boolean check(BigInteger number) {
        return service.isPrime(number);
    }
}

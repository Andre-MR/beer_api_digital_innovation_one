package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockEmptyException extends Exception {

    public BeerStockEmptyException(Long id) {
        super(String.format("Not enough beers with %s ID to decrement on stock.", id));
    }
}

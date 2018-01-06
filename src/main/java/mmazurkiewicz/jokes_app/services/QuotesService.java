package mmazurkiewicz.jokes_app.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class QuotesService {
    ChuckNorrisQuotes chuckNorrisQuotes;

    public String getRandomQuote(){
        return chuckNorrisQuotes.getRandomQuote();
    }
}

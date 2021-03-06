package mmazurkiewicz.jokes_app.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class QuotesServiceImpl implements QuotesService {
    private ChuckNorrisQuotes chuckNorrisQuotes;

    public QuotesServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomQuote(){
        return chuckNorrisQuotes.getRandomQuote();
    }

}

package com.csc340.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class JokeController {

    @GetMapping("/joke")
    public Joke getRandomJoke() {
        String url = "https://official-joke-api.appspot.com/jokes/random";

        // Using RestTemplate to call the API and map the response to a Joke object
        RestTemplate restTemplate = new RestTemplate();
        Joke joke = restTemplate.getForObject(url, Joke.class);

        return joke;
    }
}

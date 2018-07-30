package sahli.springFramework.Chucknorrisforactuator.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;


@Service
@Primary
public class JokeServiceImpl implements JokeService{

	
	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	
	public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes ) {
		 
		this.chuckNorrisQuotes= chuckNorrisQuotes;
	}


	@Override
	public String getRandomJoke() {
		// TODO Auto-generated method stub
		return chuckNorrisQuotes.getRandomQuote();
	}

}

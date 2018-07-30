package sahli.springFramework.Chucknorrisforactuator.model;


public class Joke {

	
	public Joke() {
		 
	}
	
	public Joke(String jokeText) {
		 
		this.jokeText = jokeText;
	}

	
	


	private String jokeText;

	public String getJokeText() {
		return jokeText;
	}

	public void setJokeText(String jokeText) {
		this.jokeText = jokeText;
	}
	
	
}

import java.time.LocalDate;


public class MovieTest {

	public static void main(String[] args) {

		Movie m1 = new Movie("Movie 1", "English", LocalDate.of(2020, 11,22));
		m1.toString();
		m1.shooting();
		m1.edit();
		m1.postProd();
		m1.release();
		System.out.println("---------------------------------------");
		
		Action a1 = new Action("Action Movie 1","Hindi",LocalDate.of(2000, 10,05),"Hero 1");
		a1.toString();
		a1.shooting();
		a1.stuntShoot();
		a1.release();
		System.out.println("---------------------------------------");

		Romance r1 = new Romance("Romantic Movie 1 ","Tamil",LocalDate.of(2003, 12, 05),"Hero","Heroine");
		r1.toString();
		r1.songShoot();
		r1.edit();
		r1.release();
		
	}

}

public class Movie {

	private String name;
	private String language;
	private LocalDate releaseDate;

	public Movie(String name, String language, LocalDate releaseDate) {
		super();
		this.name = name;
		this.language = language;
		this.releaseDate = releaseDate;
		System.out.println("Movie is being created");
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", language=" + language + ", releaseDate=" + releaseDate + "]";
	}

	void shooting() {
		System.out.println("Movie is being shooted");
	}

	void edit() {
		System.out.println("Movie is being edited");
	}

	void postProd() {
		System.out.println("Movie is in post-production stage");
	}
	void release() {
		System.out.println("Movie is being released in theatres");
	}
}


public class Romance extends Movie {

	String hero, heroine;

	public Romance(String name, String language, LocalDate releaseDate, String hero, String heroine) {
		super(name, language, releaseDate);
		this.hero = hero;
		this.heroine = heroine;
		System.out.println("Romantic movie is being created");
	}

	@Override
	public String toString() {
		return "Romance [hero=" + hero + ", heroine=" + heroine + ", toString()=" + super.toString() + "]";
	}
	
	void shooting() {
		System.out.println("Romantic Movie is being shooted");
	}

	void edit() {
		System.out.println("Romantic Movie is being edited");
	}

	void postProd() {
		System.out.println("Romantic Movie is in post-production stage");
	}
	
	void songShoot() {
		System.out.println("Romantic movie song is being shooted");
	}
	
	
}

public class Action extends Movie {

	String hero;

	public Action(String name, String language, LocalDate releaseDate, String hero) {
		super(name, language, releaseDate);
		this.hero = hero;
		System.out.println("Action movie is being created");
	}

	@Override
	public String toString() {
		return "Action [hero=" + hero + ", toString()=" + super.toString() + "]";
	}
	
	void stuntShoot() {
		System.out.println("Action block is being shooted");
	}
	
	
}

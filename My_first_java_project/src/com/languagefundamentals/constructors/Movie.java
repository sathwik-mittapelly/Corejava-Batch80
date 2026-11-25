package com.languagefundamentals.constructors;

public class Movie {

	String director;
	String hero;
	String heroine;
	double budget;
	String mname;

	public Movie(String director, String hero, String heroine, double budget, String mname) {
		super();
		this.director = director;
		this.hero = hero;
		this.heroine = heroine;
		this.budget = budget;
		this.mname = mname;
	}
	
	Movie(Movie m){
		this.director = m.director;
		this.hero = m.hero;
		this.heroine = m.heroine;
		this.budget = m.budget;
		this.mname = m.mname;
		
	}

	public static void main(String[] agrs) {
		Movie m = new Movie("S S Rajamouli", "Mahesh babu", "Priyanka", 500000000.00, "Varanasi");
		m.movieInfo();
		
		Movie m1 = new Movie(m);
		m1.movieInfo();

	}

	void movieInfo() {
		System.out.println("Director of the Movie : " + director);
		System.out.println("Hero of the Movie : " + hero);
		System.out.println("Heroine of the Movie : " + heroine);
		System.out.println("Budget of the Movie : " + budget);
		System.out.println("Name of the Movie : " + mname);
		System.out.println("**********************************");
	}

}

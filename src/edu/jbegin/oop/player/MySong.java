package edu.jbegin.oop.player;

public class MySong implements Song {

	private String name;
	private Author author;

	public MySong() {
	}

	public MySong(String name, Author author) {
		this.name = name;
		this.author = author;
	}

	@Override
	public String getName() {
		return name;
		}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public void play() {
		System.out.println("Играет песня: " + name + " автор: " + author.getAuthorName());

	}

}

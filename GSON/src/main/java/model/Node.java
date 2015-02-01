package model;

import java.util.ArrayList;

public class Node {
	private String title;
	// HOW TO COLOR CODE GROUPS
	private int group = -1;
	private int number = -1;
	private int pdfID = -1;
	private String language = "NON";
	private double relevance = -1;
	private ArrayList<Category> genericKeywords = new ArrayList<Category>();
	private ArrayList<WordOcc> wordOcc = new ArrayList<WordOcc>();
	private String type;
	private String shorttitle;
	private int edgeDegree = -1;
	private int color = -1;
	private int test = -1;
	private String normtitle="";

	public Node(Category cat) {
		this.title = cat.getTitle();
		this.group = cat.getColor();
		this.relevance = cat.getRelevance();
	}

	public Node(PDF pdf) {
		this.title = pdf.getTitle();
		this.pdfID = pdf.getPublicationID();
		this.language = pdf.getLanguage();
		this.wordOcc = pdf.getWordOccList();
		this.genericKeywords = pdf.getGenericKeywords();
	}

	public Node(Category cat, int counter) {
		this.group = cat.getColor();
		this.title = cat.getTitle();
		this.relevance = cat.getRelevance();
		this.number = counter;
	}

	public Node(PDF pdf, int counter) {
		this.title = pdf.getTitle();
		this.pdfID = pdf.getPublicationID();
		this.language = pdf.getLanguage();
		this.wordOcc = pdf.getWordOccList();
		this.genericKeywords = pdf.getGenericKeywords();
		this.number = counter;

	}

	public Node(Category cat, int counter, String type) {
		this.group = cat.getColor();
		this.title = cat.getTitle();
		this.relevance = cat.getRelevance();
		this.number = counter;
		this.type = type;
		this.edgeDegree = cat.getEdgeDegree();
		this.color = cat.getColor();
		this.shorttitle = cat.getTitle();
		this.test = 100;
		this.normtitle = cat.getNormtitle();
	}

	public Node(PDF pdf, int counter, String type) {
		this.title = pdf.getTitle();
		this.shorttitle = pdf.getShortTitle();
		this.pdfID = pdf.getPublicationID();
		this.language = pdf.getLanguage();
		this.wordOcc = pdf.getWordOccList();
		this.genericKeywords = pdf.getGenericKeywords();
		this.number = counter;
		this.type = type;
		if (pdfID < 50) {
			this.test = 50;
		} else {
			this.test = 100;
		}
	}
}

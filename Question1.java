public class Question1 {
    public static void main(String[] args) {
	    Publication[] pub = new Publication[10];
	
	    pub[0] = new Magazine("Marvel Comics", "Spider Man", 3, 30, "monthly");
	    pub[1] = new Magazine();
	    pub[2] = new Magazine("DC Comics", "Aquaman", 3, 30, "weekly");
	    pub[3] = new Book();
	    pub[4] = new Book("J.R.R Tolkein");
	    pub[5] = new Book("Newyork Pub", "Song of Soda and Wine", 150.50, 400, "G. Martin");
	    pub[6] = new KidsMagazine();
	    pub[7] = new KidsMagazine(13);
	    pub[8] = new KidsMagazine("The Parents", "Why is the Sky Blue?", 100, 20, "weekly", 15);
	    pub[9] = new Publication();
	
	    for (Publication p : pub) {
	        System.out.println(p);
	    }
    }
}

class Publication {
    private String publisher;
    private int numPages;
    private double price;
    private String title;

    public Publication() {
        publisher = null;
        numPages = 0;
        price = 0;
        title = null;
    }

    public Publication(String publisherF, String titleF, double priceF, int numPagesF) {
        publisher = publisherF;
        title = titleF;
        price = priceF;
        numPages = numPagesF;
    }

    public String toString() {
        return ("The Publisher " + publisher + " publishes " + title + " , " + numPages + " pages, " + price + " baht");
	}
}

class Magazine extends Publication{
    private String publicationUnit;

    public Magazine() {
        super();
        publicationUnit = null;
    }

    public Magazine(String publisherF, String titleF, double priceF, int numPagesF, String publicationUnitF) {
        super(publisherF, titleF, priceF, numPagesF);
        publicationUnit = publicationUnitF;
    }

    @Override
    public String toString() {
        return (super.toString() + " The Mazagine is " + publicationUnit + " print");
    }
}

class Book extends Publication{
    private String author;

    public Book() {
        super();
        author = null;
    }

    public Book(String authorF) {
        super();
        author = authorF;
    }

    public Book(String publisherF, String titleF, double priceF, int numPagesF, String authorF) {
        super(publisherF, titleF, priceF, numPagesF);
        author = authorF;
    }

    @Override
    public String toString() {
        return (super.toString() + " The author is " + author);
    }
}

class KidsMagazine extends Magazine{
    private int ageRange;

    public KidsMagazine() {
        super();
        ageRange = 0;
    }

    public KidsMagazine(int ageRangeF) {
        super();
        ageRange = ageRangeF;
    }

    public KidsMagazine(String publisherF, String titleF, double priceF, int numPagesF, String publicationUnitF, int ageRangeF) {
        super(publisherF, titleF, priceF, numPagesF, publicationUnitF);
        ageRange = ageRangeF;
    }

    @Override
    public String toString() {
        return (super.toString() + " The recommended age range is " + ageRange);
    }
}

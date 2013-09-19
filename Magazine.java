
public class Magazine  {

	/**
	 * Project 1
	 * CS 2334, Section 010
	 * 11/17/2013
	 * <P>
	 * Creates an abstract data type to store data on a single magazine.
	 * </P>
	 * 
	 */
	
	private String PublisherName;
	private String MagazineName;
	private String firstYear; //Year when magazine was first published
	private String issuesPerYear; //Year when magazine was last published
	private String lastYear;
	
	/**
	 * This constructor creates a magazine object by imputing the publisher, name of the magazine and the last year issued if there is one.
	 * @param myPublisher Publisher of the magazine as a string.
	 * @param myMagazineName Title of the magazine as a string.
	 * @param myFirstYear First year magazine was issued. 
	 */
	Magazine(String myMagazineName,String myPublisher,String myIssues, String myFirstYear, String myLastYear)
	{
		this.MagazineName = myMagazineName;
		this.PublisherName = myPublisher;
		this.firstYear = myFirstYear;
		this.issuesPerYear = myIssues;
		this.lastYear = myLastYear;
	}

	/**
	 * Method gets the publisher from the magazine object
	 * @return The publisher of the book as a string
	 */
	public String getPublisher()
	{
		return PublisherName;
	}
	/**
	 * Method gets the magazine name from the magazine object
	 * @return The name of the magazine as a string
	 */
	public String getName()
	{
		return  MagazineName;
	}
	/**
	 * Method gets the first year issued from the magazine object.
	 * @return The first year issued as a string
	 */
	public String getFirstYear()
	{
		return firstYear;
	}
	
	/**
	 * Gives all the details of a magazine as a string
	 * @return Details in the form of a string
	 */
	public String getDetails()
	{
		return "Magazine Name: " + MagazineName +"\nPublisher: " + PublisherName + "\nNumber of Issues per Year: " + 
				issuesPerYear+ "\nFirst Year Issued: " + firstYear +"\nLast Year Issued: " + lastYear;
	}


}

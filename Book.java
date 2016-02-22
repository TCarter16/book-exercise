/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private int refNumber;
    private int pages;
    private String author;
    private String title;
    private String borrowed;
    private boolean courseText;


    public Book(String bookAuthor, String bookTitle, String pages, String refNumber)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        borrowed = bookBorrowed;
        courseText = bookCourseText;
    }

   public String getAuthor()
   {
       return author;
}

    public String getTitle()
    {
        return title;
    }
    
    public String getPages()
    {
        return pages;
    }
    
    public void getRefNumber()
    {
        return refNumber;
    }

    public void printTitle()
    {
        System.out.println( title );
    }
    
    public void printAuthor()
    {
        System.out.println( author );
    }
    
    public void printPages()
    {
        System.out.println( pages );
    }
    
    public void printRefNumber()
    {
        System.out.println(refNumber);
    }
    
    public void setRefNumber(String ref)
    {
        refNumber = 103;
    }
    
      public void setBorrowed(String ref)
    {
        if( borrowed == 0 && pages > 1)
        ++borrowed;
    }
    public void printDetails()
    {
        System.out.println( "Title: " + printTitle + "/n Author: " + printAuthor + "/n Pages: " + printPages + "/n #: " + refNumber + "You've borrowed: " + borrowed);

    }
}
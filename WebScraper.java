// COURSE: CSCI1620
// TERM: Spring 2019
//
// NAME: Cameron Gilinsky and Carter Kennell
// RESOURCES: Piazza discussion board posts by the
//				students and instructors for this class.


package scraper.base;


/**
 * This class provides a simple mechanism to crawl a series of webpages 
 * recursively and extract all of the images that are found on 
 * the pages visited.
 * @author ckennell and ckgilinsky
 *
 */
public class WebScraper 
{
	/**
	 * The default recursive depth to explore.
	 */
	private static final int DEPTH_DEFAULT = 0;
	
	/**
	 * The set recursive depth to explore. Should be >= 0.
	 */
	private int depth;
	
	/**
	 * The base URL used to explore for images.
	 */
	private String baseURL;
	
	/**
	 * Builds a new WebScraper that should start at the provided 
	 * URL and will by default explore that page at a depth of 0. 
	 * This allows extracting just the details from this page and 
	 * nothing else.
	 * @param urlIn The URL to explore for images.
	 */
	public WebScraper(String urlIn)
	{
		depth = DEPTH_DEFAULT;
		setURL(urlIn);
	}
	
	/**
	 * Builds a new WebScraper that should start at the provided 
	 * URL and will explore recursively to a specified depth.
	 * @param urlIn The URL to begin exploring for images.
	 * @param depthIn The recursive depth to explore, 
	 * must be >= 0. Negative values will be treated as equivalent to 0.
	 */
	public WebScraper(String urlIn, int depthIn)
	{
		setDepth(depthIn);
		setURL(urlIn);
	}
	
	/**
	 * Updates this WebScraper to explore to a new depth.
	 * @param depthIn The recursive depth to explore, 
	 * must be >= 0. Negative values will be treated as equivalent to 0.
	 */
	public void setDepth(int depthIn)
	{
		if (depthIn >= DEPTH_DEFAULT)
		{
			depth = depthIn;
		}
		else
		{
			depth = DEPTH_DEFAULT;
		}
	}
	
	/**
	 * Retrieves the exploration depth of this WebScraper.
	 * @return The depth stored in this WebScraper.
	 */
	public int getDepth()
	{
		return depth;
	}
	
	/**
	 * Updates the base URL to explore for this WebScraper.
	 * @param url The new URL to explore. The WebScraper url 
	 * is only changed if the url value is valid (not null or empty).
	 */
	public void setURL(String url)
	{
		if (url != null && !url.equals(""))
		{
			baseURL = url;
		}
	}
	
	/**
	 * Retrieves the base url for exploration by this WebScraper.
	 * @return The base url.
	 */
	public String getURL()
	{
		return baseURL;
	}
	
	/**
	 * Retrieves the set of images found directly at the initial base 
	 * URL for this WebScraper. This method will not explore any links 
	 * found at the base page. Image information should be stored in the 
	 * order in which their corresponding <img> tags appear in the source 
	 * HTML code. If an image appears more than once in a page, only one 
	 * entry should appear in the ResultSet.
	 * @return A collection of ImageEntry objects for the images found at 
	 * the base url location.
	 */
	public ResultSet getImages()
	{
		return ResultSet;
	}
	
	/**
	 * This method will recursively explore pages starting at the base url 
	 * defined for this WebScraper to the depth for which the scraper is configured.
	 * 
	 *  The ResultSet will contain all images discovered along the way,with images 
	 *  from a page being explored stored in the ResultSet prior to any images found 
	 *  on linked pages. ImageEntries will always appear in the ResultSetin the order 
	 *  in which the corresponding <img> tags are given in the HTML files. Only the 
	 *  first occurrence of a particular image (by absoluteURL) is stored in the 
	 *  ResultSet.
	 *  
	 *  Links on a page will be explored in the sequential order in which their 
	 *  corresponding <a> tags appear in the HTML file. The same URLshould never 
	 *  be crawled more than once, even if it is linked from itself or 
	 *  another later page.
	 * @return The set of ImageEntry objects resulting from this recursive crawl.
	 */
	public ResultSet crawlPage()
	{
		
	}
	
	/**
	 * Retrieves the historical trail of pages visited during the 
	 * last top-level call to crawlPage.
	 * @return The most recent collection of pages visited. 
	 * If the crawlPagemethod has not been previously called, the 
	 * PageHistory object will be empty.
	 */
	public PageHistory getPageHistory()
	{
		
	}
}

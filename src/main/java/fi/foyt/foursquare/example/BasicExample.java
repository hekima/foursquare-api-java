package fi.foyt.foursquare.example;

import fi.foyt.foursquare.api.FoursquareApi;
import fi.foyt.foursquare.api.FoursquareApiException;
import fi.foyt.foursquare.api.Result;
import fi.foyt.foursquare.api.entities.CompactVenue;
import fi.foyt.foursquare.api.entities.CompleteVenue;
import fi.foyt.foursquare.api.entities.VenuesSearchResult;

/**
 * Basic search example
 * @TODO - more examples please :)
 * @author rmangi
 *
 */
public class BasicExample {

	  public static void main(String[] args) {
	    String ll = args.length > 0 ? args[0] : "44.3,37.2";
	    try {
	      (new BasicExample()).searchVenues(ll);
	    } catch (FoursquareApiException e) {
	      // TODO: Error handling
	    }
	  }

	  public void searchVenues(String ll) throws FoursquareApiException {
	    // First we need a initialize FoursquareApi. 
	    FoursquareApi foursquareApi = new FoursquareApi("CGBJN4EH2J23RV3IGUCGVKC4J4DGZ5W2XJWAXRAIKJVJOFV3", "GT4LZ5Q4R4SQGSSQDFHAZZ4GSJKAZTRLHZ2QGIV0M401ZXF2", new String());
          //foursquareKey = "CGBJN4EH2J23RV3IGUCGVKC4J4DGZ5W2XJWAXRAIKJVJOFV3";
          //foursquareSecret = "GT4LZ5Q4R4SQGSSQDFHAZZ4GSJKAZTRLHZ2QGIV0M401ZXF2";
          //foursquareAccessToken = "DTIM5Y0HEBLOQ1TEUSBLSVHH0U5G3JOH2DB3UB2QXFP5UF4S";


       // String url = "https://foursquare.com/zahpee";
        //int index = url.lastIndexOf("/");
        String venueId = "4fc123f4e4b08acecb574b62";

	    // After client has been initialized we can make queries.
        Result<CompleteVenue> result = foursquareApi.venue(venueId);

        /*
	    if (result.getMeta().getCode() == 200) {
	      // if query was ok we can finally we do something with the data
	      for (CompactVenue venue : result.getResult().getVenues()) {
	        // TODO: Do something we the data
	        System.out.println(venue.getName());
	      }
	    } else {
	      // TODO: Proper error handling
	      System.out.println("Error occured: ");
	      System.out.println("  code: " + result.getMeta().getCode());
	      System.out.println("  type: " + result.getMeta().getErrorType());
	      System.out.println("  detail: " + result.getMeta().getErrorDetail()); 
	    }*/

        CompleteVenue cv = result.getResult();
        cv.getMayor();
	  }
}

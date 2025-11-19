package Interview;


/*
*
*  URL shortner
*
*  INPUT URL: string
*  OUTPUT : 8 charater( 62 base ---> a---zA---Z0---9 )
*
*
* */


import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class URLShortner
{

    private final static URLShortner instance = new URLShortner();

    public static URLShortner getInstance(){
        return instance ;
    }

    String base = "abcdecfghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYM0123456789";

    private final int LEN = 8 ;

    Map< String , String > shortTOLong = new HashMap<>();
    Map< String , String > longToShort = new HashMap<>();

    private String generateBase62String(){

        int sz = base.length();

        StringBuilder res = new StringBuilder() ;

        for( int i = 0 ; i < LEN ; i++ )
        {
            int min = 0 ;
            int max = sz-1 ;
            int index = (int)(Math.random() * (max - min + 1)) + min;
            res.append(base.charAt(index));
        }

        // collissons --> 8 --> 1/62 * 1/62 .... 1/62 -> 1/62^16 ---> 62^16 ----->  62^8 --> 1000
        if(shortTOLong.containsKey(res.toString()))
        {
            return generateBase62String();
        }

        //
        return res.toString();
    }

    public String shorten( String longUrl ){

        if( longToShort.containsKey(longUrl) ){

            System.out.println("this long url already exist in system : " + longUrl );

            // google.com , twixtter.com .///
            return longToShort.get(longUrl);
        }

        String shortUrl = generateBase62String();

//        System.out.println(shortUrl);

        // DB entry is done
        shortTOLong.put( shortUrl , longUrl );
        longToShort.put( longUrl , shortUrl );

        return shortUrl ;
    }

    public String getLongUrl( String shortUrl ){

        if( shortTOLong.containsKey(shortUrl) ){

            return shortTOLong.get(shortUrl);
        }

        System.out.println("No long URL exist for this shortUrl");

        return null ; // no entry
    }
}



public class Problem1 {


    public static void main( String args[] )
    {

        URLShortner urlShortner = URLShortner.getInstance();

        String LongURL1 = "google.com";
        String LongURL2 = "facebook.com";

        String shortUrl1 = urlShortner.shorten(LongURL1);
        String shortUrl2 = urlShortner.shorten(LongURL2);

        System.out.println(" shorted url of google.com is : " + shortUrl1 );
        System.out.println(" shorted url of facebook.com is : " + shortUrl2 );


        String shortUrl3 = urlShortner.shorten(LongURL1);

        System.out.println(" again shortning the google.com shorted url is " + shortUrl3);


    }
}

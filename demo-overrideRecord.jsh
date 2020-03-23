System.out.println("MVP Java - JDK 14 Records Demo - Override Record")

//customize/Override record

record Location (float latitude, float longitude){

    static float  DEFAULT_LATITUDE  = 0F;
    static float  DEFAULT_LONGITUDE = 0F;


    public Location // canonical constructor (don't put empty parenthesis!
    {
        if(latitude < -90 || latitude > 90){
            throw new IllegalArgumentException("Invalid latititude " + latitude);
        }
        // add longitude validation too ...
        // what is missing here? ... assignment done for us anyways!
    }
    
    public String toString()
    {
      return "lat = " + latitude + " long = " + longitude;
    }
    
    //can override hashCode .. etc ..
    
    public float getLatitude (){ 
        return latitude;
    }
    
    public float getLongitude (){ 
        return longitude;
    }
    
    //static factory
    public static Location of()
    {
        return new Location(DEFAULT_LATITUDE, DEFAULT_LONGITUDE);
    }

}



Location santaMaria  = new Location (36.947613F, -25.146546F);

System.out.println ("santaMaria.toString()  = " + santaMaria);
System.out.println ("santaMaria latititude  = " + santaMaria.getLatitude()); 
System.out.println ("santaMaria longitude   = " + santaMaria.getLongitude());

System.out.println ();

//Static Factory
Location defaultLocation = Location.of();
System.out.println ("defaultLocation.toString()  = " + defaultLocation);


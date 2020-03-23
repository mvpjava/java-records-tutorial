System.out.println("MVP Java - JDK 14 Records Demo")

record Location (float latitude, float longitude){}

Location santaMaria     = new Location (36.947613F, -25.146546F);
Location santaMariaCopy = new Location (36.947613F, -25.146546F);
Location india          = new Location (28.6139F  ,  77.2090F  );

System.out.println ("india.toString()       = " + india);
System.out.println ("santaMaria.toString()  = " + santaMaria);
System.out.println ("santaMaria latititude  = " + santaMaria.latitude()); //not getLatitude() !!
System.out.println ("santaMaria longitude   = " + santaMaria.longitude()); //not getLongitude() !!

System.out.println ();

System.out.println ("santaMaria.hashCode()             = " + santaMaria.hashCode());
System.out.println ("santaMariaCopy.hashCode()         = " + santaMariaCopy.hashCode());
System.out.println ("santaMaria.equals(santaMariaCopy) = " + santaMaria.equals(santaMariaCopy)); 
System.out.println ("santaMaria.equals(india)          = " + santaMaria.equals(india)); 

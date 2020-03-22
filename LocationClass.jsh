public class Location {

  private float latitude;
  private float longitude;

  public Location(float latitude, float longitude) {
    setLatitude(latitude);
    setLongitude(longitude);
  }


  public float getLatitude() {
    return latitude;
  }

  public float getLongitude() {
    return longitude;
  }

  public void setLongitude(float longitude) {
    this.longitude = longitude;
  }


  public void setLatitude(float latitude) {
    this.latitude = latitude;
  }


  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Location)) {
      return false;
    }

    final Location location = (Location) o;


    if (Float.compare(location.longitude, longitude) != 0) {
        return false;
    }
    
    return location.equals(longitude);
  }

  public int hashCode() {
    int result = 0;
    
    result = 29 * result + Float.floatToIntBits(latitude);
    result = 29 * result + Float.floatToIntBits(longitude);
    
    return result;
  }
  
  public String toString()
  {
      return "latitude =" + getLongitude() + " long = " + getLongitude();
  }
}


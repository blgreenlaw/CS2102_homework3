import tester.*;

class WeatherMonitor {
 private int month;
 private int year;
 private int highTemp;
 private int lowTemp;
  
  WeatherMonitor (int month, int year, int highTemp, int lowTemp) {
    this.month = month;
    this.year = year
    this.highTemp = highTemp;
    this.lowTemp = lowTemp;
  }
  
  public int averageHighForMonth (int month, int year) {
    return 2;
  }
  
  public int averageLowForMonth (int month, int year) {
    return 1;
  }
}
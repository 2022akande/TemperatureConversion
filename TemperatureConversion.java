/* Temperature Conversion
   Edward, Akande
*/

public class TemperatureConversion
{

public static void main(String [] args)
{
    Temperature temperature = new Temperature();

    double fTemp = 77.5;
    double cTemp = temperature.toCelcius(fTemp);
    System.out.println(fTemp + " Fahrenheit = " + cTemp + "Celcius.");

    cTemp = 37.2;
    fTemp = temperature.toFahrenheit(cTemp);
    System.out.println(cTemp + " Celcius = " + fTemp + " Fahrenheit.");
}

  public double toCelcius(double f) {
      double c;
      c = (f - 32.0) / 1.8;
      return c;
  }

  public double toFahrenheit (double c) {
      double f;
      f = (c * 1.8) + 32.0;
      return f;
  }

}
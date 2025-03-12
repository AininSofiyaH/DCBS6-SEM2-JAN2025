package averagegradescalc;
public class formula {
      public static double Average(double markah1, double markah2, double markah3) {
        return (markah1 + markah2 + markah3) / 3;
    }
      
      public double highestAvg(double x, double y, double z){
      return Math.max( x, Math.max( y , z ) );
      }

}

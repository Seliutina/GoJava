package Module04.Shapes.LineDistance;


public class distance extends main {
    double getDistance(pointOne a){
        double y1 = 5;
        double x1 = 7;
        return Math.sqrt(Math.pow(x1 - a.x1, 2) +Math.pow(y1-a.y1, 2));
    }
}

/**Author: Elizabeth Hayes*/
public class PointThreeD {
    private double xPoint;
    private double yPoint;
    private double zPoint;

    public PointThreeD(){
        xPoint = 0.0;
        yPoint = 0.0;
        zPoint = 0.0;
    }
    public PointThreeD(double xPoint, double yPoint, double zPoint){
        this.xPoint = xPoint;
        this.yPoint = yPoint;
        this.zPoint = zPoint;
    }
    public void setxPoint(double xPoint){
        this.xPoint = xPoint;
    }
    public double getxPoint(){
        return xPoint;
    }
    public void setyPoint(double yPoint){
        this.yPoint = yPoint;
    }
    public double getyPoint(){
        return yPoint;
    }
    public void setzPoint(double zPoint){
        this.zPoint = zPoint;
    }
    public double getzPoint(){
        return zPoint;
    }
    @Override
    public String toString(){
        return "PointThreeD [xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint + "]"; 
    }
}

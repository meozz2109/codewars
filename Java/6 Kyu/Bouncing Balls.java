public class BouncingBall {
	public static int bouncingBall(double h, double bounce, double window) {
    int count=1;
    if(h<=0||bounce<=0||bounce>=1||window>=h) return -1;
    double bounce1 = bounce*h;
    while(bounce1>window){
      bounce1*=bounce;
      count+=2;
    }
    return count;
	}
}
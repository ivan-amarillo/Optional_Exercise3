import java.util.Scanner;

class _3DPoint{
    private int x, y, z;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = this.x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public _3DPoint(){

    }

    public _3DPoint(int x, int y, int z) {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    @Override
    public String toString() {
        return " (" + x + ", " + y +
                ", " + z + ')';
    }

    public _3DPoint moveTo(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce the X: ");
        int x = sc.nextInt();
        System.out.println("Introduce the Y: ");
        int y = sc.nextInt();
        System.out.println("Introduce the Z: ");
        int z = sc.nextInt();

        _3DPoint p = new _3DPoint(x, y, z);
        return p;
    }

    public double distanceTo(_3DPoint p1 ,_3DPoint p2){
        return Math.sqrt(Math.pow((p1.x - p2.x),2) + Math.pow((p1.y - p2.y),2)
                + Math.pow((p1.z - p2.z), 2));
    }

    public static void main(String[] args){
        _3DPoint[] points = new _3DPoint[5];
        _3DPoint p = new _3DPoint();

        for(int i = 0; i < 5; i++){
            points[i] = p.moveTo();
        }

        for(int i = 1;i < 5; i++) {
            int resultX = points[0].getX() - points[i].getX();
            int resultY = points[0].getY() - points[i].getY();
            int resultZ = points[0].getZ() - points[i].getZ();

            System.out.println("The distance between" +
                    points[0] + " to " + points[i] + " is: "
                    + p.distanceTo(points[0], points[i]));
        }
    }
}

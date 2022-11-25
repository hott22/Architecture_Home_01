package modelelements;
public class Main {

    public static void main(String[] args) {
        Angle3D angle3D = new Angle3D(new Vector3D(new Point3D(0, 0, 1)), new Vector3D(new Point3D(1,0,0)));
        double a = angle3D.getAngle();
        System.out.println(a);

    }

  /*  this.angle = Math.acos((vector1.getPoint().getX() * vector2.getPoint().getX() +
            vector1.getPoint().getY() * vector2.getPoint().getY() +
            vector1.getPoint().getZ() * vector2.getPoint().getZ()) / Math.sqrt(Math.pow(vector1.getPoint().getX(), 2) +
            Math.pow(vector1.getPoint().getY(), 2) + Math.pow(vector1.getPoint().getZ(), 2))) *
            Math.sqrt(Math.pow(vector2.getPoint().getX(), 2) + Math.pow(vector2.getPoint().getY(), 2)
            + Math.pow(vector2.getPoint().getZ(), 2));*/


}

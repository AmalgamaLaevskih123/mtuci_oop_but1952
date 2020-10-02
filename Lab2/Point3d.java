public class Point3d {
    // Class description
    // Coordinates x, y, z
    private double xCoord, yCoord, zCoord;

    // Class contructor
    public Point3d(double x, double y, double z){
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    // Class contructor without arguments
    public Point3d(){
        this (0, 0, 0);
    }

    // Get x coordinate
    public double getX() {
        return xCoord;
    }

    // Get y coordinate
    public double getY() {
        return yCoord;
    }

    // Get z coordinate
    public double getZ() {
        return zCoord;
    }

    // Set x coordinate
    public void setX(double x) {
        xCoord = x;
    }

    // Set y coordinate
    public void setY(double y) {
        yCoord = y;
    }

    // Set z coordinate
    public void setZ(double z) {
        zCoord = z;
    }

    // Overriding method equals()
    public boolean equals(Point3d objPoint3d){
        double objx = objPoint3d.getX();
        double objy = objPoint3d.getY();
        double objz = objPoint3d.getZ();
        if ( (xCoord == objx) && (yCoord == objy) && (zCoord == objz)){
            return true;
        }
        return false;
    }

    // Getting distance between points
    public double distanseTo(Point3d objPoint3d) {
        double objx = objPoint3d.getX();
        double objy = objPoint3d.getY();
        double objz = objPoint3d.getZ();
        return Math.sqrt(Math.pow(objx - xCoord, 2) + Math.pow(objy - yCoord, 2) + Math.pow(objz - zCoord, 2));
    }
}

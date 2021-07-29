package com.company;

public class Point {

    private int x;
    private int y;

    public Point(){
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(){
        this.x = x;
    }

    public void setY(){
        this.y = y;
    }

    public double distance(){
//  d(A,B) = SQRT (xB - xA) * (xB - xA) + (yB - yA) * (yB - yA)
        double dist1= calculateDistance(0,this.x, 0, this.y);
        return dist1;
    }

    public double distance(int x, int y){
        double dist2 = calculateDistance(this.x, x, this.y,y);
        return dist2;
    }

    public double distance(Point point){
        double dist3 = calculateDistance(this.x, point.x, this.y, point.y);
        return dist3;
    }

    public double calculateDistance(int xA, int xB, int yA, int yB){
        double distance1 = (xB - xA) * (xB - xA) + (yB - yA) * (yB - yA);
        double finalDistance = Math.sqrt(distance1);
        return finalDistance;
    }

}

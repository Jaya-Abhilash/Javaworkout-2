package TilesEstimate;
public class Tile {
    private double edgeLength;
    Tile(double edgeLength){
        this.edgeLength=edgeLength;
    }

    public double getEdgeLength() {
        return this.edgeLength;
    }
    public double onePieceArea(){
        return this.edgeLength*this.edgeLength;
    }
}
class Floor {
    private double length;
    private double breadth;
    Floor(double length,double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    private double floorArea(){
        return length*breadth;
    }
    public int totalTiles(Tile tile){
        double totalTile=this.floorArea()/tile.onePieceArea();
        return (int) Math.round(totalTile);
    }
}
class Main {
    public static void main(String[] args) {
        Tile tile=new Tile(5.5);
        Floor floor = new Floor(6.3,15);
        System.out.println(floor.totalTiles(tile));
    }
}
package abstract_factory.houseSolutionTeacher_useThis.windows;


import abstract_factory.houseSolutionTeacher_useThis.walls.Wall;

public abstract class Window {

    protected String name;
    protected int price;
    private Wall wall;

    public void buildOnWall(Wall wall) {
        this.wall = wall;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}

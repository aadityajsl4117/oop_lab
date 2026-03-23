class Area {

    int area(int side) {
        return side * side;
    }

    int area(int length, int breadth) {
        return length * breadth;  
    }

    public static void main(String[] args) {
        Area a = new Area();

        System.out.println(a.area(4));       
        System.out.println(a.area(4, 5));  
    }
}
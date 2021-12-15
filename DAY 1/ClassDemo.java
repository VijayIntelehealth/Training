class Main {
    public static void main(String [] args) {
        
        Point p1 = new Point();
        p1.display();
        p1.setX(100);
        p1.setY(200);
        p1.display();


        System.out.println();

        Point p2 = p1;
        p2.display();
        p2.setY(3000);
        p2.setX(2000);
        p1.display();


        if(p1 == p2) {
            System.out.println("p1 and p2 referes same object...");
        }
        else {
            System.out.println("p1 and p2 referes diff object...");
        }

        System.out.println(p1 == p2);

    }
}

class Point {

    private int x;
    private int y;

    public Point() {
        x = 0; 
        y = 0;
    }

    public void setX(int val) {
        if(val >= 0) {
            x = val;
        }
    }

    public int getX() {
        return x;
    }

    public void setY(int val) {
        if(val < 0) {
            return;
        }

        y = val;
    }

    public int getY() {
        return y;
    }

    public void display() {
        System.out.println("x = " + x + " y = " + y);
    }
}



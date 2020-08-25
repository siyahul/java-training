import java.util.LinkedList;

public class Maze{

    static int[][] mazeArray ={
        {2,1,1,1},
        {0,0,1,1},
        {0,0,0,1}
    };

    static LinkedList<Position> path = new LinkedList<Position>();
    public static void main(final String[] args) {

        if (mazeSolver(new Position(0, 3))) {
            System.out.println("Maze Solved");
        } else {
            System.out.println("No Path");
        }
    }

    private static boolean mazeSolver(final Position p) {

        path.push(p);

        while (true) {
            final int x = path.peek().x;
            final int y = path.peek().y;
            mazeArray[y][x] = 0;
            // down
            if (isValid(y + 1, x)) {
                if (mazeArray[y + 1][x] == 2) {
                    System.out.println("Moved Down");
                    return true;
                } else if (mazeArray[y + 1][x] == 1) {
                    System.out.println("Moved Down");
                    path.push(new Position(y + 1, x));
                    continue;
                }
            }
            // left
            if (isValid(y, x - 1)) {
                if (mazeArray[y][x - 1] == 2) {
                    System.out.println("Moved Left");
                    return true;
                } else if (mazeArray[y][x - 1] == 1) {
                    System.out.println("Moved Left");
                    path.push(new Position(y, x - 1));
                    continue;
                }
            }

            // up
            if (isValid(y - 1, x)) {
                if (mazeArray[y - 1][x] == 2) {
                    System.out.println("Moved Up");
                    return true;
                } else if (mazeArray[y - 1][x] == 1) {
                    System.out.println("Moved Up");
                    path.push(new Position(y - 1, x));
                    continue;
                }
            }
            // right
            if (isValid(y, x + 1)) {
                if (mazeArray[y][x + 1] == 2) {
                    System.out.println("Moved Right");
                    return true;
                } else if (mazeArray[y][x + 1] == 1) {
                    System.out.println("Moved Right");
                    path.push(new Position(y, x + 1));
                    continue;
                }
            }
            path.pop();
            System.out.println("Moved Back");
            if (path.size() <= 0) {
                return false;
            }
        }
    }

    public static boolean isValid(final int y, final int x) {
        if(y>=mazeArray.length||y<0||x>=mazeArray[y].length||x<0){
            return false;
        }
        return true;    
    }
}

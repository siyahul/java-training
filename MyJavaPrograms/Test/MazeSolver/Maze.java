import java.util.ArrayList;
import java.util.LinkedList;

public class Maze{

    static ArrayList<Maz> mazes= new ArrayList<Maz>();
    
    
    public static void main(final String[] args) {
        Maz m = new Maz();
        Maz n = new Maz();
        int[][] maze1 ={
            {2,1,1,1},
            {0,0,1,1},
            {0,0,0,1}
        };
        m.maze=maze1;
        m.start=new Position(0, 3);
        m.path=new LinkedList<Position>();

        int[][] maze2 ={
            {0,1,1,1},
            {0,0,1,1},
            {2,1,1,1}
        };
        n.maze=maze2;
        n.start=new Position(0, 3);
        n.path=new LinkedList<Position>();
        
        mazes.add(m);
        mazes.add(n);
        int i=0;
        while(i<mazes.size()){
            if (mazeSolver(mazes.get(i))) {
                System.out.println("Maze Solved");
            } else {
                System.out.println("No path");
            }
            System.out.println();
            i++;
        }
    }

    private static boolean mazeSolver(Maz m) {
        Position p= m.start;
        m.path.push(p);

        while (true) {
            final int x = m.path.peek().x;
            final int y = m.path.peek().y;
            m.maze[y][x] = 0;
            // down
            if (isValid(y + 1, x,m)) {
                if (m.maze[y + 1][x] == 2) {
                    System.out.println("Moved Down");
                    return true;
                } else if (m.maze[y + 1][x] == 1) {
                    System.out.println("Moved Down");
                    m.path.push(new Position(y + 1, x));
                    continue;
                }
            }
            // left
            if (isValid(y, x - 1,m)) {
                if (m.maze[y][x - 1] == 2) {
                    System.out.println("Moved Left");
                    return true;
                } else if (m.maze[y][x - 1] == 1) {
                    System.out.println("Moved Left");
                    m.path.push(new Position(y, x - 1));
                    continue;
                }
            }

            // up
            if (isValid(y - 1, x,m)) {
                if (m.maze[y - 1][x] == 2) {
                    System.out.println("Moved Up");
                    return true;
                } else if (m.maze[y - 1][x] == 1) {
                    System.out.println("Moved Up");
                    m.path.push(new Position(y - 1, x));
                    continue;
                }
            }
            // right
            if (isValid(y, x + 1,m)) {
                if (m.maze[y][x + 1] == 2) {
                    System.out.println("Moved Right");
                    return true;
                } else if (m.maze[y][x + 1] == 1) {
                    System.out.println("Moved Right");
                    m.path.push(new Position(y, x + 1));
                    continue;
                }
            }
            m.path.pop();
            System.out.println("Moved Back");
            if (m.path.size() <= 0) {
                return false;
            }
        }
    }

    public static boolean isValid(final int y, final int x,Maz m) {
        if(y>=m.maze.length||y<0||x>=m.maze[y].length||x<0){
            return false;
        }
        return true;    
    }
}

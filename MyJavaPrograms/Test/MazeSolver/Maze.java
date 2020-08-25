import java.util.LinkedList;

public class Maze{

    static int[][] maze ={
        {2,1,1,1},
        {0,0,1,1},
        {0,0,0,1}
    };

    static LinkedList<Position> path = new LinkedList<Position>();
    public static void main(String[] args){
        
        Position p = new Position(0,3);
        path.push(p);
        

        while(true) {
            int x= path.peek().x;
            int y= path.peek().y;
            maze[y][x]=0;
            //down
            if(isValid(y+1,x)){
                if(maze[y+1][x]==2){
                    System.out.println("Moved Down. You Won!");
                    return;
                }
                else if(maze[y+1][x]==1){
                    System.out.println("Moved Down");
                    path.push(new Position(y+1,x));
                    continue;
                }
            }
            //left
            if(isValid(y,x-1)){
                if(maze[y][x-1]==2){
                    System.out.println("Moved Left. You Won!");
                    return;
                }
                else if(maze[y][x-1]==1){
                    System.out.println("Moved Left");
                    path.push(new Position(y,x-1));
                    continue;
                }
            }
            
            //up
            if(isValid(y-1,x)){
                if(maze[y-1][x]==2){
                    System.out.println("Moved Up. You Won!");
                    return;
                }
                else if(maze[y-1][x]==1){
                    System.out.println("Moved Up");
                    path.push(new Position(y-1,x));
                    continue;
                }
            }
            //right
            if(isValid(y,x+1)){
                if(maze[y][x+1]==2){
                    System.out.println("Moved Right. You Won!");
                    return;
                }
                else if(maze[y][x+1]==1){
                    System.out.println("Moved Right");
                    path.push(new Position(y,x+1));
                    continue;
                }
            }
            path.pop();
            System.out.println("Moved Back");
            if(path.size()<=0){
                System.out.println("No Path");
                return;
            }

        }

        
        

    }
    public static boolean isValid(int y,int x) {
        if(y>=maze.length||y<0||x>=maze[y].length||x<0){
            return false;
        }
        return true;    
    }

}

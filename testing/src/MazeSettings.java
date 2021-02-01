import java.util.ArrayList;

public interface MazeSettings {
    /**
     * Get the height and width from params
     * Build an arraylist made from x width, and y height.
     * @param height
     * @param width
     * @return
     */
    default ArrayList<?> makeMaze(int height, int width){
        ArrayList<ArrayList<?>> maze = new ArrayList<>();
        for (int y = 0; y < height; y++){
            ArrayList<String> row = new ArrayList<>();
            for (int x = 0; x<width; x++){
                row.add(" . ");
            }
            maze.add(row);
        }
        return maze;
    }


    default String[][] printMaze(ArrayList<?> maze){
        String s = "";
        for (int x = 0; x < maze.size(); x++){
            System.out.println(maze.get(x));
        }

        return null;
    }
}

public class Main implements MazeSettings{
    public static void main(String[] args) {
        Main main = new Main();

        System.out.println(main.makeMaze(2, 5));
        main.printMaze(main.makeMaze(2, 5));
    }
}

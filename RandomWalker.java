public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0, y = 0;
        int steps = 0;
        
        System.out.println("(" + x + ", " + y + ")");
        
        while (Math.abs(x) + Math.abs(y) < r) {
            double random = Math.random();
            if (random < 0.25) {       // north
                y++;
            } else if (random < 0.5) { // east
                x++;
            } else if (random < 0.75) { // south
                y--;
            } else {                   // west
                x--;
            }
            steps++;
            System.out.println("(" + x + ", " + y + ")");
        }
        
        System.out.println("steps = " + steps);
    }
}
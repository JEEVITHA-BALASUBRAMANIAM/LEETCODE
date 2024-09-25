class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<String> visited = new HashSet<>();
        int x = 0, y = 0;
        visited.add("0,0");
        for (char direction : path.toCharArray()) {
            if (direction == 'N') y++;
            else if (direction == 'S') 
                  y--;
            else if (direction == 'E') 
                  x++;
            else if (direction == 'W') 
                  x--;
            String currentPos = x + "," + y;
            if (visited.contains(currentPos)) {
                return true;
            }
            visited.add(currentPos);
        }

        return false;
    }
}
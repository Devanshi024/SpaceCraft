import java.util.*;
class spacecraft {
    private int x = 0;
    private int y = 0;
    private int z = 0;
    private char prev = 'o';
    private char dir;

    public spacecraft(int x, int y, int z, char dir) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.dir = dir;
    }

    public char getdir() {
        if (this.prev != 'o') {
            return this.prev;
        }
        return this.dir;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getZ() {
        return this.z;
    }

    public void move_craft(char c) {

        char dir = this.prev == 'U' || this.prev == 'D' ? this.prev : this.dir;

        if ((dir == 'N' || dir == 'S') && c == 'f') {
            this.y++;
        } else if ((dir == 'N' || dir == 'S') && c == 'b') {
            this.y--;
        } else if ((dir == 'E' || dir == 'W') && c == 'f') {
            this.x++;
        } else if ((dir == 'E' || dir == 'W') && c == 'b') {
            this.x--;
        } else if ((dir == 'U' || dir == 'D') && c == 'f') {
            this.z++;
        } else if ((dir == 'U' || dir == 'D') && c == 'b') {
            this.z--;
        }
    }

    public void change(char c) {

        if ((dir == 'N' && c == 'r') || (dir == 'S' && c == 'l')) {
            this.prev = 'o';
            this.dir = 'E';
        } else if ((dir == 'N' && c == 'l') || (dir == 'S' && c == 'r')) {
            this.prev = 'o';
            this.dir = 'W';
        } else if ((dir == 'E' && c == 'l') || (dir == 'W' && c == 'r')) {
            this.prev = 'o';
            this.dir = 'N';
        } else if ((dir == 'W' && c == 'l') || (dir == 'E' && c == 'r')) {
            this.prev = 'o';
            this.dir = 'S';
        }

        if (c == 'u' || c == 'd') {
            // this.prev = this.dir;
            this.prev = c == 'u' ? 'U' : 'D';
        }
    }

    public void sendorders(char[] orders) {
        for (char ch : orders) {
            if (ch == 'f' || ch == 'b') {
                this.move_craft(ch);
            } else {
                this.change(ch);
            }
        }
    }
}

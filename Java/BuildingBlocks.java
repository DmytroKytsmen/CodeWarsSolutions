public class Block {
    public int width;
    public int length;
    public int height;

    Block(int[] args) {
        this.width = args[0];
        this.length = args[1];
        this.height = args[2];
    }

    public int getWidth() {
        return this.width;
    }

    public int getLength() {
        return this.length;
    }

    public int getHeight() {
        return this.height;
    }

    public int getVolume() {
        return width * height * length;
    }

    public int getSurfaceArea() {
        return 2 * (width * length + length * height + height * width);
    }
}
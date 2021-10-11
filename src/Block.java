public class Block{
    private int width;
    private int length;
    private int height;
    int[] arr = {width, length, height};

    public Block(int[] arr) {
        this.arr = arr;
    }
    public int getWidth() {
        return arr[0];
    }
    public int getLength() {
        return arr[1];
    }
    public int getHeight() {
        return arr[2];
    }
   /* public int getVolume(){
        return arr[0]*arr[1]*arr[2];
    }
    public int getSurfaceArea(){
        return 2*arr[0]*arr[1] + 2*arr[0]*arr[2] + 2*arr[1]*arr[2];
    }*/
}

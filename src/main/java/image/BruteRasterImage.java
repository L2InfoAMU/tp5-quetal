package image;

import javafx.scene.paint.Color;
import util.Matrices;

public class BruteRasterImage implements Image {
    private Color[][] colors;
    private int width;
    private int height;

    public BruteRasterImage(Color color, int width, int height) {
        this.width = width;
        this.height = height;
        colors = new Color[width][height];
        for (int widthImage = 0; widthImage < width; widthImage++) {
            for (int heightImage = 0; heightImage < height; heightImage++) {
                this.colors[heightImage][widthImage] = color;
            }
        }
    }

    public BruteRasterImage(Color[][] colors) {
        Matrices.requiresNonNull(colors);
        Matrices.requiresNonZeroDimensions(colors);
        this.colors = colors;

    }


    @Override
    public Color getPixelColor(int x, int y) {
        return colors[x][y];
    }

    @Override
    public int getHeight() {
        return colors.length;
    }

    @Override
    public int getWidth() {
        return colors[0].length;
    }

    public void createRepresentation() {
        this.colors = colors;
    }

    public void setPixelsColor(Color[][] pixels) {

    }
    protected void setWidth(int width){
        this.width=width;

    }
    protected void setHeight(int height){
        this.height=height;

    }
}

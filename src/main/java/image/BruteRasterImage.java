package image;

import javafx.scene.paint.Color;
import util.Matrices;

public class BruteRasterImage implements Image {
    private Color[][] colors;
    private int width;
    private int height;

    public  BruteRasterImage (Color color,int width,int height){
        this.width=width;
        this.height=height;
        for (int matriceWidth=0;matriceWidth<width;matriceWidth++)
            for(int matriceHeight=0;matriceHeight<height;matriceHeight++)
                this.colors[matriceHeight][matriceHeight]=color;
    }
    public BruteRasterImage(Color[][] colors){
        this.colors=colors;

    }

    @Override
    public Color getPixelColor(int x, int y) {
        return null;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public int getWidth() {
        return 0;
    }
}

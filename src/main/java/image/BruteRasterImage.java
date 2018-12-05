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
        colors = new Color[width][height];
        for(int widthImage=0; widthImage < width ; widthImage++) {
            for (int heightImage = 0; heightImage < height; heightImage++){
                this.colors[heightImage][widthImage] = color;}
        }}
        public BruteRasterImage(Color[][] colors){
            Matrices.requiresNonNull(colors);
            Matrices.requiresNonZeroDimensions(colors);
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
    }}

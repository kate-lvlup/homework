// Napisat' class Box s parametrami vusota, dlina, shirina, napisat' metodu polycheniya i zadaniya etih parametrov
// i method vuchesleniya ob'ema figyru.

public class Box {
    double height;
    double length;
    double width;
    double volume;

    public double setHeight(double height) {
        return this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double setLength(double length) {
        return this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double setWidth(double width) {
        return this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double calcVolume() {
        return this.volume = height * length * width;
    }
}


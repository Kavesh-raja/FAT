public class Q13 {
    private int red;
    private int green;
    private int blue;

    public Q13(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public float calculateHue() {
        float hue;

        float r = red / 255.0f;
        float g = green / 255.0f;
        float b = blue / 255.0f;

        float max = Math.max(r, Math.max(g, b));
        float min = Math.min(r, Math.min(g, b));

        if (max == min) {
            hue = 0;
        } else {
            float delta = max - min;

            if (max == r) {
                hue = (g - b) / delta;
            } else if (max == g) {
                hue = 2 + (b - r) / delta;
            } else {
                hue = 4 + (r - g) / delta;
            }

            hue *= 60;

            if (hue < 0) {
                hue += 360;
            }
        }

        return hue;
    }

    public float calculateSaturation() {
        float saturation;

        float r = red / 255.0f;
        float g = green / 255.0f;
        float b = blue / 255.0f;

        float max = Math.max(r, Math.max(g, b));
        float min = Math.min(r, Math.min(g, b));

        if (max == 0) {
            saturation = 0;
        } else {
            saturation = (max - min) / max;
        }

        return saturation;
    }

    public float calculateBrightness() {
        float r = red / 255.0f;
        float g = green / 255.0f;
        float b = blue / 255.0f;

        return Math.max(r, Math.max(g, b));
    }

    public static void main(String[] args) {
        Q13 color = new Q13(193, 255, 183);

        float hue = color.calculateHue();
        float saturation = color.calculateSaturation();
        float brightness = color.calculateBrightness();

        System.out.println("Hue: " + hue);
        System.out.println("Saturation: " + saturation);
        System.out.println("Brightness: " + brightness);
    }
}

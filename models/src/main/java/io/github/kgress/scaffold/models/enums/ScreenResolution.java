package io.github.kgress.scaffold.models.enums;

/**
 * This enum provides screen resolution choices that are most commonly accepted by browser. This is not an all inclusive
 * list and additional resolutions can be added later to support other devices.
 */
public enum ScreenResolution {

    SIZE_800x600(800, 600),
    SIZE_1024x1080(1024, 1080),
    SIZE_1152x864(1152, 864),
    SIZE_1280x960(1280, 960),
    SIZE_1376x1032(1376, 1032),
    SIZE_1600x1200(1600, 1200),
    SIZE_1920x1440(1920, 1440),
    SIZE_2048x1536(2048, 1536);

    private final int width;
    private final int height;

    ScreenResolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getScreenShotResolutionAsString(ScreenResolutionType resolutionType) {
        var widthAsString = String.valueOf(getWidth());
        var heightAsString = String.valueOf(getHeight());
        return String.format(resolutionType.getStringFormat(), widthAsString, heightAsString);
    }

    public enum ScreenResolutionType {
        SELENIUM("selenium", "%s,%s"),
        SAUCELABS("sauce", "%sx%s");

        private final String resolutionType;
        private final String stringFormat;

        ScreenResolutionType(String resolutionType, String stringFormat) {
            this.resolutionType = resolutionType;
            this.stringFormat = stringFormat;
        }

        public String getResolutionType() {
            return resolutionType;
        }

        public String getStringFormat() {
            return stringFormat;
        }
    }
}

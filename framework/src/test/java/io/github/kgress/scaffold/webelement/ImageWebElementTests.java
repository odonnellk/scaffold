package io.github.kgress.scaffold.webelement;

import io.github.kgress.scaffold.BaseUnitTest;
import io.github.kgress.scaffold.webelements.ImageWebElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImageWebElementTests extends BaseUnitTest {

    @Test
    public void testGetImageSource() {
        var srcTxt = "http://coolwebsite.com";

        mockElement1.setAttribute("src", srcTxt);
        var image = new ImageWebElement(mockElement1);
        assertEquals(srcTxt, image.getImageSource() );
    }
}

package helpers;

/**
 * Created by admin on 11/15/2018.
 */
public interface Environment {
    public static final String DOMAIN =  "http://ec2-34-235-10-165.compute-1.amazonaws.com";

    public final String PRODUCTS_PAGE = "/Products";
    public final String SHAPES_PAGE = "/Shapes";

    public final String IMAGE_URL = "C:\\Work\\IRoofing\\BackendTestingProject\\firsttest\\src\\main\\resources\\Image.jpg";
//    public final String IMAGE_URL = "src/main/resources/Image.jpg";

    //Initial environment
    public static final String DEFAULT_SHAPE_ID = "1534";
    public static final String DEFAULT_SHAPE_NAME = "Default Shape";

    public static final String AUTO_TEST_SHAPE_NAME = "AutoTestShape";
    public static final String AUTO_TEST_MODIFIED_SHAPE_NAME = "AutoTestModifiedShape";

    public static final String DEFAULT_TEST_MANUFACTURER_ID =  "/10052";






}

package helpers;

/**
 * Created by admin on 11/15/2018.
 */
public interface Environment {
    public static final String DOMAIN =  "http://ec2-34-235-10-165.compute-1.amazonaws.com";

    public static final String PRODUCTS_PAGE = "/Products";
    public static final String SHAPES_PAGE = "/Shapes";

    public static final String CONTRACTORS_PAGE = "/Contractors";
    public static final String DISTRIBUTOR_PAGE = "/Distributors";
    public static final String MANUFACTURER_PAGE = "/Manufacturers";

    public static final String ADD_CONTRACTORS_PAGE = "/Contractors/create";
    public static final String ADD_DISTRIBUTOR_PAGE = "/Distributors/create";
    public static final String ADD_MANUFACTURER_PAGE = "/Manufacturers/create";


    public final String IMAGE_URL = "D:\\Work\\IRoofing\\BackendTestingProject\\firsttest\\src\\main\\resources\\Image.jpg";
//    public final String IMAGE_URL = "src/main/resources/Image.jpg";

    //Initial environment
    public static final String DEFAULT_SHAPE_ID = "1534";
    public static final String DEFAULT_SHAPE_NAME = "Default Shape";

    // Nest objects name
    public static final String AUTO_TEST_SHAPE_NAME = "AutoTestShape";

    public static final String CONTRACTOR_TEST_NAME = "AutoTestContractor";
    public static final String DISTRIBUTOR_TEST_NAME = "AutoTestDistributor";
    public static final String MANUFACTURER_TEST_NAME = "AutoTestManufacturer";


    public static final String AUTO_TEST_MODIFIED_SHAPE_NAME = "AutoTestModifiedShape";

    public static final String DEFAULT_TEST_MANUFACTURER_ID =  "/10052";






}

package com.restful.booker.testbase;

import com.restful.booker.constants.Path;
import com.restful.booker.utils.PropertyReader;
import com.restful.booker.utils.PropertyReader;
import com.restful.booker.utils.TestUtils;
import io.restassured.RestAssured;
import org.junit.BeforeClass;

import static org.aspectj.weaver.tools.cache.SimpleCacheFactory.path;

public class TerstBase extends TestUtils {
    public static PropertyReader propertyReader;

    @BeforeClass
    public static void init() {
        propertyReader = PropertyReader.getInstance();
        RestAssured.baseURI = propertyReader.getProperty("baseUrl");
      //  RestAssured.port = Integer.parseInt(propertyReader.getProperty("port"));
       // RestAssured.basePath = Path.BOOKING ;
    }
}

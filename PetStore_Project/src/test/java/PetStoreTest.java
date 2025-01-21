import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class PetStoreTest {

    @Test
    public void PostPet() {
        String bodyPayload = "{\n" +
                "    \"id\": 98745,\n" +
                "    \"category\": {\n" +
                "        \"id\": 3214,\n" +
                "        \"name\": \"Lion\"\n" +
                "    },\n" +
                "    \"name\": \"barbar\",\n" +
                "    \"photoUrls\": [\n" +
                "        \"urlLinkiburada\"\n" +
                "    ],\n" +
                "    \"tags\": [\n" +
                "        {\n" +
                "            \"id\": 2314,\n" +
                "            \"name\": \"Lion\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"status\": \"available\"\n" +
                "}";

        RestAssured.given().body(bodyPayload).contentType(ContentType.JSON).when().post("https://petstore.swagger.io/v2/pet");
    }

    @Test
    public void GetPet() {
        RestAssured.given().contentType(ContentType.JSON).when().get("https://petstore.swagger.io/v2/pet/98745");
    }

    @Test
    public void UpdatePet() {
        String bodyPayload = "{\n" +
                "    \"id\": 98745,\n" +
                "    \"category\": {\n" +
                "        \"id\": 3214,\n" +
                "        \"name\": \"Lion\"\n" +
                "    },\n" +
                "    \"name\": \"savasci\",\n" +
                "    \"photoUrls\": [\n" +
                "        \"urlLinkiburada\"\n" +
                "    ],\n" +
                "    \"tags\": [\n" +
                "        {\n" +
                "            \"id\": 2314,\n" +
                "            \"name\": \"Lion\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"status\": \"available\"\n" +
                "}";

        RestAssured.given().body(bodyPayload).contentType(ContentType.JSON).when().put("https://petstore.swagger.io/v2/pet");
    }

    @Test
    public void DeleteUser() {
        RestAssured.given().contentType(ContentType.JSON).when().delete("https://petstore.swagger.io/v2/pet/98745");
    }
}

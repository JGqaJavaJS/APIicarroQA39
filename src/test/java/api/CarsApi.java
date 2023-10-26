package api;

import com.jayway.restassured.response.Response;
import dto.AddNewCarDto;
import dto.UserDto;

import static com.jayway.restassured.RestAssured.given;

public class CarsApi extends BaseApi{

    Response responseCreateNewCar = null;

    private Response addNewCarRequest(AddNewCarDto addNewCarDto, String token) {
        return given()
                .header("Authorization", token)
                .body(addNewCarDto)
                .when()
                .post(baseUrl + "/v1/cars").thenReturn();
    }

    public int getStatusCodeCreateNewCar(AddNewCarDto addNewCarDto, String token) {
        if(responseCreateNewCar == null) {
            responseCreateNewCar = addNewCarRequest(addNewCarDto, token);
        }
        return responseCreateNewCar.getStatusCode();
    }

    public void setResponseCreateNewCarNull() {
        responseCreateNewCar = null;
    }
}

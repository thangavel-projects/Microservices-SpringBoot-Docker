package com.sample.swimming.pool.reservation.api;

import org.junit.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;

public class ReservationControllerTest {

	@Test
	public void testStatusCode() {
		
		given()
		.when()
			.get("http://localhost:8181/rest/reservation/all")
		.then()
			.assertThat()
			.statusCode(200)
			.and()
			.contentType(ContentType.JSON);
	}
	
	/*@Test
	public void testFirstName() {
		given()
		.when()
			.get("http://localhost:8181/rest/reservation/all")
		.then()
			.assertThat()
			.body("firsName", equalt("Thangavel"));
	}*/

}

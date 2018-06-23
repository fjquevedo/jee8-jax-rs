package es.fjqueal.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import es.fjqueal.rest.model.User;

public class RestEasyClient {

	public static void main(String[] args) {

		// Client client = ClientBuilder.newBuilder().build();
		//
		// WebTarget target =
		// client.target("http://localhost:8080/resteasy-clients/rest/user/users/10");
		//
		// Response response = target.request().get();
		//
		// // First validate the api status code
		// int apiResponseCode = response.getStatusInfo().getStatusCode();
		// if (apiResponseCode != 200) {
		// throw new RuntimeException("Failed with HTTP error code : " +
		// apiResponseCode);
		// }
		//
		// User user = response.readEntity(User.class);
		//
		// // verify the user object
		// System.out.println(user.getId());
		// System.out.println(user.getFirstName());
		// System.out.println(user.getLastName());
		//
		// response.close(); // You should close connections!

	}
}

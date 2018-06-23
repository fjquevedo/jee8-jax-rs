package es.fjqueal.rest.srv;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import es.fjqueal.rest.model.User;

@Path("/user")
public class UserSrv {
	@GET
	@Path("/users/{id}")
	@Produces("application/xml")
	public Response getUserById(@PathParam("id") Integer id) {
		User user = new User();
		user.setId(id);
		user.setFirstName("Lokesh");
		user.setLastName("Gupta");
		return Response.status(200).entity(user).build();
	}
}
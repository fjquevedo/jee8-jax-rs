package es.fjqueal;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("/library")
public class Library {

   @GET
   @Path("/books")
   public String getBooks() {
	   return "";
   }

   @GET
   @Path("/book/{isbn}")
   public String getBook(@PathParam("isbn") String id) {
      // search my database and get a string representation and return it
	   return "";
   }

   @PUT
   @Path("/book/{isbn}")
   public void addBook(@PathParam("isbn") String id, @QueryParam("name") String name) {
   }

   @DELETE
   @Path("/book/{id}")
   public void removeBook(@PathParam("id") String id) {

   }
   
}
package infrastructure.adapter.input.web;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import lombok.extern.slf4j.Slf4j;
import org.jboss.resteasy.reactive.RestResponse;

@Slf4j
@Path("/notes")
public class NotesResouces {

    @POST
    @Path("/create")
    public RestResponse<String> create() {
        System.out.println("creating resouces");
        return RestResponse.ok("created");
    }

}

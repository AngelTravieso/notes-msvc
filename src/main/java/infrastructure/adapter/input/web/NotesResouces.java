package infrastructure.adapter.input.web;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Path("/api/notes")
public class NotesResouces {

    @POST
    @Path("/create")
    public void create() {
        System.out.println("creating resouces");
    }

}

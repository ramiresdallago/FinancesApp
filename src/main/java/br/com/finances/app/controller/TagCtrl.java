package br.com.finances.app.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.finances.app.model.Tag;
import br.com.finances.app.service.TagService;

@Path("/tag")
public class TagCtrl {

	private TagService tagService = new TagService();
	
	@POST
	@Path("/register")
	@Consumes(MediaType.APPLICATION_JSON)
	public String registerTag(Tag tag) {
		if(tagService.registerTag(tag)) {
			return "Tag cadastrada com sucesso!";
		}
		return "Tag já cadastrada!";
	}
	
	@GET
	@Path("/find/{idTag}")
	@Produces(MediaType.APPLICATION_JSON)
	public Tag findTag(@PathParam("idTag") Integer idTag) {	
		return tagService.findTagById(idTag);
	}
	
	@PUT
	@Path("/edit")
    @Consumes(MediaType.APPLICATION_JSON)
	public String editTag(Tag tag) {
		if(tagService.updateTag(tag)) {
			return "Tag alterada com sucesso!";
		}
		
		return "Erro ao alterar a tag!";
		
	}
	
	@DELETE
	@Path("/delete/{idTag}")
	public String deleteTag(@PathParam("idTag") Integer idTag) {
		tagService.deleteTag(idTag);
		return "Tag foi excluída com sucesso!";
	}
}

package br.com.finances.app.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.finances.app.model.Spent;
import br.com.finances.app.service.SpentService;

@Path("/spent")
public class SpentCtrl {

	private SpentService spentService = new SpentService();
	
	@POST
	@Path("/register")
    @Consumes(MediaType.APPLICATION_JSON)
	public String registerSpent(Spent spent) {
		if(spentService.registerSpent(spent)) {
			return "Conta inserida com sucesso!";
		}
		return "Erro ao inserir conta!";
	}
	
	@GET
	@Path("/find/{idSpent}")
	@Produces(MediaType.APPLICATION_JSON)
	public Spent findSpent(@PathParam("idSpent") Integer idSpent) {
		return spentService.findSpentById(idSpent);
	}
	
	@GET
	@Path("/findAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Spent> findAllSpents() {
		return spentService.getAllSpents();
	}
	
	@PUT
	@Path("/edit")
    @Consumes(MediaType.APPLICATION_JSON)
	public String editSpent(Spent spent) {
		if(spentService.updateSpent(spent)) {
			return "Conta alterada com sucesso!";
		}
		return "Erro ao alterar a conta!";
	}
	
	@DELETE
	@Path("/delete/{idSpent}")
	public String deleteSpent(@PathParam("idSpent") Integer idSpent) {
		spentService.deleteSpent(idSpent);
		return "Conta excluída com sucesso!";
	}
}

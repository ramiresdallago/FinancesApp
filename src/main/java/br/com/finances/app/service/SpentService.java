package br.com.finances.app.service;

import java.util.ArrayList;
import java.util.List;

import br.com.finances.app.model.Spent;

public class SpentService {

	private List<Spent> spents = new ArrayList<Spent>();

	public boolean registerSpent(Spent spent) {
		if(camposForamPreenchidos(spent)) {
			if(spents == null || spents.isEmpty()) {
				spent.setId(1);
			} else {
				defineIdSpent(spent);
			}
			spents.add(spent);
			return true;
		}
		
		return false;
	}

	private void defineIdSpent(Spent spentInsert) {
		Spent lastSpent = null;
		for (Spent spent : spents) {
			lastSpent = spent;
		}
		spentInsert.setId(lastSpent.getId()+1);
	}

	private boolean camposForamPreenchidos(Spent spent) {
		return !spent.getData().isEmpty() && !spent.getDescricao().isEmpty()
			&& spent.getValor() != null && spent.getTag() != null;
	}

	public Spent findSpentById(Integer idSpent) {
		for (Spent spent : spents) {
			if(spent.getId() == idSpent) {
				return spent;
			}
		}
		return new Spent();
	}

	public List<Spent> getAllSpents() {
		if(spents == null) {
			return new ArrayList<Spent>();
		}
		return spents;
	}

	public boolean updateSpent(Spent spentUpdate) {
		for (Spent spent : spents) {
			if(spent.getId() == spentUpdate.getId()) {
				spent.setData(spentUpdate.getData());
				spent.setDescricao(spentUpdate.getDescricao());
				spent.setTag(spentUpdate.getTag());
				spent.setValor(spentUpdate.getValor());
				return true;
			}
		}
		return false;
	}

	public void deleteSpent(Integer idSpent) {
		Spent spent = findSpentById(idSpent);
		spents.remove(spent);
	}
	
	
}

package br.com.finances.app.service;

import java.util.ArrayList;
import java.util.List;

import br.com.finances.app.model.Tag;

public class TagService {

	private static List<Tag> tags = new ArrayList<Tag>();

	public boolean registerTag(Tag tagInsert) {
		if(tags != null && !tags.isEmpty()) {
			for (Tag tag : tags) {
				if(tagInsert.getDescricao().equals(tag.getDescricao())) {
					return false;
				}
			}
			defineIdTag(tagInsert);
		}else{
			tagInsert.setId(1);
		}
		
		tags.add(tagInsert);
		return true;
	}

	private void defineIdTag(Tag tagInsert) {
		Tag lastTag = null;
		for (Tag tag : tags) {
			lastTag = tag;
		}
		tagInsert.setId(lastTag.getId()+1);
	}

	public Tag findTagById(Integer idTag) {
		for (Tag tag : tags) {
			if(tag.getId().equals(idTag)) {
				return tag;
			}
		}
		return new Tag();
	}

	public boolean updateTag(Tag tagUpdate) {
		for (Tag tag : tags) {
			if(tag.getId() == tagUpdate.getId()) {
				tag.setDescricao(tagUpdate.getDescricao());
				return true;
			}
		}
		return false;
	}

	public void deleteTag(Integer idTag) {
		Tag tag = findTagById(idTag);
		tags.remove(tag);
	}

}

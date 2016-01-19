package persistence;

import domain.Skill;
import exceptions.PersistenceFailureException;

public interface SkillMapper {

	public void createSkill(Skill skill,DataAcces da) throws PersistenceFailureException;
	
	public void deleteSkill(Skill skill, DataAcces da) throws PersistenceFailureException;
	
	public void updateSkill(Skill skill,DataAcces da) throws PersistenceFailureException;
		
}

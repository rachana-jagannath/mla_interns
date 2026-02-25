package com.test.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.dao.MLATeamDAO1;
import com.test.dao.MLATeamDao;
import com.test.model.MLATeam;

public class TestDemo {
	public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
	MLATeamDao dao=ctx.getBean("tdao",MLATeamDao.class);
	MLATeamDAO1 dao1 =ctx.getBean("tdao1",MLATeamDAO1.class);
	MLATeam obj=new MLATeam();
	obj.setId(301);
	obj.setName("Kohli");
	obj.setSkill("Cloud developer");
	obj.setManager("Anushka");
	dao1.createMLATeam(obj);
//	dao.deleteMLATeam(obj);
//	dao.saveMLATeam(obj);
	//dao.updateMLATeam(obj);
	List<MLATeam> list=dao.getAllMembers();
	list.forEach(team ->
		System.out.println(team.getId()+" "+team.getName()+ " "+team.getSkill()+" "+team.getManager()));
	}
}

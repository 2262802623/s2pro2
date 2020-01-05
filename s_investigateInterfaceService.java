package sInvestigateService;

import java.util.List;

import sInvestigateEntity.s_investigate;
import sInvestigateService.s_investigateInterfaceService;

public interface s_investigateInterfaceService {
	public int AddShow(s_investigate si);
	public List<s_investigate>fuzzySelect(String name);
	public int deIShow(int id);
	public s_investigate selectByid(int id);
	public int updateShow(s_investigate si);
}

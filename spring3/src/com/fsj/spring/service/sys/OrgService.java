package com.fsj.spring.service.sys;

import java.util.List;
import java.util.Map;

import com.fsj.spring.model.sys.SysOrg;
import com.fsj.spring.util.DataGridModel;

public interface OrgService {
	SysOrg getOrgById(int id) throws Exception;
	SysOrg getOrgByName(String name) throws Exception;
	Map<String, Object> getPageListByExemple(DataGridModel dgm,SysOrg org) throws Exception;
	Map<String, Object> getPageList(DataGridModel dgm,SysOrg org) throws Exception;
	void addOrUpdate(SysOrg org) throws Exception;
	void deleteOrgs(List<Integer> orgsId) throws Exception;
}

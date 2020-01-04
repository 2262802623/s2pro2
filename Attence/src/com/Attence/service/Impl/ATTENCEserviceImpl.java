package com.Attence.service.Impl;

import java.util.List;

import com.Attence.dao.ATTENCEdao;
import com.Attence.dao.Impl.ATTENCEdaoImpl;
import com.Attence.entity.ATTENCE;
import com.Attence.service.ATTENCEservice;

public class ATTENCEserviceImpl implements ATTENCEservice {

	ATTENCEdao dao = new ATTENCEdaoImpl();
	
	@Override
	public List<ATTENCE> getShow() {
		// TODO 自动生成的方法存根
		return dao.getShow();
	}

	@Override
	public int getadd(ATTENCE attence) {
		// TODO 自动生成的方法存根
		return dao.getadd(attence);
	}

	@Override
	public int getmodification(ATTENCE attence) {
		// TODO 自动生成的方法存根
		return dao.getmodification(attence);
	}

	@Override
	public int delete(int ID) {
		// TODO 自动生成的方法存根
		return dao.delete(ID);
	}

	@Override
	public ATTENCE transfer(int ID) {
		// TODO 自动生成的方法存根
		return dao.transfer(ID);
	}

}

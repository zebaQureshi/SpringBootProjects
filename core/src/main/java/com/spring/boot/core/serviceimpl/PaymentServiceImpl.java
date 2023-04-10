package com.spring.boot.core.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.core.dao.PaymentDao;
import com.spring.boot.core.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService{
	
	@Autowired
	private PaymentDao dao;

	public PaymentDao getDao() {
		return dao;
	}

	public void setDao(PaymentDao dao) {
		this.dao = dao;
	}

	@Override
	public void checkDao() {
		System.out.println("In check dao method:, dao hashcode is:"+dao.hashCode());
		
	}
	

}

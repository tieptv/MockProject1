package com.cmc.mockproject1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmc.mockproject1.entity.WhyCMC;
import com.cmc.mockproject1.repository.WhyCMCRepository;
import com.cmc.mockproject1.service.WhyCMCService;

@Service
public class WhyCMCServiceImpl implements WhyCMCService {

	@Autowired
	WhyCMCRepository repo;
	@Override
	public List<WhyCMC> getdAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(WhyCMC w) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(WhyCMC w) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String w) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<WhyCMC> search(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WhyCMC> getSlogan() {
        List<WhyCMC> list=repo.findTop5ByTypeAndIsShow("slogan",true);
		return list;
	}

	@Override
	public WhyCMC getVideo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WhyCMC getTitle() {
		WhyCMC title=repo.findTop1ByTypeAndIsShow("title",true);
		return title;
	}

	@Override
	public WhyCMC getButtonContent() {
		// TODO Auto-generated method stub
		return null;
	}

}

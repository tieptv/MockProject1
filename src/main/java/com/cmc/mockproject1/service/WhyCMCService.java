package com.cmc.mockproject1.service;

import java.util.List;

import com.cmc.mockproject1.entity.WhyCMC;



public interface WhyCMCService {
	
	  List<WhyCMC> getdAll();
	  boolean insert(WhyCMC w);
	  boolean update(WhyCMC w);
	  boolean delete(String w);
	  List<WhyCMC> search(String s);
	  List<WhyCMC> getSlogan();
	  WhyCMC getVideo();
	  WhyCMC getTitle();
	  WhyCMC getButtonContent();
}

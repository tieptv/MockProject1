package com.cmc.mockproject1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cmc.mockproject1.entity.WhyCMC;



public interface WhyCMCRepository extends JpaRepository<WhyCMC, Integer> {
  List<WhyCMC> findTop5ByTypeAndIsShow(String type,boolean isShow);
  WhyCMC findTop1ByTypeAndIsShow(String type,boolean isShow);
}

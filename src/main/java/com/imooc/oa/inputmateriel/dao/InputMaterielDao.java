package com.imooc.oa.inputmateriel.dao;

import com.imooc.oa.inputmateriel.entity.InputMateriel;
import com.imooc.oa.materiel.entity.Materiel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InputMaterielDao extends JpaRepository<InputMateriel, Integer> {

   // List<InputMateriel> findOne(Integer InputMaterielId);

}

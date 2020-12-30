package com.app.Dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.metier.entities.Transaction;
@Repository
public interface DaoTransaction extends JpaRepository<Transaction,Integer>{
	Transaction findById(int userId);
	List<Transaction> findByIdUAndDateAndStatus(int idU,String date,int status);
	List<Transaction> findByOperateurAndSensAndIdU(String operateur,String sens,int id);
	List<Transaction> findByDateAndIdUAndSens(String operation,int id,String date);
	List<Transaction> findByOperateurAndDateAndIdU(String operation,String date,int id);
	List<Transaction> findByIdUAndDateOrOperateurOrOperation(int idU,String date,String operateur,String operation);
	List<Transaction> findByOperateurAndOperationAndDateAndIdU(String operation,String operatio,String date,int id);

	
}

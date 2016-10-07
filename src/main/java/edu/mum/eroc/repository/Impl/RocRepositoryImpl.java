package edu.mum.eroc.repository.Impl;

import org.springframework.stereotype.Repository;

import edu.mum.eroc.repository.IRocRepository;
@Repository
public class RocRepositoryImpl implements IRocRepository {
	
	
	@Override
	public String checkRocNumber(String rocNumber) {
		return "NO";
	}

}

package com.jt.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jt.demo.pojo.EnquiryPojo;

@Repository("enquiryrepo")
public interface enquiryRepository extends CrudRepository<EnquiryPojo, Integer> {

	public EnquiryPojo findByNameAndEmail(String name,String email);
}

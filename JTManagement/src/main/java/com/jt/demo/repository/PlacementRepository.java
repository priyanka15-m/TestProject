package com.jt.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jt.demo.pojo.PlacementPojo;

@Repository("placementRepo")
public interface PlacementRepository extends CrudRepository<PlacementPojo, Integer>{

//	public PlacementPojo findByYear_of_passing(int pass_year);
}

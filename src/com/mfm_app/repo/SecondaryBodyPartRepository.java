package com.mfm_app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfm_app.entities.SecondaryBodypartList;

@Repository
public interface SecondaryBodyPartRepository extends JpaRepository<SecondaryBodypartList, String> {

}

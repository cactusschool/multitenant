package com.ashish.cactus.school.multitenant.db.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.ashish.cactus.school.multitenant.db.model.ModuleMaster;

@Component
public interface ModuleMasterRepository extends CrudRepository <ModuleMaster, Integer>{
}

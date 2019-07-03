package com.l1dev.restservice.Repository;

import org.springframework.data.repository.CrudRepository;
import com.l1dev.restservice.model.NewTable;

// Create, Read, Update, Delete by Spring Doa
public interface UserInfoRepository extends CrudRepository<NewTable, Integer>  {
}

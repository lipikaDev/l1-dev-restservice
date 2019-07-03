package com.l1dev.restservice.Repository;

import org.springframework.data.repository.CrudRepository;
import com.l1dev.restservice.model.UserInfo;

// Create, Read, Update, Delete by Spring
public interface UserInfoRepository extends CrudRepository<UserInfo, Integer>  {
}

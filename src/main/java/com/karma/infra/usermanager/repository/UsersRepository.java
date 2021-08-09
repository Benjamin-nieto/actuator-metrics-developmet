package com.karma.infra.usermanager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karma.infra.usermanager.model.Users;

public interface UsersRepository extends JpaRepository<Users,Long>{

	List<Users> findById(long id);
	List<Users> findByName(String user);
	/**save
	 * findOne
	 * findByid
	 * findAll
	 * count
	 * delete
	 * deleteByid**/
	
	
}

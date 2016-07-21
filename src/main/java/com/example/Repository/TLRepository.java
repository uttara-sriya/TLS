package com.example.Repository;

import com.example.LoginModel.LoginM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sriya on 18/07/16.
 */
@Repository
public interface TLRepository extends JpaRepository<LoginM, Long> {

}
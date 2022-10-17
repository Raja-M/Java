package com.telanganainfo.contentmanagersecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telanganainfo.contentmanagersecurity.entity.TinfoUserPasswordResetToken;
 
@Repository
public interface TinfoUserPasswordResetTokenRepository extends 
JpaRepository<TinfoUserPasswordResetToken, Long> {


}

package com.iezview.sway.data.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.iezview.sway.data.jpa.model.SwayUser;

public interface SwayUserRepository extends CrudRepository<SwayUser, Long> {

}

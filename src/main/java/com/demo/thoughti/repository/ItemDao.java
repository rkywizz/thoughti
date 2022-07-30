package com.demo.thoughti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.thoughti.entities.Item;

@Repository
public interface ItemDao extends JpaRepository<Item,Integer>{

}

package com.example.blockchainf.repository;

import com.example.blockchainf.entities.Block;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BlockRepository extends JpaRepository<Block,String> {
}

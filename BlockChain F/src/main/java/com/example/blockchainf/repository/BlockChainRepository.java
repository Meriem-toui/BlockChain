package com.example.blockchainf.repository;
import com.example.blockchainf.entities.BlockChain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BlockChainRepository extends JpaRepository<BlockChain,String> {
}

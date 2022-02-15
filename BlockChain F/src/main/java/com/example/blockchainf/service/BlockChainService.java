package com.example.blockchainf.service;

import com.example.blockchainf.entities.Block;
import org.springframework.stereotype.Service;

@Service
public interface BlockChainService {
    void addBlock(Block block);
    void miner();
    Block getLastBlock();
    boolean verifyBlockChain();


}

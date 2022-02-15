package com.example.blockchainf.service;


import com.example.blockchainf.entities.Block;

public class ImplBlockChainService implements BlockChainService {
    @Override
    public void addBlock(Block block) {
    }

    @Override
    public void miner() {
    }

    @Override
    public Block getLastBlock() {
        return null;
    }

    @Override
    public boolean verifyBlockChain() {
        return false;
    }
}

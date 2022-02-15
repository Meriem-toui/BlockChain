package com.example.blockchainf.service;

public interface BlockService {
    String getHashBlock();
    Double createBlock();
    void minerBlock (int difficulte);

}

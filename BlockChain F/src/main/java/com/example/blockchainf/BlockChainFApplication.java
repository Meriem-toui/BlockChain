package com.example.blockchainf;

import com.example.blockchainf.entities.Block;
import com.example.blockchainf.entities.Transaction;
import com.example.blockchainf.repository.BlockChainRepository;
import com.example.blockchainf.repository.BlockRepository;
import com.example.blockchainf.repository.TransactionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class BlockChainFApplication {

    public static void main(String[] args) {

        SpringApplication.run(BlockChainFApplication.class, args);
    }
    @Bean
    CommandLineRunner start(BlockRepository blockRepository, BlockChainRepository blockChainRepository,
                            TransactionRepository transactionRepository) {
        return args -> {
            Transaction t1 = new Transaction(UUID.randomUUID().toString(), new Date(), "des1", "source1", 123.39);
            Transaction t2 = new Transaction(UUID.randomUUID().toString(), new Date(), "des2", "sourc2", 343.39);
            Transaction t3 = new Transaction(UUID.randomUUID().toString(), new Date(), "des3", "source3", 433.39);
            List<Transaction> listTransaction = new ArrayList<>();
            listTransaction.add(t1);
            listTransaction.add(t2);
            listTransaction.add(t3);
            blockRepository.save(new Block(null, new Date(), "hash1", "Lasthash",null,1));
            blockRepository.save(new Block(null, new Date(), "hash2", "Lasthash3",null,2));
            blockRepository.save(new Block(null, new Date(), "hash3", "Lasthash3",null,13));
                        System.out.println("fhhh"+t1);
            //blockRepository.findAll().forEach(System.out::println);

        };
    }}


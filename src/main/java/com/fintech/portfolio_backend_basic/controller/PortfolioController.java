package com.fintech.portfolio_backend_basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fintech.portfolio_backend_basic.entity.Portfolio;
import com.fintech.portfolio_backend_basic.repository.PortfolioRepository;

@RestController
@RequestMapping("/portfolio")
public class PortfolioController {

    private final PortfolioRepository portfolioRepository;

    public PortfolioController(PortfolioRepository portfolioRepository) {
        this.portfolioRepository = portfolioRepository;
    }

    @PostMapping
    public Portfolio savePortfolio(@RequestBody Portfolio portfolio) {
        return portfolioRepository.save(portfolio);
    }
    
    @GetMapping("/msg")
    public String Msg() {
    	return "this is portfolio controller";
    }
}
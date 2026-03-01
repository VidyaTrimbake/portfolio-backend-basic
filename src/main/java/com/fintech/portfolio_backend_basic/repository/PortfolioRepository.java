package com.fintech.portfolio_backend_basic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fintech.portfolio_backend_basic.entity.Portfolio;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {
}
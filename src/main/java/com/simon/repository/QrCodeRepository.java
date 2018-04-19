package com.simon.repository;

import com.simon.domain.QrCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QrCodeRepository extends JpaRepository<QrCode, Long> {
    QrCode findBySid(String sid);
}

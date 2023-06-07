package br.com.wecare.we_care_project.repository;

import br.com.wecare.we_care_project.model.StatisticsModel;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StatisticsRepository extends JpaRepository<StatisticsModel, Long> {
    @Transactional
    StatisticsModel findByCityContainingIgnoreCase(String city);

    @Transactional
    Page<StatisticsModel> findByWorkingForce(float workingForce, Pageable pageable);

    @Transactional
    Page<StatisticsModel> findByEducationLevel(float educationLevel, Pageable pageable);

    @Transactional
    Page<StatisticsModel> findByPoverty(float poverty, Pageable pageable);

    @Transactional
    Page<StatisticsModel> findBySalary(float salary, Pageable pageable);

    @Transactional
    Page<StatisticsModel> findByPovertyPercentage(float povertyPercentage, Pageable pageable);
}

package com.example.SpringAPI.Repository;

import com.example.SpringAPI.Entity.Wizard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface wizardRepository extends JpaRepository<Wizard, Long> {
}

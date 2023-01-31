package com.elitsapiens.landscape.repository

import com.elitsapiens.landscape.domain.Landscape
import org.springframework.data.jpa.repository.JpaRepository;

interface LandscapeRepository : JpaRepository<Landscape, Long>
package com.elitsapiens.landscape.service

import com.elitsapiens.landscape.domain.Landscape
import com.elitsapiens.landscape.repository.LandscapeRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class LandscapeService(
    private val landscapeRepository: LandscapeRepository
) {
    @Transactional
    fun saveLandscape(landscape: Landscape) {
        landscapeRepository.save(landscape)
    }

    fun findAllLandscape(): List<Landscape> {
        return landscapeRepository.findAll()
    }
}
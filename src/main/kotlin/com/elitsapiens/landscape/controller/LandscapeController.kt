package com.elitsapiens.landscape.controller

import com.elitsapiens.landscape.domain.Landscape
import com.elitsapiens.landscape.service.LandscapeService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class LandscapeController(
    private val landscapeService: LandscapeService
) {

    @GetMapping
    fun getLandscapeAll(): List<Landscape> {
        return landscapeService.findAllLandscape()
    }
}

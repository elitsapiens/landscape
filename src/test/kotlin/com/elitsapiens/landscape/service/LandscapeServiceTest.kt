package com.elitsapiens.landscape.service

import com.elitsapiens.landscape.domain.Landscape
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@SpringBootTest
class LandscapeServiceTest(
    @Autowired private val landscapeService: LandscapeService
) {
    @Test
    fun saveLandscape() {
        val landscape = Landscape(null, "korea", "한국", 1 )
        landscapeService.saveLandscape(landscape)
        val landscapes = landscapeService.findAllLandscape()
        println(landscapes)
        Assertions.assertEquals(landscapeService.findAllLandscape().contains(landscape), true)
    }
}
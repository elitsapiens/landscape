package com.elitsapiens.landscape.domain

import jakarta.persistence.*

@Entity
@Table(name = "landscape")
data class Landscape(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long? = null,

    @Column(name = "area")
    var area: String,

    @Column(name = "name")
    var name: String,

    @Column(name = "size")
    var size: Int
)
package com.example.ytapisbtkt.apisbtkt.models

import javax.persistence.*

@Entity
@Table(name = "potatos")
data class Potato(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long?,

    @Column(nullable = false)
    var race: String

){
    public constructor() : this(null, "")
}

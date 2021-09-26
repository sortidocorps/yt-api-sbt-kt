package com.example.ytapisbtkt.apisbtkt.services

import com.example.ytapisbtkt.apisbtkt.models.Potato
import com.example.ytapisbtkt.apisbtkt.repositories.PotatosRepository
import org.springframework.stereotype.Service

@Service
class PotatoService(val repo: PotatosRepository) {

    fun findAllPotatos(): List<Potato> = repo.findAll().toList()

    fun save(potato: Potato) {
        repo.save(potato)
    }
}
package com.example.ytapisbtkt.apisbtkt.repositories

import com.example.ytapisbtkt.apisbtkt.models.Potato
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PotatosRepository: CrudRepository<Potato, Long> {
}
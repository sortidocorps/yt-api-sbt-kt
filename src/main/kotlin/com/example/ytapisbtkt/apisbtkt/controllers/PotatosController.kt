package com.example.ytapisbtkt.apisbtkt.controllers

import com.example.ytapisbtkt.apisbtkt.models.Potato
import com.example.ytapisbtkt.apisbtkt.services.PotatoService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.ArraySchema
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/potatos")
class PotatosController(val service: PotatoService) {

    @Operation(summary = "Get all potatos")
    @ApiResponses(value = [
        ApiResponse(responseCode = "200", description = "Found Potatos", content = [Content(mediaType="application/json",
        array = (ArraySchema(schema = Schema(implementation = Potato::class))))]),
                ApiResponse(responseCode = "400", description = "Bad request", content = [Content()]),
                        ApiResponse(responseCode = "404", description = "Potatos not found", content = [Content()])

    ])
    @GetMapping
    fun index(): List<Potato> = service.findAllPotatos()

    @PostMapping
    fun postPotatos(@RequestBody potato: Potato) {
        service.save(potato)
    }

}
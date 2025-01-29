package br.com.minimalist.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/firstRoute")

public class FirstController {
  @GetMapping("/")
  public String firstMessage() {
    return "Hello World from the FirstController!";
  }
}

// HTTP verbs:
/**
 * GET - Obtém um recurso pelo ID ou lista todos os recursos.  
 * GET - Retrieves a resource by ID or lists all resources.  
 * POST - Cria um novo recurso.  
 * POST - Creates a new resource.  
 * PUT - Atualiza completamente um recurso existente.  
 * PUT - Fully updates an existing resource.  
 * DELETE - Remove um recurso pelo ID.  
 * DELETE - Removes a resource by ID.  
 * PATCH - Atualiza parcialmente um recurso existente.  
 * PATCH - Partially updates an existing resource.  
 */
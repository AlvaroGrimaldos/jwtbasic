package com.chrc.jwtbasic.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/public/info")
    public Map<String, String> publicInfo() {
    return Map.of("mensaje", "Acceso publico");
    }

    @GetMapping("/public/hello")
    public Map<String, String> publicHello() {
    return Map.of("mensaje", "Hola mundo publico");
    }

    @GetMapping("/camper/profile")
    public Map<String, String> camperProfile() {
        return Map.of("mensaje", "Perfil de camper2023");
    }

    @GetMapping("/camper/tasks")
    public Map<String, String> camperTasks() {
        return Map.of("mensaje", "Tareas de camper2023");
    }

    @GetMapping("/admin/users")
    public Map<String, String> adminUsers() {
        return Map.of("mensaje", "Lista de usuarios - ADMIN");
    }

    @GetMapping("/admin/delete")
    public Map<String, String> adminDelete() {
        return Map.of("mensaje", "Eliminar usuario - ADMIN");
    }
}

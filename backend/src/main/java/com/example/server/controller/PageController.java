package com.example.server.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/pages")
public class PageController {

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<String> uploadPage(
            @RequestParam("file") MultipartFile file,
            @RequestParam("pageNumber") int pageNumber) {
        // TODO: später Bild speichern, OCR ausführen, Text in DB speichern
        return ResponseEntity.ok("received page " + pageNumber);
    }
}

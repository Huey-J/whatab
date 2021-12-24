package com.example.demo.web;

import com.example.demo.web.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/api/v1/product")
@RestController
public class ProductController {

    private final ProductService productService;

    // TODO
    //  GET - getProduct
    //  GET - getProductsByPagination
    //  POST - addProduct
    //  PUT - updateProduct
    //  DELETE - deleteProduct
    // FIXME
    // DONE

    @GetMapping
    public void getProduct() {
    }




}

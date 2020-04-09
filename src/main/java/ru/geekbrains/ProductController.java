package ru.geekbrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.geekbrains.persist.Product;
import ru.geekbrains.persist.ProductRepository;
import ru.geekbrains.persist.SearchRequest;


@Controller
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository productRepository;

    @Autowired
    public ProductController (ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @GetMapping
    public String allProducts(Model model){
        model.addAttribute("products", productRepository.getAllProducts());
        return "products";
    }

    @GetMapping("/form")
    public String formProduct(Model model){
        model.addAttribute("product", new Product());
        return "product_form";
    }

    @PostMapping("form")
    public String newProduct(Product product){
        productRepository.insert(product);
        return "redirect:/products";
    }

    @GetMapping("/search")
    public String searchProduct(Model model){
        model.addAttribute("search_req", new SearchRequest());
        return "search_form";
    }

    @PostMapping("search")
    public String searchRequest(SearchRequest searchRequest, Model model){
        model.addAttribute("founded_products", productRepository.getProductById(Integer.parseInt(searchRequest.getRequest())));
        return "results";
    }

}

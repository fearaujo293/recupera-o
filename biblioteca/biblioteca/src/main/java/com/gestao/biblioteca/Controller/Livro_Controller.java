package Controller;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import DTO.Livro_DTO;
import Repository.Livro_Repository;

@RestController
@RequestMapping("/livros")

public class Livro_Controller {
	 @Autowired
	    private Livro_Repository livroRepository;
	    
	    @GetMapping
	    public List<Livro_DTO> listarLivros() {
	        return livroRepository.findAll();
	    }
	    
	    @PostMapping
	    public Livro_DTO adicionarLivro(@RequestBody Livro_DTO livro) {
	        return livroRepository.saveAll(livro);
	    }
	}



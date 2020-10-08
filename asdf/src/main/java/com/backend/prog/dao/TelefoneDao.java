package main.java.com.backend.prog.dao;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import main.java.com.backend.prog.vo.Telefone;

@RestController
@RequestMapping("/telefone")
public class TelefoneDao extends GenericDao<Telefone>{
    
	@PostMapping("/salvar/{json}")
    public void salvar(@RequestParam(value = "telefone") Telefone t) {
    	super.save(t);
    }
	
	@GetMapping("/consultaTodos")
	public List<Telefone> consultaTodos() {
		return super.getAll();
	}

}

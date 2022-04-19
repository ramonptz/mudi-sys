package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("xiaomi poco x3");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/71CxIDOIZeL._AC_SL1500_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Smartphone-Xiaomi-Poco-X3-Shadow/dp/B08HCNKVP1/ref=sr_1_5?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=3I8YCLMSC2Y7W&keywords=poco+x3&qid=1650302522&sprefix=poco+x%2Caps%2C206&sr=8-5&ufe=app_do%3Aamzn1.fos.25548f35-0de7-44b3-b28e-0f56f3f96147");
		pedido.setDescricao("smartphone xiaomi com 8 gb de RAM");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}

}

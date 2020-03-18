package com.example.prj_180281.controller;

import java.util.HashMap;


import com.example.prj_180281.model.Produto;
import com.example.prj_180281.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * ProdutoController
 */
@Controller
@RequestMapping("/app")
public class ProdutoController {

    @Autowired
    private ProdutoService ps;

    @GetMapping("/produto/{cod}")
    public ModelAndView getProdutoById(@PathVariable("cod") int cod){
        Produto p = ps.getProduto(cod);

        if(p == null)
            return new ModelAndView("viewProdutoErro");
        
        ModelAndView mv = new ModelAndView("viewProduto");

        mv.addObject("p", p);

        return mv;
    }

    @GetMapping("/produtoEmEstoque")
    public ModelAndView getProdutoEmEstoque(){
        ModelAndView mv = new ModelAndView("viewProdutoEmEstoque");

        HashMap<Integer, Produto> hm = ps.getProdutosEmEstoque();

        mv.addObject("p", hm);

        return mv;
    }

    @GetMapping("/produtoAcima/{valor}")
    public ModelAndView getProdutoAcima(@PathVariable("valor") double valor){
        ModelAndView mv = new ModelAndView("viewProdutoAcima");

        HashMap<Integer, Produto> hm = ps.getProdutosByValorAcima(valor);

        mv.addObject("p", hm);

        return mv;
    }

    @GetMapping("/produtoAbaixo/{valor}")
    public ModelAndView getProdutoAbaixo(@PathVariable("valor") double valor){
        ModelAndView mv = new ModelAndView("viewProdutoAbaixo");

        HashMap<Integer, Produto> hm = ps.getProdutosByValorAbaixo(valor);

        mv.addObject("p", hm);

        return mv;
    }
}
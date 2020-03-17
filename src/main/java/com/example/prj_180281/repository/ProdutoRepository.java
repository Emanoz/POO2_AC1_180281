package com.example.prj_180281.repository;

import java.util.HashMap;

import com.example.prj_180281.model.Produto;

import org.springframework.stereotype.Repository;

/**
 * ProdutoRepository
 */
@Repository
public class ProdutoRepository {

    public HashMap<Integer, Produto> hm = new HashMap<Integer, Produto>(); 

    public ProdutoRepository(){
        hm.put(1, new Produto(1, "Call of Duty qualquer", 99999, 67));
        hm.put(2, new Produto(2, "Minecraft", 107, 67));
        hm.put(3, new Produto(3, "Don't Starve", 22, 67));
        hm.put(4, new Produto(4, "Don't satrve Together", 25, 67));
        hm.put(5, new Produto(5, "The Last Of Us", 99, 67));
        hm.put(6, new Produto(6, "Terraria", 15, 67));
        hm.put(7, new Produto(7, "God Of War", 170, 67));
        hm.put(8, new Produto(8, "Red Dead Redemption", 250, 67));
        hm.put(9, new Produto(9, "Zelda", 97, 67));
        hm.put(10, new Produto(10, "The Legend of Zelda: Breath Of The Wild", 230, 67));
    } 

    //Testar com int, se der erro mudar para Integer (argumento)
    public Produto getProdutoById(int cod){
        return hm.get(cod);
    }

    public HashMap<Integer, Produto> getProdutos(){
        return hm;
    }
}
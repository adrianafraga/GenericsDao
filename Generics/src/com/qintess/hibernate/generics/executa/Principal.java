package com.qintess.hibernate.generics.executa;


import com.qintess.hibernate.generics.dao.GenericDao;
import com.qintess.hibernate.generics.modelo.ItemVenda;
import com.qintess.hibernate.generics.modelo.Produto;
import com.qintess.hibernate.generics.modelo.Venda;

public class Principal {



	public static void main(String[] args) {
		{
			
			Produto produto1 = new Produto();
			Produto produto2 = new Produto();
			Venda venda = new Venda();
			ItemVenda itemvenda1 = new ItemVenda();
			ItemVenda itemvenda2 = new ItemVenda();
			
			GenericDao<Produto> gDaoProd = new GenericDao<Produto>();
			GenericDao<ItemVenda> gDaoItVen = new GenericDao<ItemVenda>();
			GenericDao<Venda> gDaoVen = new GenericDao<Venda>();
			
			produto1.setNome("Iphone 8");
			produto1.setPreco(2600.00);
			gDaoProd.salvar(produto1);
			
			produto2.setNome("Iphone 11");
			produto2.setPreco(4300.00);
			gDaoProd.salvar(produto2);
			
			venda.setTotal(9500.00);
			gDaoVen.salvar(venda);
			
			itemvenda1.setQtd(2);
			itemvenda1.setSubtotal(2600.00);
			itemvenda1.setProduto(produto1);
			itemvenda1.setVenda(venda);
			gDaoItVen.salvar(itemvenda1);
			itemvenda2.setQtd(1);
			itemvenda2.setSubtotal(4300.00);
			itemvenda2.setProduto(produto2);
			itemvenda2.setVenda(venda);
			gDaoItVen.salvar(itemvenda2);
			
			
			System.out.println("Produtos salvo com sucesso!!");
			System.out.println("Venda salva com sucesso!!");
			System.out.println("Itens de venda salvo com sucesso!!!");
			
			

		}
		
	}
	
}
	

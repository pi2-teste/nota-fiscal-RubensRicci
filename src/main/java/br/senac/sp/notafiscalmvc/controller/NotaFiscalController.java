/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.notafiscalmvc.controller;

import br.senac.sp.notafiscalmvc.DAO.NotaFiscalDAO;
import br.senac.sp.notafiscalmvc.model.NotaFiscal;

/**
 *
 * @author lucas
 */
public class NotaFiscalController {
    
    public static boolean salvar(int numeroNota,double valorNota, String nomeDoProduto ){
    NotaFiscal nota = new NotaFiscal();
    nota.setNumNota(numeroNota);
    nota.setValNota(valorNota);
    nota.setnomeDoProduto(nomeDoProduto);
    NotaFiscalDAO dao = new NotaFiscalDAO();
    dao.addNota(nota);
    return true;
    }
    }
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventoscientificos.model.state.evento;

import eventoscientificos.model.Evento;
import eventoscientificos.model.Local;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.Data;

/**
 * Testa a classe Evento Em Submissao State Test.
 *
 * @author G01
 */
public class EventoEmSubmissaoStateTest {

    /**
     * Instancia de evento
     */
    private Evento e;

    /**
     * Constroi instancia de EventoEmSubmissaoStateTest recebendo uma instancia
     * de evento
     */
    public EventoEmSubmissaoStateTest() {
        this.e = new Evento("titulo", "descricao", new Local("local"),
                new Data(2016, 6, 8), new Data(2016, 6, 20),
                new Data(2016, 7, 7), new Data(2016, 8, 15),
                new Data(2016, 9, 10), new Data(2016, 10, 1),
                new Data(2017, 6, 10));
        e.setEstado(new EventoEmSubmissaoState(e));
    }

    /**
     * Teste do metodo setCriado, da classe EventoEmSubmissaoState.
     */
    @Test
    public void testSetCriado() {
        System.out.println("setCriado");
        EventoEmSubmissaoState instance = (EventoEmSubmissaoState) e.getEstado();
        boolean expResult = false;
        boolean result = instance.setCriado();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo setRegistado, da classe EventoEmSubmissaoState.
     */
    @Test
    public void testSetRegistado() {
        System.out.println("setRegistado");
        EventoEmSubmissaoState instance = (EventoEmSubmissaoState) e.getEstado();
        boolean expResult = false;
        boolean result = instance.setRegistado();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo setSessoesTematicasDefinidas, da classe
     * EventoEmSubmissaoState.
     */
    @Test
    public void testSetSessoesTematicasDefinidas() {
        System.out.println("setSessoesTematicasDefinidas");
        EventoEmSubmissaoState instance = (EventoEmSubmissaoState) e.getEstado();
        boolean expResult = false;
        boolean result = instance.setSessoesTematicasDefinidas();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo setCPDefinida, da classe EventoEmSubmissaoState.
     */
    @Test
    public void testSetCPDefinida() {
        System.out.println("setCPDefinida");
        EventoEmSubmissaoState instance = (EventoEmSubmissaoState) e.getEstado();
        boolean expResult = false;
        boolean result = instance.setCPDefinida();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo setEmSubmissao, da classe EventoEmSubmissaoState.
     */
    @Test
    public void testSetEmSubmissao() {
        System.out.println("setEmSubmissao");
        EventoEmSubmissaoState instance = (EventoEmSubmissaoState) e.getEstado();
        boolean expResult = true;
        boolean result = instance.setEmSubmissao();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo setEmDetecao, da classe EventoEmSubmissaoState.
     */
    @Test
    public void testSetEmDetecao() {
        System.out.println("setEmDetecao");
        EventoEmSubmissaoState instance = (EventoEmSubmissaoState) e.getEstado();
        boolean expResult = false;
        boolean result = instance.setEmDetecao();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo setEmLicitacao, da classe EventoEmSubmissaoState.
     */
    @Test
    public void testSetEmLicitacao() {
        System.out.println("setEmLicitacao");
        EventoEmSubmissaoState instance = (EventoEmSubmissaoState) e.getEstado();
        boolean expResult = false;
        boolean result = instance.setEmLicitacao();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo setEmDistribuicao, da classe EventoEmSubmissaoState.
     */
    @Test
    public void testSetEmDistribuicao() {
        System.out.println("setEmDistribuicao");
        EventoEmSubmissaoState instance = (EventoEmSubmissaoState) e.getEstado();
        boolean expResult = false;
        boolean result = instance.setEmDistribuicao();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo setEmRevisao, da classe EventoEmSubmissaoState.
     */
    @Test
    public void testSetEmRevisao() {
        System.out.println("setEmRevisao");
        EventoEmSubmissaoState instance = (EventoEmSubmissaoState) e.getEstado();
        boolean expResult = false;
        boolean result = instance.setEmRevisao();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo setFaseDecisao, da classe EventoEmSubmissaoState.
     */
    @Test
    public void testSetFaseDecisao() {
        System.out.println("setFaseDecisao");
        EventoEmSubmissaoState instance = (EventoEmSubmissaoState) e.getEstado();
        boolean expResult = false;
        boolean result = instance.setFaseDecisao();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo setEmSubmissaoCameraReady da classe
     * EventoEmSubmissaoState.
     */
    @Test
    public void testSetEmSubmissaoCameraReady() {
        System.out.println("setEmSubmissaoCameraReady");
        EventoEmSubmissaoState instance = (EventoEmSubmissaoState) e.getEstado();
        boolean expResult = false;
        boolean result = instance.setEmSubmissaoCameraReady();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo setCameraReady, da classe EventoEmSubmissaoState.
     */
    @Test
    public void testSetCameraReady() {
        System.out.println("setCameraReady");
        EventoEmSubmissaoState instance = (EventoEmSubmissaoState) e.getEstado();
        boolean expResult = false;
        boolean result = instance.setCameraReady();
        assertEquals(expResult, result);
    }

    /**
     * Teste ao metodo validarEstado, da classe EventoEmSubmissaoState.
     */
    @Test
    public void testValidarEstado() {
        System.out.println("validarEstado");
        EventoEmSubmissaoState instance = (EventoEmSubmissaoState) e.getEstado();
        boolean expResult = false;
        boolean result = instance.validarEstado();
        assertEquals(expResult, result);
    }

    /**
     * Teste ao método isStateValidoParaRemover, da classe
     * EventoEmSubmissaoState.
     */
    @Test
    public void testIsStateValidoParaRemover() {
        System.out.println("isStateValidoParaRemover");
        EventoState instance = e.getEstado();
        boolean expResult = true;
        boolean result = instance.isStateValidoParaRemover();
        assertEquals(expResult, result);

    }

    /**
     * Teste ao método testIsStateValidoParaRemoverNot, da classe
     * EventoEmSubmissaoState.
     */
    @Test
    public void testIsStateValidoParaRemoverNot() {
        System.out.println("isStateValidoParaRemoverNot");
        e.setEstado(new EventoEmCameraReadyState(e));
        EventoState instance = e.getEstado();
        boolean expResult = false;
        boolean result = instance.isStateValidoParaRemover();
        assertEquals(expResult, result);

    }

    /**
     * Teste ao método testIsStateValidoParaSubmeter, da classe
     * EventoEmSubmissaoState.
     */
    @Test
    public void testIsStateValidoParaSubmeter() {
        System.out.println("isStateValidoParaSubmeter");
        EventoState instance = e.getEstado();
        boolean expResult = true;
        boolean result = instance.isStateValidoParaSubmeter();
        assertEquals(expResult, result);
    }

    /**
     * Teste ao método testIsStateValidoParaSubmeterNot, da classe
     * EventoEmSubmissaoState.
     */
    @Test
    public void testIsStateValidoParaSubmeterNot() {
        System.out.println("isStateValidoParaSubmeterNot");
        e.setEstado(new EventoEmSubmissaoCameraReadyState(e));
        EventoState instance = e.getEstado();
        boolean expResult = false;
        boolean result = instance.isStateValidoParaSubmeter();
        assertEquals(expResult, result);
    }

    /**
     * Teste ao método testIsStateValidoParaAlterar, da classe
     * EventoEmSubmissaoState.
     */
    @Test
    public void testIsStateValidoParaAlterar() {
        System.out.println("isStateValidoParaAlterar");
        EventoState instance = e.getEstado();
        boolean expResult = true;
        boolean result = instance.isStateValidoParaAlterar();
        assertEquals(expResult, result);
    }

    /**
     * Teste ao método testIsStateValidoParaLicitar, da classe
     * EventoEmSubmissaoState.
     */
    @Test
    public void testIsStateValidoParaLicitar() {
        System.out.println("isStateValidoParaLicitar");
        e.setEstado(new EventoEmLicitacaoState(e));
        EventoState instance = e.getEstado();
        boolean expResult = true;
        boolean result = instance.isStateValidoParaLicitar();
        assertEquals(expResult, result);
    }

    /**
     * Teste ao método testIsStateValidoParaDistribuir, da classe
     * EventoEmSubmissaoState.
     */
    @Test
    public void testIsStateValidoParaDistribuir() {
        System.out.println("isStateValidoParaDistribuir");
        e.setEstado(new EventoEmDistribuicaoState(e));
        EventoState instance = e.getEstado();
        boolean expResult = true;
        boolean result = instance.isStateValidoParaDistribuir();
        assertEquals(expResult, result);
    }
}

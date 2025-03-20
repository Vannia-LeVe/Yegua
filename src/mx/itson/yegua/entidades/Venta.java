/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.yegua.entidades;

import java.util.List;
import mx.itson.yegua.enums.Categoria;
import mx.itson.yegua.enums.TipoVenta;

/**
 *
 * @author alumnog
 */
public class Venta {

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the tipo
     */
    public TipoVenta getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoVenta tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the subtotal
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * @return the descuento
     */
    public double getDescuento() {
        return descuento;
    }

    /**
     * @param descuento the descuento to set
     */
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the articulos
     */
    public List<Articulo> getArticulos() {
        return articulos;
    }

    /**
     * @param articulos the articulos to set
     */
    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }
    private String cliente;
    private TipoVenta tipo;
    private double subtotal;
    private double descuento;
    private double total;
    private List<Articulo> articulos;
    
   /**El metodo va a agregarle al subtotal los precios si cpoincide con los tipos de articulos
    * 
    */
   
    public void calcularSubtotal() {
      double s=0;
        
        for(Articulo a :articulos){
            if(a.getCategoria()== Categoria.ROPA ){
                if(TipoVenta.CREDITO==a.getCategoria()){
              s+=a.getPrecio();  }
               
            }if(a.getCategoria()== Categoria.ALIMENTOS ){
               s+=a.getPrecio();
            }if(a.getCategoria()== Categoria.ELECTRONICA ){
               s+=a.getPrecio();
            }if(a.getCategoria()== Categoria.LINEA_BLANCA){
                s+=a.getPrecio();
            }else{
            }
        
            
        }
    }
            
  public void calcularTotal(){
      
      
  }  
    
    
  
    
  
}


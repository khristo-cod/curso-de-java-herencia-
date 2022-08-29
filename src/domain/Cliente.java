
package domain;

import java.util.Date;

public class Cliente extends Persona{
    private int idClente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;
    
    public Cliente(Date fechaRegistro, boolean vip, String nombre,
            char genero, int edad, String direccion){
        super(nombre, genero, edad, direccion);
        this.idClente = ++Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
        
        
        
    }

    public int getIdClente() {
        return idClente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("idClente=").append(idClente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", =").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}

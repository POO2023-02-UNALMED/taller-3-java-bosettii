package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    private Control control;

    private static int numTV;

    public TV(Marca m,boolean e){
        this.marca = m;
        this.estado = e;
        this.canal = 1;
        this.volumen = 1;
        this.precio = 500;
        TV.numTV++;
    }

    public Marca getMarca(){
        return this.marca;
    }

    public int getCanal(){
        return this.canal;
    }
    public int getPrecio(){
        return this.precio;
    }

    public int getVolumen(){
        return this.volumen;
    }

    public Control getControl(){
        return this.control;
    }

    //Set

    public void setMarca(Marca m){
        this.marca = m;
    }

    public void setCanal(int c){
        if(this.getEstado() && c<121 && c>0)
            this.canal = c;
    }

    public void setPrecio(int p){
        this.precio = p;
    }

    public void setVolumen(int v){
        if(this.getEstado() && v<8 && v>-1)
            this.volumen=v;
    }

    public void setControl(Control c){
        this.control = c;
    }

    public static void setNumTV(int a){
        TV.numTV = a;
    }
    
    public static int getNumTV(){
        return numTV;
    }

    public void turnOn(){
        this.estado = true;
    }

    public void turnOff(){
        this.estado = false;
    }

    public boolean getEstado(){
        return this.estado;
    }

    public void canalUp(){
        if(this.getEstado() && this.getCanal()<121)
            this.setCanal(this.getCanal()+1);
    }

    public void canalDown(){
        if(this.getEstado() && this.getCanal()>-1)
            this.setCanal(this.getCanal()-1);
    }
    
    public void volumenUp(){
        if(this.getEstado() && this.getVolumen()<8)
            this.setVolumen(this.getVolumen()+1);
    }

    public void volumenDown(){
        if(this.getEstado() && this.getVolumen()>0)
            this.setVolumen(this.getVolumen()-1);
    }



}

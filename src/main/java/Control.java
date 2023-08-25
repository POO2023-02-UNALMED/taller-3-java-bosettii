package taller3.televisores;

public class Control {
    private TV tv;

    public void enlazar(TV tv){
        this.setTv(tv);
        tv.setControl(this);
    }

    public TV getTv(){
        return tv;
    }

    private void setTv(TV tv){
        this.tv=tv;
    }
//////////////////////////////////////////////

    public void turnOn(){
        this.tv.turnOn();
    }

    public void turnOff(){
        this.tv.turnOff();
}

    public void canalUp(){
        this.tv.canalUp();
    }

    public void canalDown(){
        this.tv.canalDown();
    }
    
    public void volumenUp(){
        this.tv.volumenUp();
    }

    public void volumenDown(){
        this.tv.volumenDown();
    }

    public void setCanal(int c){
        this.tv.setCanal(c);
    }

    public void setVolumen(int v){
        this.tv.setVolumen(v);
    }
}

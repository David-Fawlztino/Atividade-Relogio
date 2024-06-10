public class Relogio {
    private int hora;
    private int minuto;

    public Relogio(int hora, int minuto){
        
            if(hora >= 0 && hora <= 24 && minuto >= 0 && minuto <= 60){
                this.hora = hora;
                this.minuto = minuto;
            }else{
                throw new IllegalArgumentException("Horario adicionado é invalido");
            }
    }
    
    public int getHora() {
        return hora;
    }
    
    public int getMinutos() {
        return minuto;
    }
    
    public void setHora(int hora, int minuto){
        if(hora >= 0 && hora <= 24 && minuto >= 0 && minuto <= 60){
            this.hora = hora;
            this.minuto = minuto;
        }else{
            throw new IllegalArgumentException("Horario adicionado é invalido");
        }
    }

    public void IncrementaMinuto(){
        minuto++;
        if(minuto >=60){
            minuto = 0;
            hora++;
            if (hora >= 24) {
                hora = 0;
            }            
        }
    }

    public String mostraHora(){
        return String.format("%02d:%02d", hora, minuto);
    }
}

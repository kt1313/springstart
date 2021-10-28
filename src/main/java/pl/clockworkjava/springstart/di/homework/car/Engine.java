package pl.clockworkjava.springstart.di.homework.car;


import org.springframework.stereotype.Component;

@Component
public class Engine {

    private String vinNr;
    private Integer capacity;

    public Engine(){}

    public Engine (String vinNr, Integer capacity){
        this.vinNr=vinNr;
        this.capacity=capacity;
    }

    public String getVinNr() {
        return vinNr;
    }

    public void setVinNr(String vinNr) {
        this.vinNr = vinNr;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}

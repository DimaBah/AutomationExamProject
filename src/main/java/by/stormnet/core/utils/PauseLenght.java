package by.stormnet.core.utils;

public enum PauseLenght {
    MAX(31),
    AVG(30),
    MIN(5);


    private Integer value;

    PauseLenght(Integer value) {
        this.value = value;
    }

    public Integer value(){
        return this.value;
    }
}

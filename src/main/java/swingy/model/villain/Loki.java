package swingy.model.villain;

public class Loki implements Villain {

    private int villain_X_Cor;
    private int villain_Y_Cor;

    @Override
    public void setVillain_X_Cor(int villain_X_Cor) {
        this.villain_X_Cor = villain_X_Cor;
    }

    @Override
    public void setVillain_Y_Cor(int villain_Y_Cor) {
        this.villain_Y_Cor = villain_Y_Cor;
    }

    @Override
    public String villainName() {
        return "Loki";
    }

    @Override
    public String villainFlag() {
        return "L";
    }

    @Override
    public int villain_X_Cor() {
        return this.villain_X_Cor;
    }

    @Override
    public int villain_Y_Cor() {
        return this.villain_Y_Cor;
    }

    @Override
    public int villain_Attack() {
        return 50;
    }

    @Override
    public int villain_Defence() {
        return 50;
    }

    @Override
    public int villain_HP() {
        return 210;
    }
}

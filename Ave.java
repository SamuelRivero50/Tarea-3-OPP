public class Ave {
    private String especie, color;
    private boolean vuela;

    public Ave(String especie, String color, boolean vuela) {
        this.especie = especie;
        this.color = color;
        this.vuela = vuela;
    }

    public Ave(String especie, boolean vuela) {
        this.especie = especie;
        this.vuela = vuela;
    }

    public void volar() {
        if (vuela == true) {
            System.out.println(this.especie + " esta volando");
        } else {
            System.out.println(this.especie + " no esta volando");
        }
    }

    public void color() {
        if (color != null) {
            System.out.println("El ave es de color: " + this.color);
        } else {
            System.out.println("El ave no tiene color");
        }
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }
}
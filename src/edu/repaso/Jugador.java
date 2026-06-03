package edu.repaso;

public class Jugador {

    private String nickname;
    private int puntuacionRanked;
    private String rol;

    public Jugador(String nickname, int puntuacionRanked, String rol) {
        this.nickname = nickname;
        this.puntuacionRanked = puntuacionRanked;
        this.rol = rol;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getPuntuacionRanked() {
        return puntuacionRanked;
    }

    public void setPuntuacionRanked(int puntuacionRanked) {
        this.puntuacionRanked = puntuacionRanked;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nickname='" + nickname + '\'' +
                ", puntuacionRanked=" + puntuacionRanked +
                ", rol='" + rol + '\'' +
                '}';
    }
}

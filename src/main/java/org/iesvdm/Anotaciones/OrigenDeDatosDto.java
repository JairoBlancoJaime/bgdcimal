package org.iesvdm.Anotaciones;

public class OrigenDeDatosDto {

    private String user;
    private String password;
    private String url;
    private String driverClassName;

    public  OrigenDeDatosDto {

    }

    public OrigenDeDatosDto(String user, String password, String url, String driverClassName) {
        this.user = user;
        this.password = password;
        this.url = url;
        this.driverClassName = driverClassName;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    @Override
    public String toString() {
        return "OrigenDeDatosDto{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", url='" + url + '\'' +
                ", driverClassName='" + driverClassName + '\'' +
                '}';
    }
}

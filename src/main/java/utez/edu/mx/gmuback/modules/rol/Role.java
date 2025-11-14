package utez.edu.mx.gmuback.modules.rol;

public enum Role {

    ADMIN("ROLE_ADMIN"),
    STUDENT("STUDENT_USER");
        //USER("ROLE_USER")
    private final String name;

    Role(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


}

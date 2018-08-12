package practice.hw;

public class Player {
    private String username;
    private String role;
    private int health;

    public Player() {
    }

    public Player(String username, String role, int health) {
        this.username = username;
        this.role = role;
        this.health = health;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        if (health != player.health) return false;
        if (!username.equals(player.username)) return false;
        return role.equals(player.role);
    }

    @Override
    public int hashCode() {
        int result = username.hashCode();
        result = 31 * result + role.hashCode();
        result = 31 * result + health;
        return result;
    }

    @Override
    public String toString() {
        return "Player{" +
                "username='" + username + '\'' +
                ", role='" + role + '\'' +
                ", health=" + health +
                '}';
    }
}

package com.yu.keyword._object;

/**
 * equals练习
 *
 * @author Yu
 * @create 2026-03-15 23:16
 */
public class EqualsTest {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.equals(new User()));

        User u2 = new User();
        System.out.println(u1.equals(u2));

        User u3 = new User();
        u3.setUsername("tom");
        User u4 = new User();
        u4.setUsername("jack");
        System.out.println(u3.equals(u4));
    }
}

class User{
    private String host;
    private String username;
    private String password;
    public User(String host, String username, String password) {
        super();
        this.host = host;
        this.username = username;
        this.password = password;
    }
    public User() {
        super();
    }
    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "User [host=" + host + ", username=" + username + ", password=" + password + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (host == null) {
            if (other.host != null)
                return false;
        } else if (!host.equals(other.host))
            return false;
        if (password == null) {
            if (other.password != null)
                return false;
        } else if (!password.equals(other.password))
            return false;
        if (username == null) {
            if (other.username != null)
                return false;
        } else if (!username.equals(other.username))
            return false;
        return true;
    }
}

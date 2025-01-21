package ru.jvmbrain;

public class OptionalNotUse {

    public static void main(String[] args) {
        Profile profile = new Profile();
        profile.setActive(true);

        Request request = new Request();
        request.setName(getName(profile));
    }

    public static String getName(Profile profile) {
        return profile.getActive() ? profile.getName() : null;
    }
}

class Profile {
    private Boolean isActive;
    private String name;

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Request {
    private String name;

    public void setName(String name) {
        this.name = name;
    }
}

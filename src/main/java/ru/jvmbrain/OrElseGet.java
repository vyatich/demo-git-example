package ru.jvmbrain;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class OrElseGet {

    private static UserRepository userRepository;

    public static void main(String[] args) {
        User user = new User();
        String name = Optional.ofNullable(user.fullName)
                .orElseGet(() -> userRepository.getName(user));
    }

    static class User {
        private String name;
        private String fullName;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }
    }
}

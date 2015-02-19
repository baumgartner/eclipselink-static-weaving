package starter;

import java.util.Collection;

import org.springframework.beans.factory.InitializingBean;

import repo.UserRepository;
import asdf.User;

public class Starter implements InitializingBean {

    private UserRepository repository;

    public UserRepository getRepository() {
        return repository;
    }

    public void setRepository(UserRepository repository) {
        this.repository = repository;
    }

    public void afterPropertiesSet() throws Exception {
        User u = new User();
        u.setFirstname("foo");
        u.setLastname("bar");
        repository.save(u);
        System.out.println("Inserted user");

        Collection<User> users = repository.findAll();
        for (User us : users)
            System.out.println(us);
    }

}

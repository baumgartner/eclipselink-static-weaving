package qwertz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import repo.UserRepository;
import asdf.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/context.xml")
public class UserRepoTest {

    @Autowired
    private UserRepository repository;

    public void setRepository(UserRepository repository) {
        this.repository = repository;
    }

    @Test
    public void testInsert() {
        User u = new User();
        u.setFirstname("foo");
        u.setLastname("bar");
        repository.save(u);
    }

}

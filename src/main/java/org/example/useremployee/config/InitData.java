package org.example.useremployee.config;

import org.example.useremployee.model.Employee;
import org.example.useremployee.model.Gender;
import org.example.useremployee.model.UniCode;
import org.example.useremployee.model.User;
import org.example.useremployee.repository.EmployeeRepository;
import org.example.useremployee.repository.UniCodeRepository;
import org.example.useremployee.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import static org.apache.coyote.http11.Constants.a;
import static org.example.useremployee.model.Gender.FEMALE;


@Component
public class InitData implements CommandLineRunner {


    @Autowired
    UniCodeRepository uniCodeRepository;
    @Override

    public void run(String... args) {

        /*UniCode test1 = new UniCode();
        test1.setaLetter((char) a);
        test1.setUnicode(20);
        test1.setDescription("dette er første test" + a + 20);
        uniCodeRepository.save(test1);


         */
        Set<Character> characters = new HashSet<>();
       char newLeter = ' ';

       while (newLeter != '~'){
           characters.add(newLeter);
           newLeter++;
       }
        System.out.println(characters);

        for (char c : characters) {
            UniCode u = new UniCode();
            u.setUnicode((int)c);
            u.setaLetter(c);
            uniCodeRepository.save(u);
        }

    }


    //@Autowired
    //UserRepository userRepository;

   // @Autowired
    //EmployeeRepository employeeRepository;


    //@Transactional
    /*public void run(String... args) throws Exception {
        try {

            User user1 = new User();
            user1.setEmail("hej@live.dk");
            user1.setPassword("1234");
            userRepository.save(user1);

            Employee employee1 = new Employee();
            employee1.setName("Yousra");
            employee1.setGender(FEMALE);
            employee1.setBorn(LocalDateTime.now());
            employee1.setVegetarian(true);
            employee1.setUser(user1);
            user1.setEmployee(employee1);
            employeeRepository.save(employee1);

            //userRepository.delete(user1);
            //employeeRepository.delete((employee1));

        } catch (DataAccessException e) {
            System.out.println("FEJL I INITDATA");
            System.out.println(e.getMessage());
        }

    }
*/



}

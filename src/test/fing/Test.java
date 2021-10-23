package test.fing;
public class Test {

    @Data
    public class User {
        private String name;
        private String locaiton;
        
        @ManyToOne(fetchType = LAZY)
        @Column("dept_id")
        private Department dep;
        
    }
    
    @Data
    public class Department{
        private String name;
        
        @OneToMany(mappedBy = "dep")
        private List<User> users;
    }
    
    @Repository
    public interface UserRepository {

        List<User> findAll();
        
        User findByName(String name);
        
        Department findByName(String name);
    }
    
    

    @Service
    public class UserService {

        @Autowired
        private UserRepository repository;

        public List<String> getUserNames() {
            // TODO
            return repository.findAll().stream().map(user -> user.getUsername()).collect(Collectors.toList());
        }
        
        
    }

    
}
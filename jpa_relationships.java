// ============================
// ONE-TO-ONE RELATIONSHIPS
// ============================

// UNIDIRECTIONAL One-to-One
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String username;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_id")
    private UserProfile profile;
    
    // constructors, getters, setters
    public User() {}
    
    public User(String username) {
        this.username = username;
    }
    
    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    
    public UserProfile getProfile() { return profile; }
    public void setProfile(UserProfile profile) { this.profile = profile; }
}

@Entity
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String firstName;
    private String lastName;
    private String email;
    
    // No reference back to User (unidirectional)
    
    public UserProfile() {}
    
    public UserProfile(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    
    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}

// BIDIRECTIONAL One-to-One
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;
    
    // constructors, getters, setters
    public Employee() {}
    
    public Employee(String name) {
        this.name = name;
    }
    
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public Address getAddress() { return address; }
    public void setAddress(Address address) { 
        this.address = address;
        if (address != null) {
            address.setEmployee(this);
        }
    }
}

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String street;
    private String city;
    private String zipCode;
    
    @OneToOne(mappedBy = "address")
    private Employee employee; // Reference back to Employee (bidirectional)
    
    public Address() {}
    
    public Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }
    
    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getStreet() { return street; }
    public void setStreet(String street) { this.street = street; }
    
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    
    public String getZipCode() { return zipCode; }
    public void setZipCode(String zipCode) { this.zipCode = zipCode; }
    
    public Employee getEmployee() { return employee; }
    public void setEmployee(Employee employee) { this.employee = employee; }
}

// ============================
// ONE-TO-MANY RELATIONSHIPS
// ============================

// UNIDIRECTIONAL One-to-Many
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id") // Foreign key in Employee table
    private List<DepartmentEmployee> employees = new ArrayList<>();
    
    public Department() {}
    
    public Department(String name) {
        this.name = name;
    }
    
    public void addEmployee(DepartmentEmployee employee) {
        employees.add(employee);
    }
    
    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public List<DepartmentEmployee> getEmployees() { return employees; }
    public void setEmployees(List<DepartmentEmployee> employees) { this.employees = employees; }
}

@Entity
public class DepartmentEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String position;
    
    // No reference back to Department (unidirectional)
    
    public DepartmentEmployee() {}
    
    public DepartmentEmployee(String name, String position) {
        this.name = name;
        this.position = position;
    }
    
    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }
}

// BIDIRECTIONAL One-to-Many
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Product> products = new ArrayList<>();
    
    public Category() {}
    
    public Category(String name) {
        this.name = name;
    }
    
    public void addProduct(Product product) {
        products.add(product);
        product.setCategory(this);
    }
    
    public void removeProduct(Product product) {
        products.remove(product);
        product.setCategory(null);
    }
    
    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public List<Product> getProducts() { return products; }
    public void setProducts(List<Product> products) { this.products = products; }
}

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private Double price;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category; // Reference back to Category (bidirectional)
    
    public Product() {}
    
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    
    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
    
    public Category getCategory() { return category; }
    public void setCategory(Category category) { this.category = category; }
}

// ============================
// MANY-TO-ONE RELATIONSHIPS
// ============================

// UNIDIRECTIONAL Many-to-One
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private LocalDateTime orderDate;
    private Double totalAmount;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;
    
    public Order() {}
    
    public Order(LocalDateTime orderDate, Double totalAmount) {
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
    }
    
    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public LocalDateTime getOrderDate() { return orderDate; }
    public void setOrderDate(LocalDateTime orderDate) { this.orderDate = orderDate; }
    
    public Double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(Double totalAmount) { this.totalAmount = totalAmount; }
    
    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }
}

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String email;
    
    // No reference back to Orders (unidirectional)
    
    public Customer() {}
    
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}

// BIDIRECTIONAL Many-to-One (same as bidirectional One-to-Many shown above with Category-Product)

// ============================
// MANY-TO-MANY RELATIONSHIPS
// ============================

// UNIDIRECTIONAL Many-to-Many
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String email;
    
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
        name = "author_book",
        joinColumns = @JoinColumn(name = "author_id"),
        inverseJoinColumns = @JoinColumn(name = "book_id")
    )
    private Set<Book> books = new HashSet<>();
    
    public Author() {}
    
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    public void addBook(Book book) {
        books.add(book);
    }
    
    public void removeBook(Book book) {
        books.remove(book);
    }
    
    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public Set<Book> getBooks() { return books; }
    public void setBooks(Set<Book> books) { this.books = books; }
}

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String title;
    private String isbn;
    
    // No reference back to Authors (unidirectional)
    
    public Book() {}
    
    public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }
    
    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    
    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
}

// BIDIRECTIONAL Many-to-Many
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String email;
    
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
        name = "student_course",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private Set<Course> courses = new HashSet<>();
    
    public Student() {}
    
    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    public void addCourse(Course course) {
        courses.add(course);
        course.getStudents().add(this);
    }
    
    public void removeCourse(Course course) {
        courses.remove(course);
        course.getStudents().remove(this);
    }
    
    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public Set<Course> getCourses() { return courses; }
    public void setCourses(Set<Course> courses) { this.courses = courses; }
}

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String code;
    private Integer credits;
    
    @ManyToMany(mappedBy = "courses")
    private Set<Student> students = new HashSet<>(); // Reference back to Students (bidirectional)
    
    public Course() {}
    
    public Course(String name, String code, Integer credits) {
        this.name = name;
        this.code = code;
        this.credits = credits;
    }
    
    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    
    public Integer getCredits() { return credits; }
    public void setCredits(Integer credits) { this.credits = credits; }
    
    public Set<Student> getStudents() { return students; }
    public void setStudents(Set<Student> students) { this.students = students; }
}

// ============================
// USAGE EXAMPLES
// ============================

/*
// Repository interfaces
@Repository
public interface UserRepository extends JpaRepository<User, Long> {}

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {}

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {}

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {}

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {}

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {}

// Service example
@Service
@Transactional
public class RelationshipService {
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private CategoryRepository categoryRepository;
    
    @Autowired
    private StudentRepository studentRepository;
    
    public void demonstrateUnidirectionalOneToOne() {
        UserProfile profile = new UserProfile("John", "Doe", "john@example.com");
        User user = new User("johndoe");
        user.setProfile(profile);
        userRepository.save(user);
    }
    
    public void demonstrateBidirectionalOneToMany() {
        Category category = new Category("Electronics");
        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Mouse", 29.99);
        
        category.addProduct(product1);
        category.addProduct(product2);
        
        categoryRepository.save(category);
    }
    
    public void demonstrateBidirectionalManyToMany() {
        Student student1 = new Student("Alice", "alice@example.com");
        Student student2 = new Student("Bob", "bob@example.com");
        
        Course course1 = new Course("Java Programming", "CS101", 3);
        Course course2 = new Course("Database Design", "CS201", 4);
        
        student1.addCourse(course1);
        student1.addCourse(course2);
        student2.addCourse(course1);
        
        studentRepository.save(student1);
        studentRepository.save(student2);
    }
}
*/
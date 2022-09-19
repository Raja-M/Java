## Annotations

--
* @Value("{welcome.message} ")
   private String welcomeMessage;


--

* @Configuration
* @ComponentScan(basePackages = "demo" ) 
* @EnableAspectJAutoProxy
--
* @Component

* @RestController  @Controller
* @Autowirted(@Qualify = "classname")
* @GetMapping("/department/{id}") 
* @PostMapping, @PutMapping ,
   publid Department saveDepartment(@Valid @RequestBody Department department)
* @DeleteMapping, @
* @RequestMapping( method = get ) -- old
* @RequestBody  
* @ResponseBody()
* @PathVariable("id") Long departmentId.
* @Repository

--
* @ControllerAdvice
* @ResponseStatus
* @ExcceptionHandler( DepartmentNotFoundException.class)


--


--
* @Aspect  // should be annotatated with @Component
    * @Pointcut("within(demo..*)" ) 
        public void authenticatingPointCut(){}
    * @Before( "authenticatingPointCut() && authorizationPointCut() " )
    * @Before("execution(* demo.ShoppingCart.checkout(..) ) " )
    * @After("execution(* *.*.*.checkout(..) ) " ) 
--
--
* @Entity
* @Table( name= "tbl_student" 
*         uniqueConstraints = @UniqueConstraint(
*           name = "emailid_unique"
*           columnNames = "email_address"
*          )
*       )

* @Data  // for lomboc @NoArgsConstructor, 
* @Builder
* @Id

* @SequenceGenerator(
            name = "Student_seq",
            sequenceName = "Student_seq",
            allocationSize = 1 
      )
* @GeneratedValue(strategy = GenerationType.AUTO )
* @GeneratedValue(strategy = GenerationType.SEQUENCE
                  generator = "student_sequence" )

* @Column( name = "email_address" , nullabl = false)
* @NotBlank(message = "Please make sure field value is not empty )
* @Query( value= "SELECT * FROM USERS WHERE LASTNAME = ?1",
          countQuery = 'SELECT COUNT(*) FROM USERS WHERE LASTNAME = ?1",
          nativeQuery= true )
    Page<User> findByLastName( String lastname, Pageable pageable)
* @Embeddable
* @Embededd
* @AttributeOverrides(){
      @AttributeOverride(
         name = "name"
         column = @column( name= "guardian_name" )
      ) // repeat for each
      )
 }

--
--
* @MockBean
   
* @BeforeEach
   
* @Test
* @DisplayName(" Get Data based on Valid Department name " )
* @Disable  // disable the test case.
* @DataJpaTest
   
   
 -- Acuttuator
   
 * @Endpoint( id = features) 
   

   
   
 


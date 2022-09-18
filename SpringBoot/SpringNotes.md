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
* @Data  // for lomboc @NoArgsConstructor, 
* @Builder
* @Id
* @GeneratedValue(strategy = GenerationType.AUTO )
* @NotBlank(message = "Please make sure field value is not empty )
* @Query( value= "SELECT * FROM USERS WHERE LASTNAME = ?1",
          countQuery = 'SELECT COUNT(*) FROM USERS WHERE LASTNAME = ?1",
          nativeQuery= true )
    Page<User> findByLastName( String lastname, Pageable pageable)

--
--
* @MockBean
   
* @BeforeEach
   
* @Test
* @DisplayName(" Get Data based on Valid Department name " )
* @Disable  // disable the test case.
* @DataJpaTest

   
   
 


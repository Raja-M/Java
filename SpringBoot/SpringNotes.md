## Annotations

* @Configuration
* @ComponentScan(basePackages = "demo" ) 
* @EnableAspectJAutoProxy

* @Component

* @RestController
* @Autowirted(@Qualify = "classname")
* @GetMapping("/department/{id}") @PostMapping, @PutMapping , @DeleteMapping, @
* @RequestMapping( method = get ) -- old
* @RequestBody  
* @ResponseBody()
* @PathVariable("id") Long departmentId.


* @Aspect  // should be annotatated with @Component
    * @Pointcut("within(demo..*)" ) 
        public void authenticatingPointCut(){}
    * @Before( "authenticatingPointCut() && authorizationPointCut() " )
    * @Before("execution(* demo.ShoppingCart.checkout(..) ) " )
    * @After("execution(* *.*.*.checkout(..) ) " ) 

* @Entity
* @Id
* @GeneratedValue(strategy = GenerationType.AUTO )
* @NotBlank(message = "Please make sure field value is not empty )
* 




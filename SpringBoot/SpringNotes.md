## Annotations

* @Configuration
* @ComponentScan(basePackages = "demo" ) 
* @EnableAspectJAutoProxy

* @Component


* @Aspect  // should be annotatated with @Component
    * @Pointcut("within(demo..*)" ) 
        public void authenticatingPointCut(){}
    * @Before( "authenticatingPointCut() && authorizationPointCut() " )
    * @Before("execution(* demo.ShoppingCart.checkout(..) ) " )
    * @After("execution(* *.*.*.checkout(..) ) " ) 




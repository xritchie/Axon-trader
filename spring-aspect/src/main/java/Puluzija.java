import org.aspectj.lang.annotation.*;

/**
 * Created by shawnritchie on 15/04/15.
 */
@Aspect
public class Puluzija {

    @Pointcut("execution(* Shout.shouting()) ")
    public void ghajjat() {}

    @Before("ghajjat()")
    public void haJghajjat()
    {
        System.out.println("Mejjet biex jghajjat da liba!!!!");
    }

    @AfterReturning(value="ghajjat()", returning = "ghajta")
    public void ghalih(Object ghajta)
    {
        if ((ghajta != null) && (ghajta instanceof String)) {
            String ghajtaStr = ((String) ghajta);
            System.out.println("Smajtu X'Qal " + ghajtaStr);
        }

        System.out.println("Ghalih boys ttuhh!!!!!");
    }


}

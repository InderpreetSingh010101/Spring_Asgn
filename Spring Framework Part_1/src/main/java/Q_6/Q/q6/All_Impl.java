package Q_6.Q.q6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class All_Impl {

    private  InterF interF ;


    // Constructor Injection
    @Autowired
    All_Impl(InterF interF){
        this.interF = interF ;
    }

    public void printShow(){
        interF.show();
    }

}

package Metier;

import dao.Idao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("metier")
public class MetierImpl implements IMetier {
    @Autowired
    @Resource(name ="dao")
    private Idao idao;

    public void setIdao(Idao idao) {
        this.idao = idao;
    }

    public double calcule() {
        double d = idao.calcule();
        return d*3;
    }

}

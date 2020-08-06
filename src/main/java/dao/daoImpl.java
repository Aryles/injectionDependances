package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class daoImpl implements Idao {
    public double calcule() {
        return 1;
    }
}

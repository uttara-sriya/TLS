package com.example.LoginController;

import com.example.LoginModel.LoginM;
import com.example.Repository.TLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sriya on 20/07/16.
 */
@RestController
@RequestMapping(value="/log")
public class loginC {

    private TLRepository tlRepository;
    @Autowired
    public loginC(TLRepository tlRepository){
        this.tlRepository = tlRepository;
    }

    @RequestMapping(value="/index")
    public String index(){
        return "new string";
    }

    @RequestMapping(value="/all" ,method= RequestMethod.GET, produces = "application/json")
    public List<LoginM> getAll(){
        return tlRepository.findAll();
    }


}

package micro.controller;


import com.micro.entity.Product;
import com.micro.service.DeptClientService;
import com.micro.service.ProductClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductConsumerController {

      @Autowired
      private ProductClientService ProductClientService;

      @RequestMapping(value = "/consumer/getAllType/{pid}")
      public List<Product> finsAllType(@PathVariable("pid") Integer parentId){
            return this.ProductClientService.findAllType(parentId);
      }

}

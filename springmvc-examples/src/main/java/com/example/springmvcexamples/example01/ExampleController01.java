package com.example.springmvcexamples.example01;

import com.example.springmvcexamples.VO.ResultVO;
import com.example.springmvcexamples.example01.entity.Address;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@RestController
@Slf4j
@RequestMapping("/api/example01/")
public class ExampleController01 {
    @GetMapping("index")
    public ResultVO getIndex(){
        return ResultVO.success(Map.of("name","SUN"));
    }
    @GetMapping("addresses")
    public ResultVO getAddresses(){
        return ResultVO.success(Map.of("addresses",ADDRESSES));
    }

    @PostMapping("addresses")
    public ResultVO postAddress(@RequestBody Address address) {
        log.debug(address.getDetail());
        log.debug(address.getComment());
        return ResultVO.success(Map.of());
    }

    @GetMapping("addresses/{aid}")
    public ResultVO postAddress(@PathVariable("aid") int aid){
        Address address = ADDRESSES.stream()
                .filter(a->a.getId()==aid)
                .findFirst()
                .orElse(new Address());
        return ResultVO.success(Map.of("address",address));
    }
    @PostMapping("addresses02")
    public ResultVO postAddress2(@RequestBody Address address){
        log.debug(address.getDetail());
        log.debug(address.getComment());
        log.debug("{}",address.getUser().getId());
        return ResultVO.success(Map.of());
    }
    private final List<Address> ADDRESSES = creat();

    private List<Address> creat(){
        Address a1 = new Address(1, "956", "a", LocalDateTime.now());
        Address a2 = new Address(2, "925", "b", LocalDateTime.now());
        Address a3 = new Address(3, "121", null, null);

        return List.of(a1, a2, a3);
    }
}

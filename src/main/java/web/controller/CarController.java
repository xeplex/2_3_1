package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.Car;
import web.service.CarService;


@Controller
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping("/")
    public String getCars( Model model) {
        model.addAttribute("cars", carService.getCars());
        return "cars";
    }

    @RequestMapping("/addNewUser")
    public String addNewUser(Model model) {
        Car car = new Car();
        model.addAttribute("car", car);
        return "car-info";
    }

    @PostMapping("/saveCar")
    public String saveEmployee(@ModelAttribute("car") Car car) {
        carService.saveCar(car);
        return "redirect:/";
    }

    @GetMapping("/updateInfo")
    public String updateCar(@RequestParam("carId") int id, Model model) {
        Car car = carService.getCar(id);
        model.addAttribute("car", car);
        return "car-info";
    }

    @GetMapping("/deleteCar")
    public String deleteCar(@RequestParam("carId") int id) {
        carService.deleteCar(id);
        return "redirect:/";
    }

}
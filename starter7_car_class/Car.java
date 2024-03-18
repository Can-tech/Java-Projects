package starter7_car_class;

public class Car {
    private enum CarModel {Honda, Wolkswagen, }

    private String _name="no name";
    private CarModel _model;
    public String get_name(){
        return _name;
    }
    public void set_name(String name){
        _name=name;
    }
    public CarModel get_model(){
        return _model;
    }
    public void set_model(CarModel model){
        _model = model;
    }
    public boolean equals(Car otherCar){
        return _name == otherCar.get_name();
    }
}

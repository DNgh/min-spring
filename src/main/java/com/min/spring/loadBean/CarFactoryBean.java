package com.min.spring.loadBean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.util.StringUtils;

public class CarFactoryBean implements FactoryBean<Car> {
    private String carInfo; 
    
	@Override
	public Car getObject() throws Exception {
		Car car = new Car();
		if(StringUtils.hasText(carInfo)) {
			String[] infos = carInfo.split(",");
			if(infos != null) {
				if(infos.length >= 1) {
					car.setBrand(infos[0]);
				}else if(infos.length >= 2) {
					car.setSpeed(Integer.valueOf(infos[1]));
				}else if(infos.length >= 3){
					car.setPrice(Double.valueOf(infos[2]));
				}
			}
		}
		
		return car;
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

	public String getCarInfo() {
		return carInfo;
	}

	public void setCarInfo(String carInfo) {
		this.carInfo = carInfo;
	}
	
}

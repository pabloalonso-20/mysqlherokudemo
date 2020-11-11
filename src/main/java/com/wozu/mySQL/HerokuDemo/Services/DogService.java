package com.wozu.mySQL.HerokuDemo.Services;

import com.wozu.mySQL.HerokuDemo.Models.Dog;

public interface DogService {

    public Dog getDogFromDogApi();
    public void postDogFromDogApi(Dog dog);
    public Iterable<Dog> getAllDogs();

}

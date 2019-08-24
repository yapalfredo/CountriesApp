package com.example.countriesapp.model;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface CountriesApi {

    //https://raw.githubusercontent.com/DevTides/countries/master/countriesV2.json


    //Single is a type of observable that RxJava generates for us
    @GET("DevTides/countries/master/countriesV2.json")
    Single<List<CountryModel>> getCountries();


    //Just an example if we have different endpoints
//    @POST("endpoint2")
//    Single<List<CountryModel>> getFromEndpoint;

    //@GET
//    Single<Object> getObject(@Url String urlString);
}

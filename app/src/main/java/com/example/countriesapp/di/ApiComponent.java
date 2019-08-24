package com.example.countriesapp.di;

import com.example.countriesapp.model.CountriesService;
import com.example.countriesapp.viewmodel.ListViewModel;

import dagger.Component;

//Provides Connection for @Inject and @Provides
@Component(modules = {ApiModule.class})
public interface ApiComponent {

    void inject(CountriesService service);

    void inject(ListViewModel viewModel);

}

package com.example.appudaraz.retrofit_class;

import com.example.appudaraz.modal.CollectionModal;
import com.example.appudaraz.modal.ProductModal;
import com.example.appudaraz.modal.UsersModal;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {

    // Node API for products
    @GET("productList")
    Call<List<ProductModal>> getProduct();

    // Node API for collections
    @GET("collectionsList")
    Call<List<CollectionModal>> getCollection();

    @POST("userList")
    Call <Void> registerUsers(@Body UsersModal usersModal);

}
package mobile.skripsi.pawsandclaws.api;

import mobile.skripsi.pawsandclaws.model.User;
import mobile.skripsi.pawsandclaws.model.Users;
import mobile.skripsi.pawsandclaws.model.Result;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * API Service
 * Created by @lukmanadelt on 06/11/2017.
 */

public interface APIService {
    @FormUrlEncoded
    @POST("login")
    Call<Result> userLogin(
            @Field("username") String username,
            @Field("password") String password
    );

    @GET("doctors")
    Call<Users> getDoctors();

    @GET("doctors/{id}")
    Call<Result> getDoctor(@Path("id") int id);

    @FormUrlEncoded
    @POST("doctors/update/{id}")
    Call<Result> updateDoctor(
            @Path("id") int id,
            @Field("username") String username,
            @Field("fullname") String fullname,
            @Field("status") int status
    );

    @FormUrlEncoded
    @POST("doctors/insert")
    Call<Result> insertDoctor(
            @Field("username") String username,
            @Field("password") String password,
            @Field("fullname") String fullname
    );

    @GET("customers")
    Call<Users> getCustomers();

    @FormUrlEncoded
    @POST("customers/insert")
    Call<Result> insertCustomer(
            @Field("username") String username,
            @Field("password") String password,
            @Field("fullname") String fullname,
            @Field("phone") String phone,
            @Field("address") String address
    );
}
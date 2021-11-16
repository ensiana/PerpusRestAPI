package id.ac.ub.restapi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PerpustakaanService {
    @GET("perpus")
    Call<List<Buku>> listBuku();

    @GET("perpus/{id}")
    Call<Buku> getBuku(@Path("id") String id);

}

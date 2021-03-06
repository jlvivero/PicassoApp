package picasso.picassoapp.API;

import java.util.List;

import picasso.picassoapp.models.CallbackJson;
import picasso.picassoapp.models.SimpleCallback;
import retrofit.Callback;

import picasso.picassoapp.models.Drawing;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;

/**
 * Created by jl on 4/5/16.
 */
//this is the retrofit interface, they basically are all the possible routes i can do http requests to.
public interface DrawingAPI
{
    //TODO: add a model for the Callback response to know exactly what im gonna get
    @POST("/store")
    void postDrawing(@Body Drawing message, Callback<CallbackJson> response);

    @POST("/drawStored")
    void drawStored(@Body Drawing name, Callback<SimpleCallback> response);

    //TODO: add a specific response server side to be able to test properly
    @GET("/test")
    void getResponse(Callback<String> response);

    //TODO: ADD this to the server and change the callback so it's a list of drawings I guess
    @GET("/list")
    void getDrawingList(Callback<List<Drawing>> response);

    //to delete everything
    @GET("/deleteAll")
    void deleteAll(Callback<String> response);
}

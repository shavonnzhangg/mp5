package ca.ece.ubc.cpen221.mp5;

// TODO: Use this class to represent a restaurant.
// State the rep invariant and abs

import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private boolean open;
    private String url;
    private double longitude;
    private String[] neighborhoods;
    private String business_id;
    private String name;
    private String[] categories;
    private String state;
    private String type;
    private Double stars;
    private String city;
    private String full_address;
    private int review_count;
    private String photo_url;
    private String[] schools;
    private double latitude;
    private int price;
    private List<Review> review;

    public Restaurant(JSONObject jsonObject){
        open = (Boolean) jsonObject.get("open");
        url = (String) jsonObject.get("url");
        longitude = (Double) jsonObject.get("longitude");
        neighborhoods = (String[]) jsonObject.get("neighborhoods");
        business_id = (String) jsonObject.get("business_id");
        name = (String) jsonObject.get("name");
        categories = (String[]) jsonObject.get("categories");
        state = (String) jsonObject.get("state");
        type = (String) jsonObject.get("type");
        stars = (double) jsonObject.get("stars");
        city = (String) jsonObject.get("city");
        full_address = (String) jsonObject.get("full_address");
        review_count = (int) jsonObject.get("review_count");
        photo_url = (String) jsonObject.get("photo_url");
        schools = (String[]) jsonObject.get("schools");
        latitude = (double) jsonObject.get("latitude");
        price = (int) jsonObject.get("price");
        review = new ArrayList<>();
    }

    public void setReview(Review review){
        this.review.add(review);
    }
}

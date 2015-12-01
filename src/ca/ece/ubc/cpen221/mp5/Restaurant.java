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

    public List<Review> getReview() {
        return review;
    }

    public boolean isOpen() {
        return open;
    }

    public String getUrl() {
        return url;
    }

    public double getLongitude() {
        return longitude;
    }

    public String[] getNeighborhoods() {
        return neighborhoods;
    }

    public String getBusiness_id() {
        return business_id;
    }

    public String getName() {
        return name;
    }

    public String[] getCategories() {
        return categories;
    }

    public String getState() {
        return state;
    }

    public String getType() {
        return type;
    }

    public Double getStars() {
        return stars;
    }

    public String getCity() {
        return city;
    }

    public String getFull_address() {
        return full_address;
    }

    public int getReview_count() {
        return review_count;
    }

    public String getPhoto_url() {
        return photo_url;
    }

    public String[] getSchools() {
        return schools;
    }

    public double getLatitude() {
        return latitude;
    }

    public int getPrice() {
        return price;
    }

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

package ca.ece.ubc.cpen221.mp5;

// TODO: Use this class to represent a Yelp user.

import org.json.simple.JSONObject;

public class User {
    private String url;

    public String getUrl() {
        return url;
    }

    public Vote getVote() {
        return vote;
    }

<<<<<<< HEAD
    public long getReview_count() {
=======
    public int getReview_count() {
>>>>>>> shavon
        return review_count;
    }

    public String getType() {
        return type;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getName() {
        return name;
    }

    public double getAverage_stars() {
        return average_stars;
    }

    private Vote vote;
<<<<<<< HEAD
    private long review_count;
=======
    private int review_count;
>>>>>>> shavon
    private String type;
    private String user_id;
    private String name;
    private double average_stars;

    public User(JSONObject jsonObject){
        url = (String) jsonObject.get("url");
        JSONObject jsonVote = (JSONObject) jsonObject.get("votes");

        vote = new Vote(jsonVote);

<<<<<<< HEAD
        review_count = (long) jsonObject.get("review_count");
=======
        review_count = (int) jsonObject.get("review_count");
>>>>>>> shavon
        type = (String) jsonObject.get("type");
        user_id = (String) jsonObject.get("user_id");
        name = (String) jsonObject.get("name");
        average_stars = (double) jsonObject.get("average_stars");
    }
}

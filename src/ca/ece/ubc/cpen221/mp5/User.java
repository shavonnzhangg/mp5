package ca.ece.ubc.cpen221.mp5;

// TODO: Use this class to represent a Yelp user.

import org.json.simple.JSONObject;

public class User {
    private String url;
    private Vote vote;
    private int review_count;
    private String type;
    private String user_id;
    private String name;
    private double average_stars;

    public User(JSONObject jsonObject){
        url = (String) jsonObject.get("url");
        JSONObject jsonVote = (JSONObject) jsonObject.get("votes");

        vote = new Vote(jsonVote);

        review_count = (int) jsonObject.get("review_count");
        type = (String) jsonObject.get("type");
        user_id = (String) jsonObject.get("user_id");
        name = (String) jsonObject.get("name");
        average_stars = (double) jsonObject.get("average_stars");
    }
}

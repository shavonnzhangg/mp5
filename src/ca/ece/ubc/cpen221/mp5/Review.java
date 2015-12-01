package ca.ece.ubc.cpen221.mp5;

// TODO: Use this class to represent a Yelp review.

import org.json.simple.JSONObject;

public class Review {
    public String getType() {
        return type;
    }

    public String getBusiness_id() {
        return business_id;
    }

    public Vote getVote() {
        return vote;
    }

    public String getReview_id() {
        return review_id;
    }

    public String getText() {
        return text;
    }

    public long getStars() {
        return stars;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getDate() {
        return date;
    }

    private String type;
    private String business_id;
    private Vote vote;
    private String review_id;
    private String text;
    private long stars;
    private String user_id;
    private String date;

    public Review(JSONObject jsonObject) {

        type = (String) jsonObject.get("type");
        business_id = (String) jsonObject.get("business_id");
        JSONObject jsonVote = (JSONObject) jsonObject.get("votes");

        vote = new Vote(jsonVote);

        review_id = (String) jsonObject.get("review_id");
        text = (String) jsonObject.get("text");
        stars = (long) jsonObject.get("stars");
        user_id = (String) jsonObject.get("user_id");
        date = (String) jsonObject.get("date");
    }
}
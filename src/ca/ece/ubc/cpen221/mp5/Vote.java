package ca.ece.ubc.cpen221.mp5;

import org.json.simple.JSONObject;

/**
 * Author: Dooj
 * Date: 2015-12-01.
 */
public class Vote {
    long cool;
    long useful;
    long funny;

    public Vote(JSONObject jsonVote){
        cool = (long) jsonVote.get("cool");
        useful = (long) jsonVote.get("useful");
        funny = (long) jsonVote.get("funny");
    }
}

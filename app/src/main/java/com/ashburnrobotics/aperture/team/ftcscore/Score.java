package com.ashburnrobotics.aperture.team.ftcscore;

/**
 * Created by Austin on 11/9/14.
 */
public class Score {
    //Autonomous
    private boolean platToField, kickstand, autoBallCenGoal;
    private int numAutoBallsInRollGoal, numRollGoalsInParkZoneAuto;
    //TeleOp
    private int numBallsIn30cm, numBallsIn60cm, numBallsIn90cm;
    //End Game
    private int numRobotsOrRollGoalsInParkZoneEnd, numRobotsOrRollGoalsOffFloor, numBallsInCenGoal;

    public Score(){
        platToField = false;
        kickstand = false;
        autoBallCenGoal = false;
        numAutoBallsInRollGoal = 0;
        numRollGoalsInParkZoneAuto = 0;
        numBallsIn30cm = 0;
        numBallsIn60cm = 0;
        numBallsIn90cm = 0;
        numRobotsOrRollGoalsInParkZoneEnd = 0;
        numRobotsOrRollGoalsOffFloor = 0;
        numBallsInCenGoal = 0;
    }
    public void setAutonomousScore(boolean platToField, boolean kickstand, boolean autoBallCenGoal,
                                   int numAutoBallsInRollGoal, int numRollGoalsInParkZoneAuto){
        this.platToField = platToField;
        this.kickstand = kickstand;
        this.autoBallCenGoal = autoBallCenGoal;
        this.numAutoBallsInRollGoal = numAutoBallsInRollGoal;
        this.numRollGoalsInParkZoneAuto = numRollGoalsInParkZoneAuto;
    }
    public void setTeleOpScore(int numBallsIn30cm, int numBallsIn60cm, int numBallsIn90cm,
                               int numRobotsOrRollGoalsInParkZoneEnd, int numRobotsOrRollGoalsOffFloor, int numBallsInCenGoal){
        this.numBallsIn30cm = numBallsIn30cm;
        this.numBallsIn60cm = numBallsIn60cm;
        this.numBallsIn90cm = numBallsIn90cm;
        this.numRobotsOrRollGoalsInParkZoneEnd = numRobotsOrRollGoalsInParkZoneEnd;
        this.numRobotsOrRollGoalsOffFloor = numRobotsOrRollGoalsOffFloor;
        this.numBallsInCenGoal = numBallsInCenGoal;
    }
    public int calculateScore(){
        //For Michael to do.
        return 0;
    }
}

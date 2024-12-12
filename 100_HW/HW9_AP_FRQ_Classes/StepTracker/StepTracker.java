public class StepTracker{
    int activedays;
    int days;
    int steps;
    int minsteps;
    public StepTracker(int steps){
        minsteps = steps;
        days = 0;
        steps = 0;
        activedays = 0;
    }
    public void addDailySteps(int steps){
        this.steps = this.steps + steps; 
        days = days + 1;
        if(steps>=minsteps){
            activedays = activedays + 1;
        }
    }
    public int activeDays(){
        return activedays;
    }
    public double averageSteps(){
        double average = steps/days;
        return average;
    }
    
    
}
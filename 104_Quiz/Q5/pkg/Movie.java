package pkg;

public class Movie{
    String name;
    double rating;
    int numofrating;
    int revenue;
    public Movie(){
        name = "Avengers";
        rating = 8.0;
        numofrating = 33;
        revenue = 623357910;
    }
    public Movie(String name, double rating, int numofrating, int revenue){
        this.name = name;
        this.rating = rating;
        this.numofrating = numofrating;
        this.revenue = revenue;
    }
    public void movieToString(){
        System.out.println("Movie: " + name);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + numofrating);
        System.out.println("Revenue: " + revenue);
        return;
    }
    public String getMovieName(){
        return name;
    
    }
    public int getRevenue(){
        return revenue;
    }
    public double getRating(){
        return rating;
    }
    public void addRating(double r){
        double total = rating*numofrating;
        rating = ((total + r)/(numofrating+1));
        numofrating = numofrating+1;
    }
    public boolean compareRatings(Movie x){
        if(x.getRating()<rating){
            return true;
        }
        else{
            return false;
        }
        
        
    }
   
   
    
}
        
    
    
    
     




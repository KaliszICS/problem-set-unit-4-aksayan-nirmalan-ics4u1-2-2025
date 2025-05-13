class Card{
    
    private String name;
    private String suit;
    private double value;

    public Card(String name ,String suit ,double value){
        this.name=name;
        this.suit=suit;
        this.value=value;
    }

    public String getName(){
        return this.name;
    }

    public String getSuit(){
        return this.suit;
    }
    public double getValue(){
        return this.value;
    }

    public String toString(){
        return (this.name+" of "+this.suit);
    }
    @Override
    public boolean equals(Object obj){
        this.name =(String)obj;
        if ( this.getName() == (this.name) && this.getSuit() == (this.suit) && this.getValue() == this.value) {
            return true;
        }
        return false;
    }
}
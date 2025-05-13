class Deck{

    private Card[] cardarray;
    private int draw;


    public Deck(Card[]cardarray){
        this.cardarray=new Card[cardarray.length];
        for(int i=0;i<cardarray.length;i++){
            this.cardarray[i]=cardarray[i];
        }

        this.cardarray=cardarray.clone();
    }

    public void unshuffled(Card deck){
        Card decklist[] = new Card[this.cardarray.length+1];
        for(int i=0;i<cardarray.length;i++){
            decklist[i]=this.cardarray [i];
        }
        decklist[this.cardarray.length]=deck;
        
        this.cardarray=decklist;
    
    }
    public Card[] size(){
        return this.cardarray;
    }
    public Card draw(){
        return cardarray[1];
    }
     //should return the first card of the array
     
     
     public void shuffle(){
        Collection.shuffle(this.cardarray);
    }
     //digital ocean
}


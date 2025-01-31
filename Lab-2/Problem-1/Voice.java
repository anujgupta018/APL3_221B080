class Voice
{
    void prepareVoice()
    {
        Animal [] animal=new Animal[5];
        animal[0]=new Lion();
        animal[1]=new Goat();
        animal[2]=new Cow();
        animal[3]=new Tiger();
        animal[4]=new Pig();
        hear(animal);
    }
    
    void hear(Animal[] animal)
    {
        for(int i=0;i<5;i++)
        {
            animal[i].makeVoice();
        }
    }
}
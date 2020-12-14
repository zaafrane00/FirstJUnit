
public class Math {
    float x;
    float y;
    int tab[];

    public Math(float x, float y) {
        this.x = x;
        this.y = y;
    }

    float div(){
        return x/y;
    }

    float somme(){
        return x+y;
    }
    
    void remplirTab(int tab[]){
    this.tab=tab;
    }

    public void affiche(){
    for(int x:tab){
        System.out.println(x);
    }
    }
}

void setup(){
  size(600,600);
}
   int y=0;
   int x = (int) random(600);
   int score=0;
void draw(){
 
    background(139,143,162);
 
  fill(0,36,255);
  stroke(0,0,0);
  ellipse(x,y, 30,75);
  y=y+10;

  fill(0,0,0);
  rect(mouseX, 550, 50, 75);
  if(y>=575){
    if(mouseX<x+40 && mouseX>x-40){
   score=score+1;
    }
    else if(score==0){}
    else{
      score--;
    }
    y=0;
  x = (int) random(600);}
    fill(0,0,0);
    textSize(16);
    text("Score: " + score, 20,20);
}

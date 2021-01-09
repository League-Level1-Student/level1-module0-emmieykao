import ddf.minim.*;  
  PImage pictureofRecord;
  Minim minim;
  AudioPlayer song;
void setup(){
size(600,600);
pictureofRecord=loadImage("record.png");
pictureofRecord.resize(600,600);
minim = new Minim(this);
song = minim.loadFile("awesomeTrack.mp3", 512);
}
void draw(){
image(pictureofRecord, 0, 0);

if(mousePressed){
rotateImage(pictureofRecord, 60);
song.play();
}
else{
song.pause();}
}
void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }

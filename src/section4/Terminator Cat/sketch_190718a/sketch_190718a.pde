PImage catPic;
void setup(){
  size( 500,500 );
  catPic = loadImage("Cat.jpg");

                catPic.resize(500,500);

background(catPic);
}
void draw(){
ellipse(95,163,50,50);
ellipse(176,156,50,50);
if(mousePressed){

println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
}
 

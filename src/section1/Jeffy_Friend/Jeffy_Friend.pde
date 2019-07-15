PImage mustache;
PImage friend;

void setup() {
  size(800, 600);
}

void draw() {
  friend = loadImage("jeffy.png");
  friend.resize(width, height);
  background(friend);
}

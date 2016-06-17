#include<Servo.h>

Servo servoCloro;
//Servo servoPh;
int incomingByte=0;
int valCl,valPh;

void setup() {
  servoCloro.attach(3);
  servoCloro.write(0);
  pinMode(6,OUTPUT);
  pinMode(9,OUTPUT);
  pinMode(2,OUTPUT);
  Serial.begin(9600);
}

void loop() {
  // put your main code here, to run repeatedly:
  if (Serial.available() > 0) {
      incomingByte = Serial.read();
      if(incomingByte!=0){
        if(incomingByte<=63){
            agregarCloro(incomingByte);
        } else {
            if((incomingByte-64)<=63){
                agregarPh(incomingByte-64);
            } else {
                dosisDiaria();
            }
        }
        incomingByte=0;
     } 
  }  
}

void agregarCloro(int cant){
  for(int i=1;i<=cant;i++){
    String dataSend1 = "c";
    dosisCloro();
    Serial.println(dataSend1+i);
    delay(500);
  }
}

void agregarPh(int cant){
  for(int i=1;i<=cant;i++){
    String dataSend1 = "p";
    dosisPh();
    Serial.println(dataSend1+i);
    delay(500);
  }
}

void dosisDiaria(){
  
  for(int i=1;i<=10;i++){
    String dataSend1 = "c";
    dosisCloro();
    Serial.println(dataSend1+i);
    delay(500);
  }
  
  for(int i=1;i<=7;i++){
    String dataSend1 = "p";
    dosisPh();
    Serial.println(dataSend1+i);
    delay(500);
  }
  
  for(int i=1;i<=5;i++){
    String dataSend1 = "a";
    encenderBombaAlguicida();
    delay(500);
    Serial.println(dataSend1+i);
  }
  apagarBombaAlguicida();
  
  for(int i=1;i<=3;i++){
    String dataSend1 = "t";
    encenderBombaClarificante();
    delay(500);
    Serial.println(dataSend1+i);
  }
  apagarBombaClarificante();
}

void dosisCloro(){
    for(valCl=0;valCl<=180;valCl++){
    servoCloro.write(valCl);
    delay(4);
  }
  for(valCl=180;valCl>=0;valCl--){
    servoCloro.write(valCl);
    delay(4);
  }
}

void dosisPh(){
    digitalWrite(6,HIGH);
    delay(500);
    digitalWrite(6,LOW);
}

void encenderBombaAlguicida(){
    digitalWrite(9,HIGH);
}

void apagarBombaAlguicida(){
    digitalWrite(9,LOW);
}

void encenderBombaClarificante(){
    digitalWrite(2,HIGH);
}

void apagarBombaClarificante(){
    digitalWrite(2,LOW);
}


int incomingByte=0;

void setup() {
  // put your setup code here, to run once:
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
    Serial.println(dataSend1+i);
    delay(500);
  }
}

void agregarPh(int cant){
  for(int i=1;i<=cant;i++){
    String dataSend1 = "p";
    Serial.println(dataSend1+i);
    delay(500);
  }
}

void dosisDiaria(){
  for(int i=1;i<=10;i++){
    String dataSend1 = "c";
    Serial.println(dataSend1+i);
    delay(500);
  }
  for(int i=1;i<=7;i++){
    String dataSend1 = "p";
    Serial.println(dataSend1+i);
    delay(500);
  }
  for(int i=1;i<=5;i++){
    String dataSend1 = "a";
    Serial.println(dataSend1+i);
    delay(500);
  }
  for(int i=1;i<=3;i++){
    String dataSend1 = "t";
    Serial.println(dataSend1+i);
    delay(500);
  }
}

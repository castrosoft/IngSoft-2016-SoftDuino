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
            if((incomingByte-64)<=63)){
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
  for(int i=0;i<=cant;i++){
    Serial.write(i);
    delay(2000);
  }
}

void agregarPh(int cant){
  for(int i=0;i<=cant;i++){
    Serial.write(i);
    delay(2000);
  }
}

void dosisDiaria(){
  for(int i=0;i<=10;i++){
    Serial.write(i);
    delay(2000);
  }
}

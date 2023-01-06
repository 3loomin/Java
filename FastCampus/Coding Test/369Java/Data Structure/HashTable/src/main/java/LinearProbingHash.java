public class LinearProbingHash {
    public Slot[] hashTable;
    public LinearProbingHash(Integer size){
        this.hashTable = new Slot[size];
    }

    public class Slot{
        String key;
        String value;
        Slot(String key, String value){
            this.value = value;
            this.key = key;
        }
    }


    public Integer hashFunc(String key){
        return (int)(key.charAt(0))%this.hashTable.length;
    }

    public boolean saveData(String key, String value){
        Integer address = this.hashFunc(key);
        if(this.hashTable[address] != null){
           if(this.hashTable[address].key == key){
               this.hashTable[address].value = value; //update
               return true;
           } else {
               Integer currAddress = address + 1;
               while (this.hashTable[currAddress] != null){
                   if(this.hashTable[currAddress].key == key){
                       this.hashTable[currAddress].value = value;
                       return true;
                   } else {
                       currAddress++;
                       if(currAddress == hashTable.length){
                           return false;
                       }
                   }
               }
               this.hashTable[currAddress] = new Slot(key, value);
               return true;
           }
        } else {
            this.hashTable[address] = new Slot(key, value);
        }
        return true;
    }



    public String getData(String key){
        Integer address = this.hashFunc(key);
        if(this.hashTable[address] != null){
            if(this.hashTable[address].key == key){
                return this.hashTable[address].value;
            } else {
                Integer currAddress = address + 1;
                while(this.hashTable[currAddress] != null){
                    if(this.hashTable[currAddress].key == key){
                        return this.hashTable[currAddress].value;
                    } else {
                        currAddress++;
                        if(currAddress ==hashTable.length){
                            return null;
                        }
                    }
                }
                return null;
            }
        } else{
            //앖을 때
            return null;
        }
    }

}
